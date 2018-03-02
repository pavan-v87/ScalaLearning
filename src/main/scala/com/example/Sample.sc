object Hello {
  print("Hello World !!")
  1+2

  val greaterThan2Predicate = (x:Int) => x>2
  List(1,2,3).filter(greaterThan2Predicate)

  def radius = 2 * 3.1416

  def square(x: Int) = x * x
  square(2)

  def sqrtItr(guess: Double, x:Double) : Double=
    if(goodEnough(guess, x)) guess
    else sqrtItr(improve(guess, x), x)

  def goodEnough(guess: Double, x: Double) =
    abs(guess*guess - x)/x < 0.001

  def abs(n: Double)=if(n<0)-n else n

  def improve(guess: Double, x:Double)=
    (guess + x/guess)/2

  def sqrt(x:Double) = sqrtItr(1.0, x)

  sqrt(1e20)
  sqrt(1e60)
}