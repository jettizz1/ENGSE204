package lab5;
import java.util.Scanner;
class Shapeiei {
	
	protected String name;
	public Shapeiei(String name) {
		this.name = name;
	}
	
	public double calculateArea() {
		return 0.0;
	}
}

class Circle extends Shapeiei {
	
	protected double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return 3.14159 * radius * radius;
	}
}

class Rectangle extends Shapeiei {
	
	protected double width;
	protected double height;

	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}

public class lab5_5 {

	public static void main(String[] args) {
		Scanner scannerri = new Scanner(System.in);
		if (scannerri.hasNextDouble()) {
			double radius = scannerri.nextDouble();
			double width = scannerri.nextDouble();
			double height = scannerri.nextDouble();
			Shapeiei c = new Circle("Circle", radius);
			Shapeiei r = new Rectangle("Rectangle", width, height);
			Shapeiei[] shapesix = {c, r};
			for (Shapeiei s : shapesix) {
				System.out.println(s.calculateArea());
			}
		}
		scannerri.close();
	}
}