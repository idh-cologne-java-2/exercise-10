package idh.java;

import java.util.*;

public class Task {
	
	public static void main(String[] args) {

				TreeSet<Integer> tree = new TreeSet<Integer>();
				
				for(int i = 0; i < 100000; i++) {
					tree.add((int) Math.random());
				}
				
				long start = System.currentTimeMillis();
				
				for(int i = 0; i < 10000; i++) {
					tree.add((int) Math.random());
				}

				long ende = System.currentTimeMillis();
				System.out.println("Die Tree-List braucht "+(ende-start)+" Millisekunden.");
				
				
				

				ArrayList<Integer> arr = new ArrayList<Integer>();
				
				for(int i1 = 0; i1 < 100000; i1++) {
					arr.add((int) Math.random());
				}

				start = System.currentTimeMillis();

				for(int i1 = 0; i1 < 10000; i1++) {
					arr.add((int) Math.random(), (int) Math.random());
				}

				ende = System.currentTimeMillis();
				System.out.println("Die Array-List braucht "+(ende-start)+" Millisekunden.");
				
		
				
				
				LinkedList<Integer> LList = new LinkedList<Integer>();
		        
				for(int i1 = 0; i1 < 100000; i1++) {
					LList.add((int) Math.random());
				}
				
				start = System.currentTimeMillis();

				for(int i1 = 0; i1 < 10000; i1++) {
					LList.add((int) Math.random(), (int) Math.random());
				}

				ende = System.currentTimeMillis();
				System.out.println("Die LinkedList braucht " + (ende-start) + " Millisekunden.");
				
		
	}
}
