package com.jdc.toru.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CQueueDataTest extends junitConfig{
	private static Queue<String> queue;
	
	@Test
	@Order(4)
	void queryElementVsPeekTest() {
		assertEquals("Aung Aung", queue.element());
		assertEquals("Aung Aung", queue.peek());
		
	
		queue.clear();
		
		assertThrows(NoSuchElementException.class, () -> queue.element());
		assertNull(queue.peek());		
	}
	
	@Test
	@Order(3)
	//FIFO
	void queueRemoveVsPollTest() {
		assertEquals("Aung Aung",queue.remove());
		assertEquals(3, queue.size());
		
		assertEquals("Andrew",queue.poll());
		assertEquals(2, queue.size());
		queue.poll();
		queue.remove();
		assertEquals(0, queue.size());
		
		assertThrows(NoSuchElementException.class, () -> queue.remove());
		assertNull(queue.poll());
		
	}
	
	@Test
	@Order(2)
	void queueAddVsOfferTest() {
		assertEquals(4, queue.size());
		assertThrows(IllegalStateException.class,() -> queue.add("Jack")); 
		queue.offer("Jack");
		assertEquals(4, queue.size());
	}
	
	@BeforeEach 
	@Order(1)
	void queueAddData() {
	queue = data.useQueue("block", 4);
	queue.addAll(List.of("Aung Aung","Andrew"));
	queue.add("William");
	queue.offer("James");

	}
}
