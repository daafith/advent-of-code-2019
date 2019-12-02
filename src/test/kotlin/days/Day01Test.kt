package days

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun validatePartOne() {
        assertThat(Day01().requiredFuel(12)).isEqualTo(2)
        assertThat(Day01().requiredFuel(14)).isEqualTo(2)
        assertThat(Day01().requiredFuel(1969)).isEqualTo(654)
        assertThat(Day01().requiredFuel(100756)).isEqualTo(33583)
    }

    @Test
    fun validatePartTwo() {
        assertThat(Day01().requiredFuelCorrected(14)).isEqualTo(2)
        assertThat(Day01().requiredFuelCorrected(1969)).isEqualTo(966)
        assertThat(Day01().requiredFuelCorrected(100756)).isEqualTo(50346)
    }

}