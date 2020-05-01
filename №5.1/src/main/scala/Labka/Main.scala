package Labka

object Main extends App {
 // Часть 1
 println("Перевернуть число")
 println("Введите число, которое нужно перевернуть")
 val input=scala.io.StdIn.readInt()
  println(NumberReverse.revWithTailRec(input))// реализация реверса через хвостовую рекурсию
  println(NumberReverse.revWithCycle(input))// реализация реверса через цикл
  println(NumberReverse.revSimple(input))// реализация реверса через преобразование к строке
 /**
  *
  *
  */
  // Часть 2
 println("Сократить повторяющиеся элементы в списке")
 val xs = List(0,1,2,3,4,6,3,2,7,0,2,2)
 println(xs)
 println(RemoveDuplicates.removeDuplicates(xs))
 println(RemoveDuplicates.removeDuplicatesSimple(xs))



}



