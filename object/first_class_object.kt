fun square(i:Int): Int = i*i

fun main(args: Array<String>) {
  var testobject = ::square
  println(testobject(5))
}
