/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Stopwatch {
	private long startTime;
	private long endTime;
	
	Stopwatch() {
		start();
	}
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}
