package com.jdc.toru.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TemporalAmountTest {
	
	@Test
	void useBetweenWithPeriodAndDuration() {
		var p1 = Period.between(LocalDate.now(),LocalDate.of(2025, 4, 13) );
		System.out.println(p1.getMonths()+" Month"+"\t"+p1.getDays()+" Days");
		
		var d = Duration.between(LocalTime.of(9, 30),LocalTime.now());
		//System.out.println(d.get(ChronoUnit.SECONDS)/60 +" Minutes");
		System.out.println(Math.divideExact(d.getSeconds(), 60) +" Minutes");
		System.out.println(d.toMinutes());  //a paw ka lo a shay ma yay pe .to nae yay lon ya but only in duration
		
	}
	
	
	@Test
	@Disabled
	void durationTest() {
		var d1 = Duration.ofDays(10);
		System.out.println(d1);
		
		var lt = d1.addTo(LocalDateTime.now());
		System.out.println(lt);	
	}
	
	@Test
	@Disabled
	void periodTest() {
		var p1 = Period.ofMonths(10);
		System.out.println(p1);
		
		var ld = p1.addTo(LocalDate.now());
		System.out.println(ld);
	}
}
