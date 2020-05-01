package Labka

object RemoveDuplicates {

  def removeDuplicates(xs: List[Int]): List[Int] =
    removeDuplicatesWithTailRec(xs, Set.empty, List.empty)

  @scala.annotation.tailrec
  def removeDuplicatesWithTailRec(remaining: List[Int], seen: Set[Int], acc: List[Int]): List[Int] = {
    remaining match {
    case Nil => acc
    case head :: tail => {
      if (!seen.contains(head)) removeDuplicatesWithTailRec(tail, seen + head, acc :+ head)
      else removeDuplicatesWithTailRec(tail, seen, acc)
    }
    }
  }


  def removeDuplicatesSimple(xs: List[Int]): List[Int] ={
    val xS=xs.distinct
    xS
  }
}
