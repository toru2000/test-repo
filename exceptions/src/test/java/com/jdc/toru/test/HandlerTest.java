package com.jdc.toru.test;

import org.junit.jupiter.api.Test;

import com.jdc.toru.handler.Handler;

public class HandlerTest {
	
	@Test
	void testName() {
		Handler handle=new Handler();
		handle.useName();
	}
}
