package com.jdc.toru.collection;

import java.util.ArrayDeque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class DDequeDataTest extends junitConfig{
	private ArrayDeque<String> deque;
	
	
	@BeforeEach
	 void addData() {
		deque = data.useDeque();
		deque.addLast("James");
		deque.addFirst("Willan");
		deque.add("John");
		deque.addFirst("Andrew");
		deque.addLast("Mary");
		deque.add("Kelvin");
		deque.pop();
	 }
	
	@Test
	@Order(1)
	void showData() {
		for(String s :deque) {
			System.out.println(s);
		}
	}
	
}
