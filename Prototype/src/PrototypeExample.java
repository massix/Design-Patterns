
public class PrototypeExample {

	public static void main(String[] args) {
		try {
			CloneableTime t1 = new TimeImplementationC1();
			t1.setTime(15, 20, 10);
			CloneableTime t1End = SchedulerC.calculateEnd(t1, 6);
			System.out.println("End: " + t1End.getHours() + ":" + t1End.getMinutes() + "." + t1End.getSeconds());
			
			CloneableTime t2 = new TimeImplementationC2();
			t2.setTime(20, 14, 00);
			CloneableTime t2End = SchedulerC.calculateEnd(t2, 9);
			System.out.println("End: " + t2End.getHours() + ":" + t2End.getMinutes() + "." + t2End.getSeconds());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
