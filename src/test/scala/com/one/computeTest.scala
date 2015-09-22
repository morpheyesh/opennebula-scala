package com.one.compute


import org.scalatest.Suite
import com.one._

class computeTest extends Suite {

  val rpcClient = new RpcClient("http", "localhost", 2633, "/RPC2", "yesh", "test")
  val compute = new Compute("firstApp", "ubuntu", 0, "oneadmin:DokWikyamUt3", 2, 4, rpcClient.client, rpcClient.config)
println(compute)
compute.Create()

}
