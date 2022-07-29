package tomasz.kopycinski.data.converter

import org.junit.Assert
import org.junit.Test
import java.util.Date

class DateConverterTest {

    @Test
    fun createsCorrectDate() {
        val testTimestamp: Long = 1
        val date = DateConverter().fromTimestamp(testTimestamp)

        Assert.assertEquals(testTimestamp, date?.time)
    }

    @Test
    fun createsCorrectTimestamp() {
        val testTimestamp: Long = 1
        val testDate = Date(testTimestamp)

        val newTimestamp = DateConverter().dateToTimestamp(testDate)

        Assert.assertEquals(testTimestamp, newTimestamp)
    }
}
