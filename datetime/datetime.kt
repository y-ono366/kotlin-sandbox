import java.util.Calendar
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
  val beforeDate = "2018-06-20"
  println(getDiffDay(beforeDate))
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
