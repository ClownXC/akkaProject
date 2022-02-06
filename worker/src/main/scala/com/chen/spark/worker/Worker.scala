package com.chen.spark.worker

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory

object Worker {

  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("actorSystem", ConfigFactory.load())

  }

}
