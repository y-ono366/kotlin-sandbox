import java.util.Calendar
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    println(getNextDate(20))
}


fun isFirstStart():Boolean {
    val nowCalendar = Calendar.getInstance()
    val nextCalendar = Calendar.getInstance()
    nextCalendar.set(Calendar.DAY_OF_MONTH,25)

    val diff = nowCalendar.compareTo(nextCalendar)
    if(diff > 0){
        return true
    }
    return false
}


fun getNextDate(payDay:Int):String {
    val format = SimpleDateFormat("yyyy-MM-")
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.DAY_OF_MONTH,25)
    val nowDate:Int =  calendar.get(Calendar.DAY_OF_MONTH)
    if(nowDate > payDay) {
        calendar.add(Calendar.MONTH, +1)
    }
    return format.format(calendar.getTime())+payDay.toString()+" 00:00:00"
}
