package com.jdc.toru.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class BSetDataTest extends junitConfig{
	
	static TreeData tree;
	
	@ParameterizedTest
	@CsvSource({"Aung Aung,Aung Aung","James,Not match name"})
	void useMethodInSetTest(String name,String res) {
		Set<String> set = data.useSet("H");
		
		String str = set.contains(name) ? name : "Not match name";
		assertEquals(str, res);
	}
	
	@Disabled
	@Test
	void treeSetTest() {
		TreeSet<Person> set = tree.useTreeSet();
		for(Person p :set) {
			System.out.println(p.name()+"\t"+p.age());
		}
	}
	
	
	@Disabled
	@ParameterizedTest
	@CsvSource({"0,Aung Aung","2,Mya Mya"})
	void  selectListTest(int index,String res) {
		
		
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings = {"h","L","t"})
	void useListTest(String str) {
		System.out.println("Use set type :"+str);
		
		for(String s:data.useList("A")) {
			System.out.println("Element :" +s);
		}
		System.out.println();
	}
}
