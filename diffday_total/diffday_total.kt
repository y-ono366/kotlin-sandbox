
fun main(args: Array<String>) {
  val total:Int = 300000
  println()
}

/*残りの数値をたたく*/
fun getRemainingAmount(total:Int):Int {
    val prefs = getSharedPreferences("HMONEY_FILE", Activity.MODE_PRIVATE)
    var amount:Int = prefs.getInt("amount",0)
    return amount - total
}
