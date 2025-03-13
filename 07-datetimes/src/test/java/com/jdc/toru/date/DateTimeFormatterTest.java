package com.jdc.toru.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class DateTimeFormatterTest {
	
	@Test
	void test() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("'Date :'MM-dd-yyyy 'Time :'hh:mm:ss a");//format cha tae a pine
		LocalDate ld = LocalDate.parse("Date :02-14-1999 Time :04:20:11 AM",df); //pyan thone tae a pine
		System.out.println(ld);
		
		LocalDateTime lt = LocalDateTime.parse("Date :02-14-1999 Time :04:20:11 PM",df);
		System.out.println(lt);
	}
}
