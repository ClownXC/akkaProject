package com.chen.spark.commons

/**
 * Worker 提交注册信息的样例类
 * @param workerId: WorkerActor 的 Id
 * @param cpu: 当前 WorkerActor 的 CPU 核数
 * @param memory: 当前 WorkerActor 的内存大小(MB)
 */
case class WorkerRegisterMessage(workerId: String, cpu: Int, memory: Int)


case object RegisterSuccessMessage

/**
 * 心跳信息
 * @param workerId
 * @param cpu
 * @param memory
 */
case class WorkerHeartBeatMessage(workerId: String, cpu: Int, memory: Int)