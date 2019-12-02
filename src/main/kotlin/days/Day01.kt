package days

class Day01 : Day(1) {

    override fun partOne() : Any {
        return inputAsList.map { requiredFuel(it.toInt()) }.sum()
    }

    override fun partTwo(): Any {
        return inputAsList.map { requiredFuelCorrected(it.toInt()) }.sum()
    }

    fun requiredFuel(mass: Int) : Int {
        return mass / 3 - 2
    }

    fun requiredFuelCorrected(mass: Int) : Int {
        val fuel = requiredFuel(mass)
        return when {
            fuel <= 0 -> 0
            else -> fuel + requiredFuelCorrected(fuel)
        }
    }

}