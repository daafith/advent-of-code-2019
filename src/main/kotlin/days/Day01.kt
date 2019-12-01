package days

class Day01 : Day(1) {

    override fun partOne() : Any {
        return inputAsList.map { calculateRequiredFuel(it.toInt()) }.sum()
    }

    fun calculateRequiredFuel(mass: Int) : Int {
        return (mass / 3) - 2
    }

    override fun partTwo(): Any {
        return "foobar2"
    }

}