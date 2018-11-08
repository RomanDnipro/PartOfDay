package com.bohdanov_roman;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

//    Unfortunately not enough time to deal with CI
public class Main {
    // Log file located in C:\\TMP\\log_file.log , look resources/log4j.properties
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
        LOG.info(DayTimeDeterminant.PROGRAM_STARTS_MESSAGE);

        Calendar calendar = Calendar.getInstance();
        String message = null;
        try {
            message = DayTimeDeterminant.partOfDay(calendar.get(Calendar.HOUR_OF_DAY));
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e);
        }
        System.out.println(message);
        LOG.info(DayTimeDeterminant.PROGRAM_FINISHED_MESSAGE);
    }
}