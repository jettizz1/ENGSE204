package lab5_new;
import java.util.Scanner;

class Userzz {
	protected String name;
	
	public Userzz(String name) {
		this.name = name;
	}
	
	public int getClearanceLevel() {
		return 1;
	}
}

class Developer extends Userzz {
	protected int projects;
	
	public Developer(String name, int projects) {
		super(name);
		this.projects = projects;
	}
	@Override
	public int getClearanceLevel() {
		return 2;
	}
}

class Admin extends Developer {
	protected String adminKey;
	
	public Admin(String name, int projects, String adminKey) {
		super(name, projects);
		this.adminKey = adminKey;
	}
	@Override
	public int getClearanceLevel() {
		return 3;
	}
	
	public String getAdminKey() {
		return adminKey;
	}
}

public class lab5_13 {

	public static void main(String[] args) {
		Scanner scannerqq = new Scanner(System.in);
		if (scannerqq.hasNextLine()) {
			String dName = scannerqq.nextLine();
			int dProjects = scannerqq.nextInt();
			scannerqq.nextLine(); 
			String aName = scannerqq.nextLine();
			int aProjects = scannerqq.nextInt();
			scannerqq.nextLine();
			String aKey = scannerqq.nextLine();
			Userzz uonee = new Userzz("Guest");
			Developer done = new Developer(dName, dProjects);
			Admin aonee = new Admin(aName, aProjects, aKey);
			Userzz[] users = {uonee, done, aonee};
			int totalClearance = 0;
			for (Userzz u : users) {
				totalClearance += u.getClearanceLevel();
			}
			for (Userzz u : users) {
				if (u instanceof Admin) {
					Admin admin = (Admin) u;
					System.out.println(admin.getAdminKey());
				}
			}
			System.out.println(totalClearance);
		}
		scannerqq.close();
	}
}
