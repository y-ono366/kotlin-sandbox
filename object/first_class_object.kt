fun square(i:Int): Int = i*i

fun main(args: Array<String>) {
  //型指定 (引数)->返り値
  var testobject:(Int)-> Int= ::square
  println(testobject(5))
}
