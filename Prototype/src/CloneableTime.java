
public abstract class CloneableTime implements Cloneable {
	public abstract void setTime(int hr, int min, int sec);
	public abstract int getHours();
	public abstract int getMinutes();
	public abstract int getSeconds();
	
	public CloneableTime cloneItself() throws CloneNotSupportedException {
		CloneableTime theClone = (CloneableTime) super.clone();
		theClone.setTime(0, 0, 0);
		return theClone;
	}
}
