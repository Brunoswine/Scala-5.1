package Labka

object NumberReverse {

  def revWithTailRec(inputNumber: Int): Int = {
    revIter(inputNumber, 0)
  }

   @scala.annotation.tailrec
   def revIter(inputNumber: Int, current: Int): Int = {
    if (inputNumber == 0)
        current
     else {        // без else компилятор ргуается на отсутстивие return
       val module = inputNumber % 10
       val reverseAfter = current * 10 + module
       val reminder = inputNumber / 10
       revIter(reminder, reverseAfter)
     }
  }

  def revWithCycle(inputNumber: Int): Int = {
    var i = inputNumber
    var current = 0
    while (i > 0) {
      val module = i % 10
      current = current * 10 + module
      i = i / 10
    }
    current
  }


  def revSimple(inputNumber:Int): String ={
    val string =Integer.toString(inputNumber)
    val revString=string.reverse
    revString
  }

}