package idh.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections.list.TreeList;

public class List {
	
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    TreeList t = new TreeList();
		
	    Date date = new Date();
	    
	    for(int i = 0; i < 100000; i++) {
			int zahl = new Random().nextInt();
			l.add(zahl);
		}
	    
	    long start = date.getTime();
	    Iterator<Integer> it = l.iterator();
	    while(it.hasNext()) {
	    	int current = it.next();
	    	int zahl = new Random().nextInt();
			int z = new Random().nextInt(10000);
			l.add(z, zahl);
	    }
	    System.out.println("Time for Linked List: " + (date.getTime() - start));
	    
	    for(int i = 0; i < 100000; i++) {
			int zahl = new Random().nextInt();
			a.add(zahl);
		}
	    
	    start = date.getTime();
	    Iterator<Integer> ita = a.iterator();
	    while(ita.hasNext()) {
	    	int current = ita.next();
	    	int zahl = new Random().nextInt();
			int z = new Random().nextInt(10000);
			a.add(z, zahl);
	    }
	    System.out.println("Time for Array List: " + (date.getTime() - start));
	    
	    for(int i = 0; i < 100000; i++) {
			int zahl = new Random().nextInt();
			t.add(zahl);
		}
	    
	    start = date.getTime();
	    Iterator<Integer> itar = t.iterator();
	    while(itar.hasNext()) {
	    	int current = itar.next();
	    	int zahl = new Random().nextInt();
			int z = new Random().nextInt(10000);
			t.add(z, zahl);
	    }
	    System.out.println("Time for Tree List: " + (date.getTime() - start));
	}
}
