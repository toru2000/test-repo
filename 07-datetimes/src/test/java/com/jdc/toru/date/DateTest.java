package com.jdc.toru.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTest {
	
	@Test
	void testAddRollAndMinusInCalender() {
		//Plus
		Calendar cl = Calendar.getInstance();
		System.out.println("Current ->"+cl.getTime());
		cl.add(Calendar.DATE, 25);
		System.out.println("ADD 25 Days -> "  + cl.getTime());
		cl.roll(Calendar.DATE, 40); 
		System.out.println("ROLL 40 Days -> " + cl.getTime());
		
		//Minus
		cl.add(Calendar.DATE,-21);
		System.out.println("Subtraction");
		System.out.println(cl.getTime());
	}
	
	@Test
	@Disabled
	void testCreateDateTimeFormatter() throws ParseException { //throw ya tr ka y2k problem
		// DateFormat df = new DateFormat(); ma ya abstract cls moh obj sout loh ma ya
		// DateFormat df = DateFormat.getDateInstance();
		
		SimpleDateFormat sp = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss SSS"); // simple class
		Date date = sp.parse("16-05-2022 24:23:23 546");
		System.out.println(date);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String str = df.format(date);
		System.out.println(str);
	}
	
	@Test
	@Disabled
	void testCreateDateWithSetter() {
		Calendar c2 = Calendar.getInstance();
		c2.setLenient(true); 
		c2.set(2022, Calendar.DECEMBER, 12);
		c2.set(Calendar.MONTH, 12);
		c2.set(Calendar.DATE, 30);
		System.out.println(c2.getTime());
	}
	
	@Test
	@Disabled
	void testCreateDateFormCalender() {
		Calendar c1 = Calendar.getInstance(); //calender ka abstract class 
		Date d1 = c1.getTime();
		System.out.println(d1);
	}

	@SuppressWarnings("deprecation")
	@Test
	@Disabled
	void testCreateDate() {
		Date date = new Date();
		System.out.println("Current Date");
		System.out.println(date);
		
		Date date2 = new Date(2023 , 11 , 01);
		System.out.println(date2);
	}
	
	
}

