package com.jdc.toru.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AListDataTest extends junitConfig{
	
	int count;
	List<String> list = data.useList("A");
	
	
	@Test
	void useMethodInListTest() {
		List<String> List = data.useList("A");
		assertTrue(List.contains("Aung Aung"));
		assertFalse(List.containsAll(java.util.List.of("Aung Aung","James")));
		List.add("James");
		assertEquals(List.size(), 6);
		List.remove("James");
		assertFalse(List.contains("James"));
	}
	
	@Disabled
	@ParameterizedTest
	@CsvSource({"0,Aung Aung","2,Mya Mya"})
	void  selectListTest(int index,String res) {
		List<String> list = data.useList("L");
		assertEquals(res, list.get(index));
		
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings = {"a","L"})
	void showListElementTest(String str) {
		
		for(String s:data.useList("A")) {
			System.out.println("Element :" +s);
		}
		System.out.println();
	}
	
	private int createRecursive(String name) {
		if(count > 5) {
			createRecursive(name);
			if(name == list.get(count)) {
				return count;
			}
			createRecursive(name);
			count++;
		}
		return 0;
	}
}
