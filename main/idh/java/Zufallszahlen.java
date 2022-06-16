package idh.java;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.ArrayList;


public class Zufallszahlen {
	

	public static void main (String [] args) {
		
		// TreeList angelegt
		TreeSet<Integer> TList = new TreeSet<Integer>();
		
		//Liste wir mit 100.000 Zufallszahlen befuellt
		for(int i = 0; i < 100000; i++) {
			TList.add((int) Math.random());
		}
		
		//Start Messung der Dauer zum Generieren der Zahlen
		long start = System.currentTimeMillis();
		
		//weitere 10.000 Zahlen, die an zufaelligen Stellen eingefuegt werden
		for(int i = 0; i < 10000; i++) {
			TList.add((int) Math.random());
		}
		
		//Ende der Messung
		long end = System.currentTimeMillis();
		System.out.println("Bei der TreeList hat es " + (end-start) + " Millisekunden gedauert.");
		
		
		
		
		//ArrayList angelegt
		ArrayList<Integer> AList = new ArrayList<Integer>();
		
		int i = 0;
		//Liste wird mit 100.000 Zahlen befuellt
		for(int i1 = 0; i < 100000; i++) {
			AList.add((int) Math.random());
		}
		
		//Start der Messung
		start = System.currentTimeMillis();
		
		//weitere 10.000 Zahlen
		for(int i1 = 0; i1 < 10000; i1++) {
			AList.add((int) Math.random(), (int) Math.random());
		}
		
		//Ende der Messung
		end = System.currentTimeMillis();
		System.out.println("Bei der ArrayList hat es " + (end-start) + " Millisekunden gedauert.");
		
		
		
		
		//LinkedList angelegt
		LinkedList<Integer> LList = new LinkedList<Integer>();
        
		//Liste wird mit 100.000 Zahlen befuellt
		for(int i1 = 0; i1 < 100000; i1++) {
			LList.add((int) Math.random());
		}
		
		//Start der Messung
		start = System.currentTimeMillis();
		
		//weitere 10.000 Zahlen
		for(int i1 = 0; i1 < 10000; i1++) {
			LList.add((int) Math.random(), (int) Math.random());
		}
		
		//Ende der Messung
		end = System.currentTimeMillis();
		System.out.println("Bei der LinkedList hat es " + (end-start) + " Millisekunden gedauert.");
		
}
	
}
