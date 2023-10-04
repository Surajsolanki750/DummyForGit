package com.dummy.git;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1 ; i<6;i++) {
			set.add(i);
		}
		
		for(Integer i :set) {
			System.out.println(i);
		}
	}

}
