package day41;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ValueRange;


public class DateDemo {

	public static void main(String[] args) {
				
		LocalDate lDate=LocalDate.now();
		
		System.out.println(lDate);
		
		System.out.println(lDate.getDayOfMonth());
		
		System.out.println(lDate.getDayOfYear());
		
		System.out.println(lDate.getDayOfWeek());
		
		System.out.println(lDate.getMonth());
		
		LocalDate yesterday = lDate.minusDays(1);
	    LocalDate tomorrow = yesterday.plusDays(2);
	    System.out.println("Today date: "+lDate);
	    System.out.println("Yesterday date: "+yesterday);
	    System.out.println("Tommorow date: "+tomorrow);
	   
	    System.out.println(lDate.isLeapYear());
	   
	    LocalDate leap=LocalDate.of(2024, 1, 1);
	    System.out.println(leap.isLeapYear());
	   
	    LocalDateTime ldt=leap.atTime(8,30,12);
	    System.out.println(ldt);
	   
	    LocalDateTime lDateTime=LocalDateTime.now();
	    System.out.println(lDateTime);
	   
	    System.out.println(lDateTime.minusHours(2));
	    System.out.println(lDateTime.plusDays(1));
	   
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");
	    LocalTime time1 = LocalTime.now(zone1);
	    System.out.println("India Time Zone: "+time1);
	    LocalTime time2 = LocalTime.now(zone2);
	    System.out.println("Japan Time Zone: "+time2);
	    long hours = ChronoUnit.HOURS.between(time1, time2);
	    System.out.println("Hours between two Time Zone: "+hours);
	    long minutes = ChronoUnit.MINUTES.between(time1, time2);
	    System.out.println("Minutes between two time zone: "+minutes);
	   
	    LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);
        LocalDateTime datetime1 = LocalDateTime.now();
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime2 = datetime1.format(format2);
        System.out.println(formatDateTime2);
        LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(1994);
        System.out.println(date);
        MonthDay month2 = MonthDay.now();
        ValueRange r1 = month2.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(r1);
        ValueRange r2 = month2.range(ChronoField.DAY_OF_MONTH);
        System.out.println(r2);
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
        Clock c2 = Clock.systemUTC();
        System.out.println(c2.instant());
        Clock c3 = Clock.systemUTC();
        Duration d = Duration.ofHours(5);
        Clock clock = Clock.offset(c3, d);
        System.out.println(clock.instant());
        LocalDateTime  ldt1 = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);
        ZoneId  india = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone11  = ZonedDateTime.of(ldt1, india);
        System.out.println("In India Central Time Zone: " + zone1);
        ZoneId  tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone22   = zone11.withZoneSameInstant(tokyo);
        System.out.println("In Tokyo Central Time Zone:"  + zone22);
        ZonedDateTime zone =ZonedDateTime.now();
        System.out.println(zone.getZone());

	}

}
