package com.jdc.toru.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.toru.trycatchWithThrow.TryCatchWithThrowData;

public class DTryCatchWithThrowTest {
	
	private static TryCatchWithThrowData data;
	
	@BeforeAll
	static void init() {
		data = new TryCatchWithThrowData();
	}
	
	@Test
	void testGetMessage() {
		data.useMessage();
	}
}
