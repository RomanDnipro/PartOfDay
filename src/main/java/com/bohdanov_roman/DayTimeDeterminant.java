package com.bohdanov_roman;

import java.util.ResourceBundle;

import static com.bohdanov_roman.Main.loggerToFile;

public class DayTimeDeterminant {
    private static final int FIRST_HOUR_OF_MORNING = 6;
    private static final int LAST_HOUR_OF_MORNING = 9;
    private static final int FIRST_HOUR_OF_DAY = LAST_HOUR_OF_MORNING;
    private static final int LAST_HOUR_OF_DAY = 19;
    private static final int FIRST_HOUR_OF_EVENING = LAST_HOUR_OF_DAY;
    private static final int LAST_HOUR_OF_EVENING = 23;

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("message_resource");
    private static final String MORNING_MESSAGE = RESOURCE_BUNDLE.getString("morningMessage");
    static final String PROGRAM_STARTS_MESSAGE = RESOURCE_BUNDLE.getString("programStartsMessage");
    static final String PROGRAM_FINISHED_MESSAGE = RESOURCE_BUNDLE.getString("programFinishedMessage");
    private static final String NIGHT_MESSAGE = RESOURCE_BUNDLE.getString("nightMessage");
    private static final String EVENING_MESSAGE = RESOURCE_BUNDLE.getString("eveningMessage");
    private static final String DAY_MESSAGE = RESOURCE_BUNDLE.getString("dayMessage");

    /**
     * @return welcome message to User-World depends on daytime and lang
     */
    public static String partOfDay(int hour) throws IllegalArgumentException {
        loggerToFile.info("partOfDay is executed...");
        if ((hour < 0) || (hour > 23)) {
            throw new IllegalArgumentException("hour argument should not be less 0 and more then 23");
        }

        if ((hour >= FIRST_HOUR_OF_MORNING) && (hour < LAST_HOUR_OF_MORNING)) {
            return MORNING_MESSAGE;
        }
        if ((hour >= FIRST_HOUR_OF_DAY) && (hour < LAST_HOUR_OF_DAY)) {
            return DAY_MESSAGE;
        }
        if ((hour >= FIRST_HOUR_OF_EVENING) && (hour < LAST_HOUR_OF_EVENING)) {
            return EVENING_MESSAGE;
        }
        return NIGHT_MESSAGE;
    }
}
