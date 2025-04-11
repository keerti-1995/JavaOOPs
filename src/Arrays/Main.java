package Arrays;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> h = new ArrayList<String>();
		ArrayList<Integer> h2 = new ArrayList<Integer>();
		String babyName = "Anvika";
		 h.add("Vishva");
		h.add(babyName);
		h.add("Parvathi");
		h.add("Appa");
		
		int size = h.size();
		
		System.out.println(size);
		System.out.println(h);
		
		
//		h.set(0, "Vishva Hiremath");
//		h.set(1, "Anvika Hiremath");
//		h.set(2, "Parvathi Hiremath");
		
		for(int i =0; i < size; i++) {
			h.set(i, h.get(i) +" Hiremath");
		}
		
		System.out.println(h);
		
		h2.add(1);
		
		
//		for (String s: h) {
//			System.out.println(s);
//		}
		
		
		
	

		
		
	}}
