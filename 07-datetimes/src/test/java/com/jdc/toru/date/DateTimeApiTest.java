package com.jdc.toru.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTimeApiTest {
	
	@Test
	void testInstantToHuman() {
		Instant i1 = Instant.now();
		ZonedDateTime zdt = i1.atZone(ZoneId.of("Asia/Yangon"));
		System.out.println(zdt);
		
		OffsetDateTime zdt1 = i1.atOffset(ZoneOffset.ofHours(5));
		System.out.println(zdt1);
		
	}

	@Test
	@Disabled
	void testDateHumanToInstant() {
		//must have time and zone or offset
		//Human time
		LocalDateTime date = LocalDateTime.now(); // obj sout ma ya
		System.out.println(date);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		
		//(machine time)Instance Time
		Instant i1 = date.toInstant(ZoneOffset.of("+06:30")); //String moh  a pyae a sone yay pay ya 6:30 so ma ya
		System.out.println(i1);
		
		Instant i2 = zdt.toInstant();
		System.out.println(i2);
		
		Instant i3 = odt.toInstant();
		System.out.println(i3);
	}
}

 final class Human {
	private static Human instance;

	private Human() {
	}

	public static Human getInstance() {

		synchronized (instance) {
			if (null == instance) {
				instance = new Human();
			}
		}
		return instance;
	}

}
