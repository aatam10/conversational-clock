package serenitylabs.tutorials;

import java.time.LocalTime;

import static java.lang.String.format;

class SystemTime {

    /**
     * @return the hour of the day a 24-hour format
     */
    public int hour() {
        return now().getHour();
    }

    /**
     * @return the minute of the hour
     */
    public int minute() {
        return now().getMinute();
    }

    @Override
    public String toString() {
        return format("%01d:%01d", hour(), minute());
    }

    private LocalTime now() {
        return LocalTime.now();
    }
}
