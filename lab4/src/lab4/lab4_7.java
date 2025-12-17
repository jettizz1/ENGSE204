package lab4;
import java.util.Scanner;
class Resourceee {
	private String id;
	public Resourceee(String id) {
		this.id = id;
		System.out.println("Resource " + this.id + " created.");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Resource " + this.id + " finalized (destroyed).");
	}
}

public class lab4_7 {
	public static void main(String[] args) {
		Scanner scannerrj = new Scanner(System.in);
		if (!scannerrj.hasNext());
		String idonee = scannerrj.next();
		String idtwoo = scannerrj.next();
		String idthere = scannerrj.next();
	
		Resourceee rone = new Resourceee(idonee);
		Resourceee rtwoo = new Resourceee(idtwoo);
		Resourceee rtheree = new Resourceee(idthere);
		
		rone = null;
		rtwoo = null;
		System.gc();
		rtheree = null;
		System.gc();
		try {
			Thread.sleep(500); 
		} catch (InterruptedException b) {
			b.printStackTrace();
		}
		scannerrj.close();
	}
}