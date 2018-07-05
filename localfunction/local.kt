fun sum(numbers: List<Long>): Long {
  tailrec fun go(numbers: List<Long>,acc: Long): Long = 
    if(numbers.isEmpty()) acc
    else go(numbers.drop(1),acc+numbers.first())
  return go(numbers,0)
}
