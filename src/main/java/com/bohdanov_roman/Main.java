package com.bohdanov_roman;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class Main {
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