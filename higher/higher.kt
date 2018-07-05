fun firstK(str:String):Int {
  tailrec fun go(str:String,index:Int): Int =
  when {
    str.isEmpty() -> -1
    str.first() == 'K' -> index
    else -> go(str.drop(1),index+1)
  }
  return go(str,0)
}


fun main(args: Array<String>) {
  var obj:(String)-> Int = ::firstK
  println(obj("FUCK"))
}
