// Tim Schäfer 7380391
package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class App {
	
	
	public static void main(String[] args) {
		
		TreeList<Integer> 		tl 	= new TreeList<Integer>();
		LinkedList<Integer> 	ll 	= new LinkedList<Integer>();
		ArrayList<Integer>		al 	= new ArrayList<Integer>();
		
		fill(tl);
		fill(ll); 
		fill(al); 
		
		StopWatch sw = new StopWatch();
		
		System.out.println("This is how much time the lists need to add 10000 numbers at random positions.");
		
		sw.start();
		randomAdd(tl);
		System.out.println("TreeList: " + sw.stop());
		sw.reset();
		
		sw.start();
		randomAdd(ll);
		System.out.println("LinkedList: " + sw.stop());
		sw.reset();

		
		sw.start();
		randomAdd(al);
		System.out.println("ArrayList: " + sw.stop());
		sw.reset();

	}
	
	public static void fill(List<Integer> list){
		
		Random r = new Random();
		for(int i = 0 ;i < 100000 ;i++) {
			list.add(r.nextInt(420));
		}
	}
	
	
	public static void randomAdd(List<Integer> list){
		
		Random r = new Random();
		for(int i = 0 ;i < 10000 ;i++) {
			list.add(r.nextInt(list.size()-1), r.nextInt(420));
		}
	}
	
}
