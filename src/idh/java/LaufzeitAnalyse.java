package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class LaufzeitAnalyse {
		
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		fillList(aList);
		addNumbers(aList);
		LinkedList<Integer> lList = new LinkedList<Integer>();
		fillList(lList);
		addNumbers(lList);
		TreeList<Integer> tList = new TreeList<Integer>();
		fillList(tList);
		addNumbers(tList);
	}
	
	//Listen mit zufälligen Zaheln füllen
	public static void fillList(List<Integer> list) {
		Random zufall = new Random(); 
		for (int i = 0; i < 100000; i++) {
			list.add(zufall.nextInt(100000));
		}
	}
	
	//weitere zufällige Zahlen
	public static void addNumbers(List<Integer> list) {
		Random zufall = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(zufall.nextInt(100000));
		}
		
		long end = System.currentTimeMillis();
		long sum = end - start;
		
		System.out.println("Die Messdauer beträgt: " + sum + " Millisekunden.");
	}
}
