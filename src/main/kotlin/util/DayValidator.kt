package util

object DayValidator {

    @Throws(AdventException::class)
    fun validateDay(day: Int) {
        if (day !in 1..25) throw AdventException("Day must be between 1 and 25")
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

class AdventException(s: String) : Throwable(s)
