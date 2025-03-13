package com.jdc.toru.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GCollectionUtilityClass {

	List<Integer> list = new ArrayList<Integer>();
	
	@Test
	void shuffleTest() {
		addData();
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	@Test
	@Disabled
	void searchTest() {
		addData();
		Collections.sort(list);
		int res = Collections.binarySearch(list, 5);
		System.out.println("Sort :"+res);
	}
	
	@Test
	@Disabled
	void sortTest() {
		addData();
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
	}
	
	void addData() {
		list.addAll(List.of(4,2,5,6,1,3));
	}
}
