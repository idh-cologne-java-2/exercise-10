package idh.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;
public class ListTest {
	TreeList<Number> tree = new TreeList<Number>();
	LinkedList<Number> linked = new LinkedList<Number>();
	ArrayList<Number> array = new ArrayList<Number>();
	
	public double arraytest () {
	Random rnd = new Random();
		for (int i = 0; i < 100000; i++) {
			array.add(rnd.nextInt());
		}
		long time = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			array.add(rnd.nextInt(100000), rnd.nextInt());
		}
		time = System.currentTimeMillis() - time;
		double seconds =  time / 1000d ;
		System.out.println("ArrayList took " + seconds + " seconds." );
		return seconds;
	}
	
	public double linkedtest () {
		Random rnd = new Random();
			for (int i = 0; i < 100000; i++) {
				linked.add(rnd.nextInt());
			}
			long time = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				linked.add(rnd.nextInt(100000), rnd.nextInt());
			}
			time = System.currentTimeMillis() - time;
			double seconds =  time / 1000d ;
			System.out.println("LinkedList took " + seconds + " seconds." );
			return seconds;
		}
	
	public double treetest () {
		Random rnd = new Random();
			for (int i = 0; i < 100000; i++) {
				tree.add(rnd.nextInt());
			}
			long time = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				tree.add(rnd.nextInt(100000), rnd.nextInt());
			}
			time = System.currentTimeMillis() - time;
			double seconds =  time / 1000d ;
			System.out.println("TreeList took " + seconds + " seconds." );
			return seconds;
		}
	
	
	
	
	
	public static void main(String[] args) {
		ListTest test = new ListTest();
		double treeresult = test.treetest();
		double arrayresult =  test.arraytest();
		double linkedresult = test.linkedtest();
		if (Math.min(treeresult, Math.min(arrayresult, linkedresult)) == treeresult) {
		System.out.println("The TreeList was indeed the fastest option!");
		}
		else {
		System.out.println("False advertisement :(");	
		}
		
	}

}
