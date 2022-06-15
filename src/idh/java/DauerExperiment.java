package idh.java;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class DauerExperiment {

	public static void main(String[] args) {
		
		TreeList<Integer> treeList = new TreeList<Integer>();
		bef�llen(treeList);
		einf�gen(treeList);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		bef�llen(linkedList);
		einf�gen(linkedList);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		bef�llen(arrayList);
		einf�gen(arrayList);

	}

	public static void bef�llen(List<Integer> l) {
		Random zufallsZahlen = new Random();
		
		for(int i = 0; i <= 10; i++) {
			l.add(zufallsZahlen.nextInt(100000));
		}
	}
	
	public static long einf�gen(List<Integer> l) {
		Random zufallsZahlen = new Random();
		
		LocalTime start = java.time.LocalTime.now();
		
		for (int i = 0; i <= 10000; i++) {
			
			l.add(zufallsZahlen.nextInt(10000));
		}
			
	        LocalTime ende = java.time.LocalTime.now();
	        
	        long dauer = Duration.between(start, ende).toMillis();
	        
	        System.out.println("Es dauert " + dauer + "ms 10000 neue Zufalsszahlen einzuf�gen");

		return dauer;
	}
}
