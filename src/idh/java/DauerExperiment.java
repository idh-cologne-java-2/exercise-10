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
		
		//TreeListe anlegen
		TreeList<Integer> treeList = new TreeList<Integer>();
		befüllen(treeList);
		einfügen(treeList);
		
		//LinkedListe anlegen
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		befüllen(linkedList);
		einfügen(linkedList);
		
		//ArrayListe anlegen
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		befüllen(arrayList);
		einfügen(arrayList);

	}

	//100.000 zufalsszahlen in die Liste hinzufügen 
	public static void befüllen(List<Integer> l) {
		Random zufallsZahlen = new Random();
		
		for(int i = 0; i <= 100000; i++) {
			l.add(zufallsZahlen.nextInt(100000));
		}
	}
	
	//weitere 10.000 zufallszahlen hinzufügen
	public static long einfügen(List<Integer> l) {
		Random zufallsZahlen = new Random();
		
		long start = System.currentTimeMillis();  //einmal die Zeit davor nehmen
		
		for (int i = 0; i <= 10000; i++) {
			
			l.add(zufallsZahlen.nextInt(10000));
		}
			
	        long ende = System.currentTimeMillis();  //und dann die Zeit danach
	        
	        long dauer = ende - start;
	        
	        System.out.println("Es dauert " + dauer + "ms 10000 neue Zufalsszahlen einzufügen");

		return dauer;
	}
}
