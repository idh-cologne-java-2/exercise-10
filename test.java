package idh.java;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Random;

	import org.apache.commons.collections4.list.TreeList;

	public class test {

		public static void main(String[] args) {
			
			
			TreeList<Integer> trlist = new TreeList<Integer>();
			fill(trlist);
			put(trlist);
			
			LinkedList<Integer> lilist = new LinkedList<Integer>();
			fill(lilist);
			put(lilist);
			
			ArrayList<Integer> arlist = new ArrayList<Integer>();
			fill(arlist);
			put(arlist);
	 
		}
		
		
		public static void fill(List<Integer> v) {
			
			Random random = new Random();
			
			for (int i = 0; i <= 100000; i++) {
				v.add(random.nextInt(100000));
			}
			}
			
		public static long put(List<Integer> list) {
			
			Random random = new Random();
			
			long start = System.currentTimeMillis();
			
			for (int i = 0; i <= 100000; i++) {
				list.add(random.nextInt(100000));
			}
			
			long finish = System.currentTimeMillis();
			
			long time = finish - start;
			
			System.out.println("Das Einfügen von 100000 Zufallszahlen dauert: " + time + " Millisekunden");
			return time;
		}
		}
}
