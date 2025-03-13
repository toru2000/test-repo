package com.jdc.toru.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.toru.custom.CustomExceptionData;
import com.jdc.toru.custom.MyUnCheckException;

public class ECustomException {
	
	static CustomExceptionData data;
	
	@BeforeAll
	static void init() {
		data = new CustomExceptionData();
		
	}
	
	@Test
	void testException() { 
		
		
		assertThrows(MyUnCheckException.class,() -> data.getMyUnCheckException(""));
		assertThrows(MyUnCheckException.class,() -> data.changeCheckToUncheck(null));
		assertThrows(MyUnCheckException.class,() -> data.getMyCheckException(" "));
	}
}
