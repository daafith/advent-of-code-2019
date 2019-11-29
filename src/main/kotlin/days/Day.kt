package days

import util.TextFileOutput

abstract class Day(day: Int) {

    protected val inputAsList: List<String> by lazy { TextFileOutput.asList(day) }
    protected val inputAsString: String by lazy { TextFileOutput.asString(day) }

    abstract fun partOne(): Any
    abstract fun partTwo(): Any

}