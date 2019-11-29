package util

import util.DayValidator.validateDay
import java.io.File

object TextFileOutput {

    fun asString(day: Int): String = getFile(day).readText()

    fun asList(day: Int): List<String> = getFile(day).readLines()

    private fun getFile(day: Int): File {
        validateDay(day)
        return File(javaClass.classLoader.getResource("day_${day.toString().padStart(2, '0')}.txt")!!.toURI())
    }

}