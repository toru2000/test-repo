package com.jdc.toru.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class EMapDataTest extends junitConfig{
	
	private Map<Integer, String> map;
	
	@Test
	@Order(4)
	void useTreeMapWithPerson() {
		Map<Person, String> person = new TreeMap<Person, String>();
		person.put(new Person("c",22,new Human("tt",1)), "Celi");
		person.put(new Person("a",12,new Human("ss",2)), "Andrew");
		person.put(new Person("b",30,new Human("aa",2)), "Boby");
		person.put(new Person("g",11,new Human("bb",3)), "Grok");
		
		for(Entry<Person, String> e : person.entrySet()) {
			System.out.println("Key :"+e.getKey()+"\tVlaue :"+e.getValue());
		}
	}
	
	
	@Test
	@Order(3)
	void useTreeMapTest() {
	map = data.useMap("tree");
	addData();
	showData(map);
	}
	
	
	@Disabled
	@Test
	@Order(2)
	void useLinkHashMapTest() {
		map = data.useMap("link");
		addData();
		String name = map.getOrDefault(3, "Elon musk");
		System.out.println(name);
		
		assertEquals("Oliver", map.remove(3));
		
		map.replace(4, "Elon musk");
		
		assertEquals("Elon musk", map.get(4));
	}
	
	@Disabled
	@Test
	@Order(1)
	void showHashMapTest() {
		map = data.useMap("hash");
		addData();
		showData(map);
	}
	
	
	void showData(Map<Integer, String> map) {
		for(Entry<Integer,String> e : map.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
	
	void addData() {
		map.put(3,"John");
		map.put(5,"William");
		map.put(1,"Jackson");
		map.put(3,"Oliver");
		map.put(2,"John");
		map.put(4,"Orgus");
		map.put(6,"Andrew");
	}
}
