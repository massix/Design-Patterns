import java.util.Date;


public class FlyweightComparisonExample {
	public static void main(String[] arghssss) {
		EventSymbol[] eventList = new EventSymbol[10000000];
		Date tStart, tFinish;
		long prepTime, compTime;
		
		System.out.println("Testing creation and comparison of unshared EventSymbol instances");
		tStart = new Date();
		
		for (int i = 0; i < eventList.length; i++) {
			double r = Math.random();
			if (r < .3)
				eventList[i] = new EventSymbol("EVENT 1");
			else if (r < .6)
				eventList[i] = new EventSymbol("EVENT 2");
			else
				eventList[i] = new EventSymbol("EVENT 3");
		}
		
		tFinish = new Date();
		prepTime = tFinish.getTime() - tStart.getTime();
		
		int evn1count = 0, evn2count = 0, evn3count = 0;
		EventSymbol compEvent1 = new EventSymbol("EVENT 1");
		EventSymbol compEvent2 = new EventSymbol("EVENT 2");
		EventSymbol compEvent3 = new EventSymbol("EVENT 3");
		tStart = new Date();
		for (int i = 0; i < eventList.length; i++) {
			if (eventList[i].isEqualTo(compEvent1))
				evn1count++;
			else if (eventList[i].isEqualTo(compEvent2))
				evn2count++;
			else if (eventList[i].isEqualTo(compEvent3))
				evn3count++;
		}
		tFinish = new Date();
		compTime = tFinish.getTime() - tStart.getTime();
		
		System.out.println("E1: " + evn1count + "\nE2: " + evn2count + "\nE3: " + evn3count);
		System.out.println("Total objects: " + (evn1count + evn2count + evn3count));
		System.out.println("Filling time: " + prepTime + "ms");
		System.out.println("Computing time: " + compTime + "ms");
		System.out.println("Total time: " + (prepTime + compTime) + "ms\n\n");
		
		System.out.println("Testing creation and comparison of shared EventSymbol instances");
		tStart = new Date();
		for (int i = 0; i < eventList.length; i++) {
			double r = Math.random();
			if (r < .3)
				eventList[i] = EventSymbolFactory.newEventSymbol("EVENT 1");
			else if (r < .6)
				eventList[i] = EventSymbolFactory.newEventSymbol("EVENT 2");
			else
				eventList[i] = EventSymbolFactory.newEventSymbol("EVENT 3");
		}
		tFinish = new Date();
		prepTime = tFinish.getTime() - tStart.getTime();
		evn1count = evn2count = evn3count = 0;
		
		compEvent1 = EventSymbolFactory.newEventSymbol("EVENT 1");
		compEvent2 = EventSymbolFactory.newEventSymbol("EVENT 2");
		compEvent3 = EventSymbolFactory.newEventSymbol("EVENT 3");
		
		tStart = new Date();
		for (int i = 0; i < eventList.length; i++) {
			if (eventList[i] == compEvent1)
				evn1count++;
			else if (eventList[i] == compEvent2)
				evn2count++;
			else if (eventList[i] == compEvent3)
				evn3count++;
		}
		tFinish = new Date();
		
		compTime = tFinish.getTime() - tStart.getTime();
		System.out.println("E1: " + evn1count + "\nE2: " + evn2count + "\nE3: " + evn3count);
		System.out.println("Total objects: " + (evn1count + evn2count + evn3count));
		System.out.println("Filling time: " + prepTime + "ms");
		System.out.println("Computing time: " + compTime + "ms");
		System.out.println("Total time: " + (prepTime + compTime) + "ms\n\n");
		
	}
}
