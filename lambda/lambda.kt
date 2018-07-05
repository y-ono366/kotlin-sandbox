fun main(args: Array<String>) {
  var square:(Int)-> Int= { i: Int ->
    i*i
  }

  println(square(5))

  //lambdaで引数が1つのときに引数it使える
  var square2:(Int)-> Int = {
    it*it
  }

  println(square2(10))

  //型推論
  var square3:(Int)->Int = { i ->
    i*i
  }
  println(square3(50))
}
