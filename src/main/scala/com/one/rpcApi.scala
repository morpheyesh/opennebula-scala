package com.one


import com.tactix4.t4xmlrpc._
import scala.concurrent.ExecutionContext.Implicits.global


case class RpcClient(a: String, host: String, port: Int, ep: String, username: String, password: String) {

/*
** create client
*/
  val config = new XmlRpcConfig(a, host, port, ep)
  val client = new XmlRpcClient()

/*
** Call method which does RPC Calls
*/

   def Call() = {

     println("call here!")
   }

}
