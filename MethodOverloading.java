package firstJavaLab;
import java.util.Scanner;
public class MethodOverloading {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the choice: \n 1. Rectange \n 2. Circle \n 3. Triangle");
	 int choice;
	 choice = sc.nextInt();
	 Shape shape=new Shape();
	 	if (choice == 1) {
	 		System.out.println("Enter the length");
	 		int a = sc.nextInt();
	 		System.out.println("Enter the braedth");
	 		int b = sc.nextInt();
	 		Shape.area(a,b);
	 }
	 	else if(choice == 2) {
	 		System.out.println("Enter the radius");
	 		float a = sc.nextFloat();
	 		Shape.area(a);
	 	}
	 	else if(choice == 3) {
	 		System.out.println("Enter the height");
	 		float a = sc.nextFloat();
	 		System.out.println("Enter the breadth");
	 		float b = sc.nextFloat();
	 		Shape.area(a,b);
	 	}
		
		
	}

}
class Shape{
	
	public static void area(int length,int breadth) {
		System.out.println("Area of Rectangle="+(length*breadth));
	}
	public static void area(float height,float base) {
		System.out.println("Area of triangle="+(0.5*height*base));
	}
	public static void area(float radius) {
		System.out.println("Area of circle="+(3.14*radius*radius));
	}
}
