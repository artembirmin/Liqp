package liqp.filters.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQueries;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.HOUR_OF_DAY;
import static java.time.temporal.ChronoField.MINUTE_OF_HOUR;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.NANO_OF_SECOND;
import static java.time.temporal.ChronoField.SECOND_OF_MINUTE;
import static java.time.temporal.ChronoField.YEAR;

public class StrftimeCompatibleDate {
    private final String zoneId;

    // todo: to be removed
    public static void main(String[] args) throws ParseException {

        // https://stackoverflow.com/questions/22463062/how-to-parse-format-dates-with-localdatetime-java-8
        // https://stackoverflow.com/questions/51083083/java-zoneddatetime-parse-timestring-without-timezone
        // https://stackoverflow.com/questions/35004123/java8-zoneddatetime-with-datetimeformatter-not-recognizing-the-format
        // https://stackoverflow.com/questions/13470830/how-to-change-timezone-for-a-java-util-calendar-date

        // https://stackoverflow.com/questions/5422089/date-timezone-conversion-in-java/5422620#comment116507564_5422620

        // https://docs.python.org/3/library/datetime.html#strftime-and-strptime-behavior

        DateTimeFormatter TIMESTAMP_PARSER = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SX"))
                .toFormatter();
        TemporalAccessor accessor = TIMESTAMP_PARSER.parse("2020-12-15T23:29:59.111Z");
        System.out.println(accessor);
//        SimpleDateFormat sdf = new SimpleDateFormat("Z", Locale.ENGLISH);
//        Date res = sdf.parse("-0500");
//        System.out.println("date: " + res);
//        System.out.println("tz:" + sdf.getTimeZone().getID());

//
//        //
//
//        // https://stackoverflow.com/questions/19854768/how-to-implement-a-custom-date-format-in-java
//        // https://docs.oracle.com/javase/7/docs/api/java/text/ChoiceFormat.html
//        // https://docs.oracle.com/javase/7/docs/api/java/text/MessageFormat.html
//
//        // z - General time zone: Pacific Standard Time; PST; GMT-08:00
//        // Z - RFC 822 time zone: -0800
//        // X - ISO 8601 time zone: -08; -0800; -08:00
//
//        // ruby default time format:
//        // https://www.tutorialspoint.com/ruby/ruby_date_time.htm
//        // also test this: 2021-01-25 15:19:44 +0200
//        // general liquid info:
//        // https://shopify.github.io/liquid/filters/date/
//
//        // tester: http://strftime.net/
//
//        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzz");
//        res = sdf.parse("2020-11-03 16:40:44 Pacific Standard Time");
//
//        System.out.println(res);
//        System.out.println("tz:" + sdf.getTimeZone().getID());
//
//        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzzz");
//        res = sdf.parse("2020-11-03 16:40:44 Pacific Standard Time");
//
//        System.out.println(res);
//        System.out.println("tz:" + sdf.getTimeZone().getID());
//
//        sdf = new SimpleDateFormat("z");
//        sdf.setTimeZone(TimeZone.getTimeZone("PST"));
//        System.out.println("tz parsed: " + sdf.format(res));
//
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(res);
//        System.out.println(cal);
//        TimeZone timeZone = cal.getTimeZone();
//        System.out.println("tz: " + timeZone);
//        res = new SimpleDateFormat("yyyy-MM-dd HH:mm:s")
//                .parse("2011-23-03 16:40:44");
//        Calendar cal2 = Calendar.getInstance();
//        cal2.setTime(res);
//        timeZone = cal2.getTimeZone();
//        System.out.println("tz from empty: " + timeZone);
    }



    private final TemporalAccessor temporal;

    /**
     * Terrible fact:
     * new Date() - return timezone with taking to account the (default) timezone offset
     * @param milliseconds - the milliseconds since January 1, 1970, 00:00:00 GMT
     */
    public StrftimeCompatibleDate(long milliseconds, String timeZone) {
        this.temporal = Instant.ofEpochMilli(milliseconds);
        this.zoneId = timeZone;
    }

    public StrftimeCompatibleDate(String timeZone) {
        this.zoneId = timeZone;
        this.temporal = Instant.ofEpochMilli(0);
    }

    public StrftimeCompatibleDate() {
        this.zoneId = TimeZone.getDefault().getID();
        this.temporal = Instant.ofEpochMilli(0);;
    }

    public StrftimeCompatibleDate(long milliseconds) {
        this.zoneId = TimeZone.getDefault().getID();
        this.temporal = Instant.ofEpochMilli(milliseconds);;
    }


    public TemporalAccessor getTemporal() {
        return temporal;
    }

    public String getZoneId() {
        return zoneId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StrftimeCompatibleDate{");
        sb.append("zoneId='").append(zoneId).append('\'');
        sb.append(", date=").append(temporal);
        sb.append('}');
        return sb.toString();
    }
}