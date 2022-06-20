package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class App {

	public static void main(String[] args) {

		Random random = new Random();
		TreeList<Integer> tree = new TreeList<Integer>();

		System.out.println("Starting TreeList measurements...");

		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {

			tree.add(random.nextInt());
		}

		for (int p = 0; p < 10000; p++) {
			tree.add(random.nextInt(100000 - 1), random.nextInt());
		}
		long end = System.currentTimeMillis();
		System.out.println("TreeList measurements finished!");
		System.out.println("Time: " + (end - start) + " ms" + "\n");

		LinkedList<Integer> l = new LinkedList<Integer>();

		System.out.println("Starting LinkedList measurements...");

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {

			l.add(random.nextInt());
		}

		for (int p = 0; p < 10000; p++) {
			l.add(random.nextInt(100000 - 1), random.nextInt());
		}
		end = System.currentTimeMillis();
		System.out.println("TreeList measurements finished!");
		System.out.println("Time: " + (end - start) + " ms" + "\n");

		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.println("Starting ArrayList measurements...");

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {

			a.add(random.nextInt());
		}

		for (int p = 0; p < 10000; p++) {
			a.add(random.nextInt(100000 - 1), random.nextInt());
		}
		end = System.currentTimeMillis();
		System.out.println("TreeList measurements finished!");
		System.out.println("Time: " + (end - start) + " ms" + "\n");

	}

}