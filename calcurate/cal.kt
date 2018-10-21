fun main(args: Array<String>) {
  val total :Long = 10000
  val days: String = "8"

  var hourSpeed:(Long,String)-> Long = { a,day ->
    a / day.toLong() / 24
  }
  println(hourSpeed(total,days))
}
