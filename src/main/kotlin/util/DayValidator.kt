package util

import java.lang.NumberFormatException
import java.lang.RuntimeException

object DayValidator {

    @Throws(RuntimeException::class)
    fun validateDay(day: Int) {
        if (day !in 1..25) throw RuntimeException("Day must be between 1 and 25")
    }

    @Throws(IllegalArgumentException::class)
    fun validateDay(day: String) {
        try {
            day.toInt()
        } catch (nfe: NumberFormatException) {
            throw IllegalArgumentException("$day results in ${nfe.message}")
        }
    }

}