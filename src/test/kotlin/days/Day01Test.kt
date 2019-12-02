package days

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun validatePartOne() {
        assertThat(Day01().calculateRequiredFuel(12)).isEqualTo(2)
        assertThat(Day01().calculateRequiredFuel(14)).isEqualTo(2)
        assertThat(Day01().calculateRequiredFuel(1969)).isEqualTo(654)
        assertThat(Day01().calculateRequiredFuel(100756)).isEqualTo(33583)
    }

    @Test
    fun validatePartTwo() {
        assertThat(Day01().calculateRequiredFuelIncludingItsOwnMass(14)).isEqualTo(2)
        assertThat(Day01().calculateRequiredFuelIncludingItsOwnMass(1969)).isEqualTo(966)
        assertThat(Day01().calculateRequiredFuelIncludingItsOwnMass(100756)).isEqualTo(50346)
    }

}