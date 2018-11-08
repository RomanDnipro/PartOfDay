package com.bohdanov_roman;

import org.apache.log4j.Logger;

import java.util.ResourceBundle;

public class DayTimeDeterminant {
    private static final org.apache.log4j.Logger LOG = Logger.getLogger(DayTimeDeterminant.class);
    public static final int FIRST_HOUR_OF_MORNING = 6;
    public static final int LAST_HOUR_OF_MORNING = 9;
    public static final int FIRST_HOUR_OF_DAY = LAST_HOUR_OF_MORNING;
    public static final int LAST_HOUR_OF_DAY = 19;
    public static final int FIRST_HOUR_OF_EVENING = LAST_HOUR_OF_DAY;
    public static final int LAST_HOUR_OF_EVENING = 23;
    public static final int FIRST_HOUR_OF_NIGHT = LAST_HOUR_OF_EVENING;
    public static final int LAST_HOUR_OF_NIGHT = FIRST_HOUR_OF_MORNING;
    public static final int MIDNIGHT = 0;

    public static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("message_resource");
    public static final String MORNING_MESSAGE = RESOURCE_BUNDLE.getString("morningMessage");
    public static final String DAY_MESSAGE = RESOURCE_BUNDLE.getString("dayMessage");
    public static final String EVENING_MESSAGE = RESOURCE_BUNDLE.getString("eveningMessage");
    public static final String NIGHT_MESSAGE = RESOURCE_BUNDLE.getString("nightMessage");
    public static final String ERROR_MESSAGE = RESOURCE_BUNDLE.getString("errorMessage");
    public static final String PROGRAM_FINISHED_MESSAGE = RESOURCE_BUNDLE.getString("programFinishedMessage");
    public static final String PROGRAM_STARTS_MESSAGE = RESOURCE_BUNDLE.getString("programStartsMessage");

    public static String partOfDay(int hour) throws IllegalArgumentException {
        LOG.info("partOfDay is starting");
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
