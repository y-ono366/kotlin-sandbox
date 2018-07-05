fun getCounter():()->Int {
  var count = 0
  return {
    count++
  }
}


fun main(args: Array<String>) {
  var obj= getCounter()
  var obj2= getCounter()
  println(obj())
  println(obj2())
  println(obj())
  println(obj2())
  println(obj())
  println(obj2())
}
