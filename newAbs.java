package abstractClass;

public class newAbs {
	public static void main(String [] args) {
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
		
	}
}

abstract class shape{
	public abstract void numberOfSides();
}

class Rectangle extends shape{
	public void numberOfSides() {
		System.out.println("The sides of Rctangle is 4");
	}
}
class Triangle extends shape{
	public void numberOfSides() {
		System.out.println("The sides of Triangle is 3");
	}
}
class Hexagon extends shape{
	public void numberOfSides() {
		System.out.println("The sides of Hexagon is 6");
	}
}