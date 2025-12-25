package lab5;
import java.util.Scanner;
class Mediaza {
	protected String title;
	
	public Mediaza(String title) {
		this.title = title;
	}
	
	public void process() {
		System.out.println("Starting generic media processing.");
	}
}

class Video extends Mediaza {
	protected int duration;
	
	public Video(String title, int duration) {
		super(title);
		this.duration = duration;
	}
	@Override
	public void process() {
		System.out.println("Processing video: " + title + " for " + duration + " minutes.");
	}
}

class Audio extends Mediaza {
	protected String quality;
	
	public Audio(String title, String quality) {
		super(title);
		this.quality = quality;
	}
	@Override
	public void process() {
		System.out.println("Processing audio: " + title + " with " + quality + " quality.");
	}
}

class Processor {
	public static void runProcessor(Mediaza m) {
		m.process();
	}
}

public class lab5_6 {

	public static void main(String[] args) {
		Scanner scannereq = new Scanner(System.in);
		if(scannereq.hasNextLine()) {
			String vTitle = scannereq.nextLine();
			int vDuration = 0;
			if (scannereq.hasNextInt()) {
				vDuration = scannereq.nextInt();
				scannereq.nextLine();
			}
			String aTitle = scannereq.nextLine();
			String aQuality = scannereq.nextLine();
			Mediaza videoo = new Video(vTitle, vDuration);
			Mediaza audioo = new Audio(aTitle, aQuality);

			Processor.runProcessor(videoo);
			Processor.runProcessor(audioo);
		}
		scannereq.close();
	}
}