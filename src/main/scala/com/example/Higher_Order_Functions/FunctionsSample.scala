package com.example.Higher_Order_Functions

object FunctionsSample {

  //def square(n:Int) = {???}
  def square(n:Int) = {n*n}

  //def func(): Any = ???
  def func():(Int)=>Int = {
    def intoString(n:Int):Int = {
      n
    }
    intoString
  }
}
