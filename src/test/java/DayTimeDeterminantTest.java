import org.junit.Assert;
import org.junit.Test;

import static com.bohdanov_roman.DayTimeDeterminant.*;

public class DayTimeDeterminantTest {

    @Test
    public void testMorningMessage() throws Exception {
        String actualMessage;
        String expectedMessageFromResources = MORNING_MESSAGE;
        for (int i = FIRST_HOUR_OF_MORNING; i < LAST_HOUR_OF_MORNING; i++) {
            actualMessage = partOfDay(i/*, RESOURCE_BUNDLE*/);
            Assert.assertEquals(actualMessage, expectedMessageFromResources);
        }
    }

    @Test
    public void positiveMorningTestPartOfDay() {
        String actualMessage = partOfDay(6/*, RESOURCE_BUNDLE*/);
        String expectedMessageFromResources = RESOURCE_BUNDLE.getString("morningMessage");

        Assert.assertEquals(actualMessage, expectedMessageFromResources);
    }

}
