package com.chen.spark.worker

import java.util.UUID

import akka.actor.{Actor, ActorSelection}
import com.chen.spark.commons.WorkerRegisterMessage

import scala.util.Random

object WorkerActor extends Actor {


  private var masterActorRef: ActorSelection = _
  private var workerId: String = _
  private var cpu: Int = _
  private var memory: Int = _
  private val cpu_list = List(1, 3, 4, 6, 8)
  private val mem_list = List(512, 1024, 2048, 4096)


  override def preStart(): Unit = {
    masterActorRef = context.actorSelection("akka.tcp://actorSystem@127.0.0.1:7000/user/masterActor")
    workerId = UUID.randomUUID().toString
    val rand = new Random()
    cpu = cpu_list(rand.nextInt(cpu_list.length))
    memory = mem_list(rand.nextInt(mem_list.length))

    val registerMessage: WorkerRegisterMessage = WorkerRegisterMessage(workerId, cpu, memory)


  }

  override def receive: Receive = ???
}
