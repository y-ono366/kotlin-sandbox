class rat(num:Int,den:Int) {
  init{
    require(den != 0,{"fuck den is not null"})
  }
  private val g by lazy {gcd(Math.abs(num), Math.abs(den))}
  val next_num: Int by lazy {num/g}
  val next_dem: Int by lazy {den/g}
  fun plus(that: rat): rat =reda
    rat(
      next_num*that.next_num + next_dem*that.next_dem,
      next_dem*that.next_dem
    )
  override fun toString(): String = "${next_num}/${next_dem}"
  tailrec private fun gcd(a:Int,b:Int) :Int =
    if (b === 0) a
    else gcd(b,a%b)
}
