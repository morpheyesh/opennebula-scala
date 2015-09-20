package com.one


import org.scalatest.Suite

class rpcApiTest extends Suite {
println("asdasdasdasd")
def rpcClientCreation() {

}

val client = new RpcClient("http", "localhost", 3000, "/RPC2", "yesh", "test")
println("endedd---?")
println(client)
client.Call()


}
