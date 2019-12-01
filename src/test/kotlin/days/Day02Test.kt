package days

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day02Test {

    @Test
    fun validatePartOne() {
        assertThat(Day02().partOne()).isEqualTo("foo")
    }

    @Test
    fun validatePartTwo() {
        assertThat(Day02().partTwo()).isEqualTo("bar")

    }

}