package idh.java;
import org.apache.commons.collections4.list.TreeList;


import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;


public class Lists {
	static Random randomLists = new Random();
	


	public static void main(String[] args)  {
		arrayL();
		linkedList();
		tree();
	}
	
	
	public static long arrayL(){
			ArrayList<Integer> arrayL = new ArrayList<Integer>();
			long start = System.currentTimeMillis();
			for(int i = 0; i < 100000; i++) {
			arrayL.add(randomLists.nextInt(100000));}
			long end = System.currentTimeMillis();
			System.out.println( end-start+ "ms dauert die ArrayList");
			return end-start;
			}
	
	
	public static long linkedList (){
		LinkedList<Integer> linkedL = new LinkedList<Integer>();
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
		linkedL.add((randomLists.nextInt(100000))); }
		long end = System.currentTimeMillis();
		System.out.println( end-start + "ms dauert die LinkedList");
		return end-start;
		}
		
		
	public static long tree() {
		TreeList<Integer> treeL = new TreeList<Integer>();
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			treeL.add(randomLists.nextInt(100000)); }
		long end = System.currentTimeMillis();
		System.out.println( end-start+ "ms dauert die TreeList");
		return end-start;
	}
		
	
	}





