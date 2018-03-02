package com.example.Higher_Order_Functions

import org.scalatest.{FlatSpec, Matchers}

class FunctionsSampleTest extends FlatSpec with Matchers {

  "square()" should "return square of given number" in {
    FunctionsSample.square(2) should be(4)
    FunctionsSample.square(10) should be(100)
  }

  "func()" should "return a function" in {
    FunctionsSample.func() shouldBe((_:Int) => Int)
  }

}
