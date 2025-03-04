package com.jdc.toru.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.toru.check.CheckExceptionData;

public class ACheckExceptionTest{
	
	CheckExceptionData data = new CheckExceptionData();
	
	@Test
	void fileTest() {
		String res =  data.createFile("");
		assertEquals(res,"Exit");
		
		res =  data.createFile("D:/data/");
		assertEquals(res,"IOException");
	}
}
