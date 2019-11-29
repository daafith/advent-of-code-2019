package util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class TextFileOutputTest {

    private val day = 1

    @Test
    fun shouldProduceNonEmptyOutputs() {
        assertAll(
            { assertThat(TextFileOutput.asString(day)).isNotEmpty() },
            { assertThat(TextFileOutput.asList(day)).isNotEmpty() }
        )
    }

}