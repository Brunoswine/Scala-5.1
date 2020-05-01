package Labka

import org.junit._
import org.junit.Assert.assertEquals

class MyTest {

  import NumberReverse._
  import RemoveDuplicates._

  @Test def `ReverseTailRec(Positive)`: Unit = {
    assert(revWithTailRec(321) == 123 )
  }

  @Test def `ReverseTailRec(Negative)`: Unit = {
    assert(revWithTailRec(-321) == -123 )
  }

  @Test def `ReverseCycle`: Unit = {
    assert(revWithCycle(12345) == 54321)
  }

  @Test def `ReverseSimple`: Unit = {
    assert(revSimple(123) == "321")
  }

  @Test def `RemoveTailRec`: Unit = {
    assert(removeDuplicates(List(0,1,1,1,3,5,7,1,5,9)) == List(0,1,3,5,7,9))
  }

  @Test def `RemoveSimple`: Unit = {
    assert(removeDuplicatesSimple(List(0,1,1,1,3,5,7,1,5,9)) == List(0,1,3,5,7,9))
  }

  @Rule def individualTestTimeout = new org.junit.rules.Timeout(1000)
}


