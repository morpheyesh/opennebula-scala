 package com.one


import com.tactix4.t4xmlrpc._
import scala.concurrent.ExecutionContext.Implicits.global


case class RpcClient(p: String, host: String, port: Int, path: String, username: String, password: String) {

/*
** create client
*/
  val config = new XmlRpcConfig(p, host, port, path)
  val client = new XmlRpcClient()

/*
** Call method which does RPC Calls
*/

//  def Call() = {
//     println("call here!")
  // }

}
