class Rational(val n: Int, var d: Int){
  init {
    // 分母が0のとき例外を投げる
    require(d != 0,{"例外デース"})
    // 分母がnullのとき例外を投げる
    requireNotNull(d,{"Nullデース"})
  }
  // 最大公約数を計算する
  private val g = gcd(Math.abs(n), Math.abs(d))

  // 分子、分母を最大公約数で割る
  val num: Int = n / g
  val den: Int = d / g

  // toStringをオーバーライドして分数を返す
  override fun toString(): String = "${num}/${den}"

  // 再帰的に最大公約数を求める
  tailrec private fun gcd(a: Int, b: Int): Int =
  if ( b == 0 ) a
  else gcd(b, a % b)
}

fun main(args: Array<String>){
  var half = Rational(4,300)
  println(half)
}
