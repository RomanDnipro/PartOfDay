import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static com.bohdanov_roman.DayTimeDeterminant.*;

public class DayTimeDeterminantTest {
    private String expectedMessageFromResources;
    private String actualMessage;

    @After
    public void cleanVariables() {
        expectedMessageFromResources = null;
        actualMessage = null;
    }

    @Test
    public void positiveTestMorningMessage() throws Exception {
        expectedMessageFromResources = MORNING_MESSAGE;
        for (int i = FIRST_HOUR_OF_MORNING; i < LAST_HOUR_OF_MORNING; i++) {
            actualMessage = partOfDay(i);
            Assert.assertEquals(expectedMessageFromResources, actualMessage);
        }
    }

    @Test
    public void positiveTestDayMessage() throws Exception {
        expectedMessageFromResources = DAY_MESSAGE;
        for (int i = FIRST_HOUR_OF_DAY; i < LAST_HOUR_OF_DAY; i++) {
            actualMessage = partOfDay(i);
            Assert.assertEquals(expectedMessageFromResources, actualMessage);
        }
    }

    @Test
    public void positiveTestEveningMessage() throws Exception {
        expectedMessageFromResources = EVENING_MESSAGE;
        for (int i = FIRST_HOUR_OF_EVENING; i < LAST_HOUR_OF_EVENING; i++) {
            actualMessage = partOfDay(i);
            Assert.assertEquals(expectedMessageFromResources, actualMessage);
        }
    }

    @Test
    public void positiveTestNightMessage() throws Exception {
        expectedMessageFromResources = NIGHT_MESSAGE;
        actualMessage = partOfDay(FIRST_HOUR_OF_NIGHT);
        Assert.assertEquals(expectedMessageFromResources, actualMessage);

        for (int i = MIDNIGHT; i < FIRST_HOUR_OF_MORNING; i++) {
            Assert.assertEquals(expectedMessageFromResources, actualMessage);
            actualMessage = partOfDay(i);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeTestNightMessage() throws Exception {
        int invalidHour = 500;
        actualMessage = partOfDay(invalidHour);
    }
}
