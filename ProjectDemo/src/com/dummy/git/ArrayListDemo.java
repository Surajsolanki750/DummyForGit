package com.dummy.git;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Suraj","Solanki","Ratnagiri","Thane");
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
