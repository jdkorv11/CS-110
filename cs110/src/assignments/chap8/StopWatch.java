package assignments.chap8;

public class StopWatch {

	private long startTime;
	private long endTime = -1;

	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public long getElapsedTime() {
		long elapsedTime = endTime - startTime;
		return elapsedTime;
	}

}
