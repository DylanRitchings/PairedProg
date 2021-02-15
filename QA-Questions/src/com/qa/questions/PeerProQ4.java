package com.qa.questions;

import java.util.ArrayList;
import java.util.Collections;

public class PeerProQ4 {
	public static void calc(int a, int b, int c) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(a);
		n.add(b);
		n.add(c);
		Collections.sort(n);

		int big = n.get(2);
		
		int small = n.get(0);
		
		int middle = n.get(1);
		
		
		if (small + middle == big) {
			System.out.println(small + " + " + middle + " = " + big);
		}
		
		
		if (small * middle == big) {
			System.out.println(small + " * " + middle + " = " + big);
		}
		
		if (big/small == middle) {
			System.out.println(big + " / " + small + " = " + middle);
			System.out.println(big + " / " + middle + " = " + small);
		}
		
		if (big-small == middle) {
			System.out.println(big + " - " + small + " = " + middle);
			System.out.println(big + " - " + middle + " = " + small);
		}
		
		
		
		
	
				
	}
	public static void calc4(Integer a, Integer b, Integer c, Integer d) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(a);
		n.add(b);
		n.add(c);
		n.add(d);
		Collections.sort(n);

		calc(n.get(0),n.get(1),n.get(2));
		calc(n.get(1),n.get(2),n.get(3));
		calc(n.get(0),n.get(2),n.get(3));
		calc(n.get(0),n.get(1),n.get(3));
	}
	
	
}
