package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections.list.TreeList;

public class Listvergleich {


		public static void main(String[] args) {
			
			Zeitmesser zm = new Zeitmesser();
			
			TreeList treeList = new TreeList();
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
			
			Random random = new Random(10000);
			for (int i = 0; i <= 10000; i++) {
				treeList.add(i, random.nextInt(10000));
			}
			
			zm.start(); 			
			for (int i = 0; i <= 10000; i++) {
				treeList.add(random.nextInt(10000), random.nextInt(10000));
			}
			
			System.out.println(zm.stop());
			zm.reset();
			
			//ArrayList
			for (int i = 0; i <= 10000; i++) {
				arrayList.add(i, random.nextInt(10000));
			}
			
			zm.start(); 
			for (int i = 0; i <= 10000; i++) {
				arrayList.add(random.nextInt(10000), random.nextInt(10000));
			}
			System.out.println(zm.stop());
			zm.reset();
			
			//LinkedList
			for (int i = 0; i <= 10000; i++) {
				linkedList.add(i, random.nextInt(10000));
			}
			
			zm.start(); 
			for (int i = 0; i <= 10000; i++) {
				linkedList.add(random.nextInt(10000), random.nextInt(10000));
			}
			System.out.println(zm.stop());
			zm.reset();
		}
		
		

	

}
