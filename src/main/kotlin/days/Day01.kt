package days

class Day01 : Day(1) {

    override fun partOne() : Any {
        return inputAsList.map { calculateRequiredFuel(it.toInt()) }.sum()
    }

    fun calculateRequiredFuel(mass: Int) : Int {
        return mass / 3 - 2
    }

    fun calculateRequiredFuelIncludingItsOwnMass(mass: Int) : Int {
        val fuel = calculateRequiredFuel(mass)
        if (fuel <= 0) return 0
        return fuel + calculateRequiredFuelIncludingItsOwnMass(fuel)
    }

    override fun partTwo(): Any {
        return inputAsList.map { calculateRequiredFuelIncludingItsOwnMass(it.toInt()) }.sum()
    }

}