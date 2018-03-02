object TailRecursionExample {
  //TailRecursion :If the last instruction involves calling itself

  def gcd(a: Int, b:Int):Int = {
    if(b==0) a else gcd(b, a%b)
  }

  gcd(14, 21)

  gcd(15, 45)

  // This is Not Tail recursion, as "n * " before call factorial(n-1)
  def factorial(n:Int):Int = {
    if(n==0) 1 else n * factorial(n-1)
  }
  factorial(4)

  // Make this tail recursive

  def factorial2(n:Int):Int = {
    def loop(accu:Int, n:Int):Int = {
      if(n==0) accu else loop(n*accu, n-1)
    }
    loop(1, 4)
  }
  factorial2(4)
}