package defaultM;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Zähler {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		TreeList<Integer> tl = new TreeList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("TreeList-Test started");
		long tlStart = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			tl.add(r.nextInt());
		}
		long tlEnd = System.currentTimeMillis();
		System.out.println("Adding took " + (tlEnd - tlStart) + "ms");
		
		System.out.println("LinkedList-Test started");
		long llStart = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			ll.add(r.nextInt());
		}
		long llEnd = System.currentTimeMillis();
		System.out.println("Adding took " + (llEnd - llStart) + "ms");
		
		System.out.println("ArrayList-Test started");
		long alStart = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			al.add(r.nextInt());
		}
		long alEnd = System.currentTimeMillis();
		System.out.println("Adding took " + (alEnd - alStart) + "ms");
	}
}
