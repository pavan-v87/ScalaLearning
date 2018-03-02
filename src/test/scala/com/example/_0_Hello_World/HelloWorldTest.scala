package com.example._0_Hello_World

import org.scalatest.{FlatSpec, Matchers}

class HelloWorldTest extends FlatSpec with Matchers{

  "greet(personName) function" should "say Hello to person" in {
    val helloWorld = new HelloWorld
    val name = "Pavan"
    helloWorld.greet(name) should be(s"Hello Pavan")
  }

}
