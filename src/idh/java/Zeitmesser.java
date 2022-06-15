package idh.java;

public class Zeitmesser {
	
	
		long startTime; // timestamp of starting the stopwatch
		long totalTime; // overall measured time in milliseconds
		
		/*
		 * Starts/continues the stopwatch measurement
		 */
		public void start() {
			startTime = System.currentTimeMillis();
		}
		
		/*
		 * Stops the stopwatch measurement and returns
		 * the measured time in seconds as a double value
		 */
		public double stop() {
			totalTime = totalTime + (System.currentTimeMillis() - startTime);
			return totalTime / 1000d;
		}
		
		/*
		 * Resets the stopwatch
		 */
		public void reset() {
			totalTime = 0;
		}



	

}
