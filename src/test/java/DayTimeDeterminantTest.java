import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import static com.bohdanov_roman.DayTimeDeterminant.*;

public class DayTimeDeterminantTest {

    /*! Tests check method returned values matching to the constants below
    instead of the matching to the 'message_resource'.
    And
    Tests use hard-coded values of hours instead
    of constants in DayTimeDeterminant class.
    Thus, changing the values of resources or constants will fail the tests !*/
    private static final String MORNING_MESSAGE_EN = "Good morning, World!";
    private static final String DAY_MESSAGE_EN = "Good day, World!";
    private static final String EVENING_MESSAGE_EN = "Good evening, World!";
    private static final String NIGHT_MESSAGE_EN = "Good night, World!";
    private static final String MORNING_MESSAGE_RU = "Доброе утро, Мир!";
    private static final String DAY_MESSAGE_RU = "Добрый день, Мир!";
    private static final String EVENING_MESSAGE_RU = "Добрый вечер, Мир!";
    private static final String NIGHT_MESSAGE_RU = "Доброй ночи, Мир!";
    private String expectedMessage;
    private String actualMessage;

    @After
    public void cleanVariables() {
        expectedMessage = null;
        actualMessage = null;
    }

    @Test
    public void positiveTestMorningMessage() throws Exception {
        if (Locale.getDefault().getLanguage().equals("ru")) {
            expectedMessage = MORNING_MESSAGE_RU;
        } else {
            expectedMessage = MORNING_MESSAGE_EN;
        }
        for (int i = 6; i < 9; i++) {
            actualMessage = partOfDay(i);
            Assert.assertEquals(expectedMessage, actualMessage);
        }
    }

    @Test
    public void positiveTestDayMessage() throws Exception {
        if (Locale.getDefault().getLanguage().equals("ru")) {
            expectedMessage = DAY_MESSAGE_RU;
        } else {
            expectedMessage = DAY_MESSAGE_EN;
        }
        for (int i = 9; i < 19; i++) {
            actualMessage = partOfDay(i);
            Assert.assertEquals(expectedMessage, actualMessage);
        }
    }

    @Test
    public void positiveTestEveningMessage() throws Exception {
        if (Locale.getDefault().getLanguage().equals("ru")) {
            expectedMessage = EVENING_MESSAGE_RU;
        } else {
            expectedMessage = EVENING_MESSAGE_EN;
        }
        for (int i = 19; i < 23; i++) {
            actualMessage = partOfDay(i);
            Assert.assertEquals(expectedMessage, actualMessage);
        }
    }

    @Test
    public void positiveTestNightMessage() throws Exception {
        if (Locale.getDefault().getLanguage().equals("ru")) {
            expectedMessage = NIGHT_MESSAGE_RU;
        } else {
            expectedMessage = NIGHT_MESSAGE_EN;
        }
        actualMessage = partOfDay(23);
        Assert.assertEquals(expectedMessage, actualMessage);

        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(expectedMessage, actualMessage);
            actualMessage = partOfDay(i);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeTestNightMessage() throws Exception {
        int invalidHour = 500;
        actualMessage = partOfDay(invalidHour);
    }
}
