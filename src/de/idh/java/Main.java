package de.idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		long time1 = 0l;
		long time2 = 0l;
		TreeList<Integer> tree = new TreeList<Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		LinkedList<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < 100000; i++) {
			int newNumber = rnd.nextInt();
			tree.add(newNumber);
			array.add(newNumber);
			linked.add(newNumber);
		}
		time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int newNumber = rnd.nextInt();
			int newPosition = rnd.nextInt(tree.size());
			tree.add(newPosition, newNumber);
		}
		time2 = System.currentTimeMillis();
		System.out.println("Adding 10000 numbers to the tree list took " + (time2 - time1) + " milliseconds.");

		time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int newNumber = rnd.nextInt();
			int newPosition = rnd.nextInt(array.size());
			array.add(newPosition, newNumber);
		}
		time2 = System.currentTimeMillis();
		System.out.println("Adding 10000 numbers to the array list took " + (time2 - time1) + " milliseconds.");

		time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int newNumber = rnd.nextInt();
			int newPosition = rnd.nextInt(linked.size());
			linked.add(newPosition, newNumber);
		}
		time2 = System.currentTimeMillis();
		System.out.println("Adding 10000 numbers to the linked list took " + (time2 - time1) + " milliseconds.");
		
	}
}
