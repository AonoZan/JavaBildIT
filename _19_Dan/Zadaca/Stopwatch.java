/**@autor AonoZan Dejan Petrovic 2016 ©
 */
// private startTime
// private endTime

// Stopwatch()

// start()
// stop()
// getElapsedTime()


public class Stopwatch {
	private long startTime;
	private long endTime;
	
	Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	
	long getStartTime() {
		return startTime;
	}
	long getEndTime() {
		return endTime;
	}
	void start() {
		startTime = System.currentTimeMillis();
	}
	void stop() {
		endTime = System.currentTimeMillis();
	}
	String getElapsedTime(){
		long time = endTime - startTime;
		String timeHumanReadable = ":" + String.valueOf(time % 1000);
		
		time /= 1000;
		timeHumanReadable = ":" + String.valueOf(time % 60) + timeHumanReadable;
		time /= 60;
		timeHumanReadable = String.valueOf(time % 60) + timeHumanReadable;
		
		return timeHumanReadable;
	}
}
