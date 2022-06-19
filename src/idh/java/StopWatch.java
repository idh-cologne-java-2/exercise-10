package idh.java;

public class StopWatch {
	
	long startTime; 
	long totalTime; 
	
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	
	public double stop() {
		totalTime = totalTime + (System.currentTimeMillis() - startTime);
		return totalTime / 1000d;
	}
	

	public void reset() {
		totalTime = 0;
	}

}
