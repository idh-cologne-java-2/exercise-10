package idh.java;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class App {

	public static void main(String[] args) {
		
	TreeList<Integer> tl = new TreeList<Integer>();
	füllen(tl);
	einfügen(tl);
	
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
	füllen(ll);
	einfügen(ll);
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	füllen(al);
	einfügen(al);
	}
	
	public static void füllen(List<Integer> l) {
		Random zufallsZahl = new Random();
		
		for(int i = 0; i <= 100000; i++) {
			l.add(zufallsZahl.nextInt(100000));
		}
		
		public static long einfügen(List<Integer> list) {
			Random zufallsZahl = new Random();
			
			long start = System.currentTimeMillis(); 
			
			for(int i = 0; i < 10000; i++) {
				list.add(zufallsZahl.nextInt(10000));
			}
			
			long ende = System.currentTimeMillis(); 
			
			long dauer = ende - start; 
			
			System.out.println("Es dauert " + dauer + " ms 10000 neue zufällige Zahlen einzufügen");
			return dauer;
	}
}
