package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class App {
	
	public static void main(String[] args) {
		TreeList<Integer> treeList = new TreeList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		Random random = new Random();

		long tStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			treeList.add(random.nextInt());
		}
		long tEnd = System.currentTimeMillis();

		long lStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(random.nextInt());
		}
		long lEnd = System.currentTimeMillis();

		long aStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(random.nextInt());
		}
		long aEnd = System.currentTimeMillis();
		
		System.out.println("TreeList: " + (tEnd - tStart) + "ms");
		System.out.println("LinkedList: " + (lEnd - lStart) + "ms");
		System.out.println("ArrayList: " + (aEnd - aStart) + "ms");
	}
	
}
