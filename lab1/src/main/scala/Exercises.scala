object Exercises {
  // 1. Double Elements
  def doubleElements(lst: List[Int]): List[Int] = {
    ???
  }

  // 2. Filter Odd Numbers
  def filterOddNumbers(lst: List[Int]): List[Int] = {
    def isOdd(x: Int): Boolean = (x % 2 != 0)
    lst.filter(isOdd)
  }

  // 3. Higher-Order Function
  def applyFunction[A, B](f: A => B, lst: List[A]): List[B] = {
    ???
  }
}
