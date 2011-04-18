
public class TimeImplementationC2 extends CloneableTime {
	private int secs;
	
	@Override
	public int getHours() {
		return secs / 3600;
	}

	@Override
	public int getMinutes() {
		return (secs - getHours() * 3600) / 60;
	}

	@Override
	public int getSeconds() {
		return secs % 60;
	}

	@Override
	public void setTime(int hr, int min, int sec) {
		secs = hr * 3600 + min * 60 + sec;
	}

}
