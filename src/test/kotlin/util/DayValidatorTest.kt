package util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import java.lang.RuntimeException

class DayValidatorTest {

    @Test
    fun shouldAllowDaysWithinRange() {
        assertAll(
            { assertThat(DayValidator.validateDay(1)).isEqualTo(Unit) },
            { assertThat(DayValidator.validateDay(25)).isEqualTo(Unit) }
        )
    }

    @Test
    fun shouldRejectDaysOutOfRange() {
        assertAll(
            { assertThrows(RuntimeException::class.java) { DayValidator.validateDay(0) } },
            { assertThrows(RuntimeException::class.java) { DayValidator.validateDay(26) } }
        )
    }

    @Test
    fun shouldAcceptIntArgument() {
        assertThat(DayValidator.validateDay("1")).isEqualTo(Unit)
    }

    @Test
    fun shouldRejectNonIntArgument() {
        assertThrows(IllegalArgumentException::class.java) { DayValidator.validateDay("e")}
    }

}