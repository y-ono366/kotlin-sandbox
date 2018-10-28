fun getNowDate(payDay:Int):String {
    val format = SimpleDateFormat("yyyy-MM-")
    val calendar = Calendar.getInstance()
    return format.format(calendar.getTime())+payDay.toString()
}

fun getBeforeDate(payDay:Int):String {
    val format = SimpleDateFormat("yyyy-MM-")
    val calendar = Calendar.getInstance()
    calendar.add(Calendar.MONTH, -1)
    return format.format(calendar.getTime())+payDay.toString()
}
