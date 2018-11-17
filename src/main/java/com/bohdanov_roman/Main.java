package com.bohdanov_roman;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class Main {

    // Log file located in C:\\TMP\\log_file.log , look resources/log4j.properties
    static final Logger loggerToFile = Logger.getLogger("APP2");
    private static final Logger loggerToConsole = Logger.getLogger("APP1");

    public static void main(String[] args) throws UnsupportedEncodingException {
        loggerToFile.info(DayTimeDeterminant.PROGRAM_STARTS_MESSAGE);

        Calendar calendar = Calendar.getInstance();
        String message = null;
        try {
            message = DayTimeDeterminant.partOfDay(calendar.get(Calendar.HOUR_OF_DAY));
        } catch (Exception e) {
            loggerToFile.error(e);
            loggerToConsole.error(e);
        }
        System.out.println(message);
        loggerToFile.info(DayTimeDeterminant.PROGRAM_FINISHED_MESSAGE);
    }
}