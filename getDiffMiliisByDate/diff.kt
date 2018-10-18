import java.util.Calendar
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    var total:Int = 150000
    println(getAverageSpeed(total))
}

fun getAverageSpeed(total:Int):Int {
    var now:String = "2018-08-10"
    var before:String = "2018-07-10"
    var diffMiliis = getDiffMiliisByDate(now,before)
    var speed:Float =  calHourSpeed(total,diffMiliis)
    return Math.round(speed)
}


fun getDiffMiliisByDate(nowDate:String,beforeDate:String):Long {
    val nowCalender = Calendar.getInstance()
    val beforeCalender = Calendar.getInstance()

    val format = SimpleDateFormat("yyyy-MM-dd")
    val parseNowDate = format.parse(nowDate)
    nowCalender.setTime(parseNowDate)

    val parseBeforeDate = format.parse(beforeDate)
    beforeCalender.setTime(parseBeforeDate)
    val diffMiliisTime =  nowCalender.getTimeInMillis() - beforeCalender.getTimeInMillis()
    return diffMiliisTime
}

fun calHourSpeed(total:Int,miliss:Long): Float {
    var hour:Float = miliss.toFloat() / 3600000
    var speed:Float = total.toFloat() / hour
    return speed
}
