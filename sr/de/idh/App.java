package de.idh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class App {
	
	public static void main(String[] args) {
	TreeList<Integer> tree = new TreeList<Integer>();
	
	
	ArrayList<Integer> zufallszahlen = new ArrayList<Integer>();
	Random zufallsZahl = new Random();
	for (int i = 0; i < 100000; i++) {
		zufallszahlen.add(zufallsZahl.nextInt(100000));
		
		tree.addAll(zufallszahlen);
		
		System.out.println(tree);
	}

	
	
        final long timeStart = System.currentTimeMillis(); 
        for (int i = 0; i < 1000000; i++) { 
            // nichts machen 
        } 
        final long timeEnd = System.currentTimeMillis(); 
        System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Millisek."); 
	}   
	
}
