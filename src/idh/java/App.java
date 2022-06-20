package idh.java;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class App {

	public static void main(String[] args) {
		
	TreeList<Integer> tl = new TreeList<Integer>();
	f�llen(tl);
	einf�gen(tl);
	
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
	f�llen(ll);
	einf�gen(ll);
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	f�llen(al);
	einf�gen(al);
	}
	
	public static void f�llen(List<Integer> l) {
		Random zufallsZahl = new Random();
		
		for(int i = 0; i <= 100000; i++) {
			l.add(zufallsZahl.nextInt(100000));
		}
		
		public static long einf�gen(List<Integer> list) {
			Random zufallsZahl = new Random();
			
			long start = System.currentTimeMillis(); 
			
			for(int i = 0; i < 10000; i++) {
				list.add(zufallsZahl.nextInt(10000));
			}
			
			long ende = System.currentTimeMillis(); 
			
			long dauer = ende - start; 
			
			System.out.println("Es dauert " + dauer + " ms 10000 neue zuf�llige Zahlen einzuf�gen");
			return dauer;
	}
}
