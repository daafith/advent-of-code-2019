package days

class Day01 : Day(1) {

    override fun partOne() : Any {
        return inputAsList.map { calculateRequiredFuel(it.toInt()) }.sum()
    }

    override fun partTwo(): Any {
        return inputAsList.map { calculateRequiredFuelIncludingItsOwnMass(it.toInt()) }.sum()
    }

    fun calculateRequiredFuel(mass: Int) : Int {
        return mass / 3 - 2
    }

    fun calculateRequiredFuelIncludingItsOwnMass(mass: Int) : Int {
        val fuel = calculateRequiredFuel(mass)
        return when {
            fuel <= 0 -> 0
            else -> fuel + calculateRequiredFuelIncludingItsOwnMass(fuel)
        }
    }

}