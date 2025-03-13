package com.jdc.toru.collection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class junitConfig {
	static CollectionData data;
		
	@BeforeAll
	static void init() {
		data = new CollectionData();
	}
}
