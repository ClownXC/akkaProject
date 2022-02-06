package com.chen.spark.commons

/**
 * 用来保存注册成功后的 WorkerActor 的信息
 * @param workerId
 * @param cpu
 * @param memory
 * @param lastHeartBeatTime
 */
case class WorkerInfo(workerId: String, cpu: Int, memory: Int, lastHeartBeatTime: Long)
