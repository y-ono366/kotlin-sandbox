fun log(debug:Boolean = true,message:()->String) {
  if(debug) {
    println(message())
  }
}


fun main(args: Array<String>) {
  log{"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"}
  log(false){"FXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXK"}
}
