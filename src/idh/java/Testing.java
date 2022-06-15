package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.commons.collections4.list.TreeList;

public class Testing {
	
	public static void main(String[] args) {
		
		TreeList<Integer> tL = new TreeList<Integer>();
		LinkedList<Integer> lL = new LinkedList<Integer>();
		ArrayList<Integer> aL = new ArrayList<Integer>();
		
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000;i++) {
			tL.add((int) Math.random());
		}
		for(int i = 0; i < 10000;i++) {
			//an zufällige stellen, zufällige zahlen
			
			tL.add((int) Math.random(),(int) Math.random());
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("it took "+ (end-start) + " ms");
		
		
		
		
		//LinkedList
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000;i++) { //2. schnellste
			lL.add((int) Math.random());
		}
		for(int i = 0; i < 10000;i++) {
			//an zufällige stellen, zufällige zahlen
			
			tL.add((int) Math.random(),(int) Math.random());
		}
		
		end = System.currentTimeMillis();
		System.out.println("it took "+ (end-start) + " ms");
		
		
		
		
		//ArrayList
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000;i++) { //schnellste
			aL.add((int) Math.random());
		}
		for(int i = 0; i < 10000;i++) {
			//an zufällige stellen, zufällige zahlen
			
			tL.add((int) Math.random(),(int) Math.random());
		}
		
		end = System.currentTimeMillis();
		System.out.println("it took "+ (end-start) + " ms");
		
	}

}
