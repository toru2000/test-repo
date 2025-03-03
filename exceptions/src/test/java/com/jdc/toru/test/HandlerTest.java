package com.jdc.toru.test;

import org.junit.jupiter.api.Test;

import com.jdc.toru.handler.Handler;

public class HandlerTest {
	Handler handle=new Handler();
	
	@Test
	void testRecursive() {
		handle.useName();
	}
	//@Test
	void testName() {		
		handle.useName();
	}
	
	@Test
	void testAge() {
		handle.recursive();
	}
}
