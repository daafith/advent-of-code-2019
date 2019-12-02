package days

class Day02 : Day(2) {

    private val intCodes = inputAsString.split(",").map { it.toInt() }

    override fun partOne(): Any {
        return restoreComputerState(intCodes, 12, 2)
    }

    override fun partTwo(): Any {
        return reverseOutput(intCodes)
    }

    @Throws(IllegalArgumentException::class)
    private fun restoreComputerState(codes: List<Int>, noun: Int, verb: Int): Int {
        val state = codes.toMutableList()
        state[1] = noun
        state[2] = verb
        loop@ for (position in state.indices step 4) {
            val (opcode, operand1, operand2, dest) = state.subList(position, position + 4)
            when (opcode) {
                99 -> break@loop
                1 -> state[dest] = state[operand1] + state[operand2]
                2 -> state[dest] = state[operand1] * state[operand2]
                else -> throw IllegalArgumentException()
            }
        }
        return state[0]
    }

    @Throws(IllegalArgumentException::class)
    private fun reverseOutput(code: List<Int>): Int {
        val target = 19_690_720
        val upperBound = 100
        (0 until upperBound).forEach { noun ->
            (0 until upperBound).forEach { verb ->
                when (target) {
                    restoreComputerState(code, noun, verb) -> return upperBound * noun + verb
                }
            }
        }
        throw IllegalArgumentException()
    }
}