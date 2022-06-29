package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.event.TreeExpansionListener;

public class App {
	
	public static void main(String[] args) {
		//TreeList
		TreeList<Integer> treeList = new TreeList<Integer>();
		fillList(treeList);
		addNumbers(treeList);
		
		//LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		fillList(linkedList);
		addNumbers(linkedList);
		
		//ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		fillList(arrayList);
		addNumbers(arrayList);
	}
		
		public static void fillList(List<Integer> list) {
			Random randomNumber = new Random();
			for (int i = 0; i < 100000; i++) {
				lists.add(randomNumber.nextInt(100000));
			}
		}
		
		public static long addNumbers(List<Integer> list) {
			long startTime = System.currentTimeMillis(); 
			long endTime = System.currentTimeMillis(); 
			long timePeriod = endTime - startTime; 
			
			Random randomNumber = new Random();
			for (int i = 0; i < 10000; i++) {
				lists.add(randomNumber.nextInt(10000));
			}
									
			System.out.println("Time period: " + timePeriod);
			
			return timePeriod;			
		}
}
