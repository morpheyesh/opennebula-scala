package com.one


import org.scalatest.Suite

class rpcApiTest extends Suite {
println("asdasdasdasd")
def rpcClientCreation() {

}

val client = new RpcClient("http", "localhost", 8999, "/", "yesh", "test")
println("endedd---?")
println(client.config)
println(client.client)
//client.Call(config)


}
