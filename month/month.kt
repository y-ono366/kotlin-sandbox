import java.util.Calendar
import java.text.SimpleDateFormat


fun main(args: Array<String>) {
  println(monthHourCalculation(50,30))
}

fun monthHourCalculation(hour_speed:Long,pay_day:Int):Long {
  val calendar = Calendar.getInstance()
  calendar.add(Calendar.MONTH, +1)
  val format = SimpleDateFormat("yyyy-MM-")
  val nextMonthDate = format.format(calendar.getTime()) + pay_day.toString()
  var diffDate = getDiffDay(nextMonthDate)

  var monthHourSpeed:(Long,Long)->Long = {a,day ->
    a * 24 * day
  }
  var monthHour = monthHourSpeed(hour_speed,diffDate)
  return monthHour
}


fun getDiffDay(beforeDate:String):Long {
  val nowDate = Calendar.getInstance()
  val calender = Calendar.getInstance()
  val format = SimpleDateFormat("yyyy-MM-dd")
  val date = format.parse(beforeDate)
  calender.setTime(date)
  val diffTime =  nowDate.getTimeInMillis() - calender.getTimeInMillis()
  val millis_of_day = 1000 * 60 * 60 * 24
  val diffDays = diffTime / millis_of_day
  return diffDays
}
