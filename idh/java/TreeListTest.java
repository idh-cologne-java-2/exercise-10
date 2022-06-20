package idh.java;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import org.apache.commons.collections4.list.TreeList;

public class TreeListTest {
	static Random randomNumbers = new Random();
	
	public static void main(String[] args) {
		
		TreeList<Integer> treeList = new TreeList<Integer>();
		fill(treeList);
		fill2(treeList);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		fill(linkedList);
		fill2(linkedList);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		fill(arrayList);
		fill2(arrayList);
	};
	
	public static void fill(List<Integer> l) {
		
		for(int i = 0; i <= 100000; i++) {
			l.add(randomNumbers.nextInt(100000));
		}
	}
		
	public static void fill2(List<Integer> l) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i <= 10000; i++) {
			l.add(randomNumbers.nextInt(10000));
		}
		
		long stopTime = System.currentTimeMillis();
		
		long time = stopTime - startTime;
		
		System.out.println("Das Einfügen der 10000 neuen Zufallszahlen dauerte " + time + " Millisekunden.");
		
	}
}