//First star
def getCodeFirst(input: String): Int = {
  import scala.collection.mutable.ArrayBuffer
  val listForSum = ArrayBuffer[Int]()
  for {
    i <- 0 until input.length - 1
    if input.charAt(i) == input.charAt(i + 1)
  } {
    listForSum += input.charAt(i).toString.toInt
  }
  if (input.charAt(input.length - 1) == input.charAt(0)) {
    listForSum += input.charAt(input.length - 1).toString.toInt
  }
  listForSum.sum
}

//Second star
def getCodeSecond(input: String): Int = {
  val stepsForward = input.length / 2
  val list = for {
    i <- 0 until stepsForward
    if input.charAt(i) == input.charAt(i + stepsForward)
  } yield {
    input.charAt(i).toString.toInt * 2
  }
  list.sum
}
