package com.one.compute


import com.one._
import com.tactix4.t4xmlrpc._


case class Compute(name: String, template_name: String, template_id: Int, key: String, cpu: Int, ram: Int, rpcclient: XmlRpcClient, config: XmlRpcConfig) {


  def Create() = {
    val args: List[XmlRpcDataType] = List(XmlRpcString(key), XmlRpcInt(-2), XmlRpcInt(-1), XmlRpcInt(-1) )
    val res = rpcclient.request(config, "one.templatepool.info", args)
  }
//  def Delete()



}
