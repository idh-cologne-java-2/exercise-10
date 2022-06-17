package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Application {

	public static void main(String[] args) {
		
		TreeList<Integer> tl = new TreeList<Integer>();
		fill(tl);
		add(tl);
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		fill(ll);
		add(ll);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		fill(al);
		add(al);
		
	//	System.out.println(tl);
		
	}
	
	// fill list with 100000 random numbers
	public static void fill(List<Integer> list) {
		Random zufallsZahl = new Random();
		for (int i = 0; i < 100000; i++) {
			list.add(zufallsZahl.nextInt(100000));
		}
	}
	
	// add 10000 more random numbers to list
	public static long add(List<Integer> list) {
		Random zufallsZahl = new Random();
		
		long start = System.currentTimeMillis(); // starting time
		
		for(int i = 0; i < 10000; i++) {
			list.add(zufallsZahl.nextInt(10000));
		}
		
		long end = System.currentTimeMillis(); // time at the end of measurement
		
		long duration = end - start; // duration
		
		System.out.println("It takes " + duration + " ms for adding 10000 new random numbers.");
		return duration;
		
	}
	
}
