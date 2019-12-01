package days

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun du() {
        assertThat(Day01().calculateRequiredFuel(12)).isEqualTo(2)
        assertThat(Day01().calculateRequiredFuel(14)).isEqualTo(2)
        assertThat(Day01().calculateRequiredFuel(1969)).isEqualTo(654)
        assertThat(Day01().calculateRequiredFuel(100756)).isEqualTo(33583)
    }



}