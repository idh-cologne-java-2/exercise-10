
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;


public class Main {

	
	
	
	public static void main(String[] args) {
		
		
		Random r = new Random();
		TreeList<Integer> t = new TreeList<Integer>(); 
		
		
		
		System.out.println("TreeList Test is starting .. ");
		
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 100000; i++ ) {
			
			t.add(r.nextInt()); 
		}
		
		
		for(int p = 0 ; p< 10000; p++) {
			t.add(r.nextInt(100000 -1 ), r.nextInt());
		}
		long end = System.currentTimeMillis();
		System.out.println("TreeList finished !");
		System.out.println("Time: " + (end - start) + " ms" + "\n");

		
		

	
		LinkedList<Integer> l = new LinkedList<Integer>(); 
		
		
		
		System.out.println("LinkedList Test is starting .. ");
		
		 start = System.currentTimeMillis();
		for(int i = 0 ; i < 100000; i++ ) {
			
			l.add(r.nextInt()); 
		}
		
		
		for(int p = 0 ; p< 10000; p++) {
			l.add(r.nextInt(100000 -1 ), r.nextInt());
		}
		 end = System.currentTimeMillis();
		System.out.println("TreeList finished !");
		System.out.println("Time: " + (end - start) + " ms" + "\n");
		
		
		
		
		
		ArrayList<Integer> a = new ArrayList<Integer>(); 
		
		
		System.out.println("ArrayList Test is starting .. ");
		
		 start = System.currentTimeMillis();
		for(int i = 0 ; i < 100000; i++ ) {
			
			a.add(r.nextInt()); 
		}
		
		
		for(int p = 0 ; p< 10000; p++) {
			a.add(r.nextInt(100000 -1 ), r.nextInt());
		}
		 end = System.currentTimeMillis();
		System.out.println("TreeList finished !");
		System.out.println("Time: " + (end - start) + " ms" + "\n");
		
		
		
		
		
		
	}
	
	
	
		
	}
