package com.jdc.toru.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FArrayUtilityClassTest {
	String[] array = {"ee","jj","bb","TT","ss"};
	
	
	@Test
	void arrayCompareTest() {
		String[] other = {"ee","jj","bb","TT","yy"};
		
		Arrays.sort(array);
		showArray(array);
		Arrays.sort(other);
		showArray(other);
		
		int res = Arrays.compare(array,other);
		System.out.println("Result :"+res);
	}
	
	@Disabled
	@Test
	void arrayCopyTest() {
		String[] arr = Arrays.copyOf(array,array.length+1);
		arr[array.length] = "yy";
		showArray(arr);
	}
	
	@Test
	@Disabled
	void immutableDataTest() {
		List<String> list = List.of("ss","aa","bb");     
		List<String> list1= new ArrayList<String>(list); //copy 
		list1.add("bb");
	}
	
	@Disabled
	@Test
	void arraySort() {
		
		Arrays.sort(array);
		showArray(array);
		Arrays.sort(array, Comparator.reverseOrder());
		showArray(array);
		Arrays.sort(array,0,3);
		showArray(array);
	}
	
	@Disabled
	@Test
	//before using search,must be sort first.
	//if there have duplicate elements,no guarantee which one will be out.
	void arraySearchTest() {
		Arrays.sort(array);
		int result = Arrays.binarySearch(array, "ss");
		System.out.println("Result index:" +result);
	}
	
	private void showArray(String[] array) {
		for(String s : array) {
			System.out.println(s);
		}
		System.out.println();
	}
}
