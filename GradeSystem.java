package firstJavaLab;
import java.util.Scanner;
public class GradeSystem {
	public static void main(String[]args) {
		int markOfStudent;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark: ");
		markOfStudent = sc.nextInt();
		if (markOfStudent >= 90) {
			System.out.println("The mark is S");
		}
		else if (markOfStudent >= 85) {
			System.out.println("The mark is A+");
		}
		else if (markOfStudent >= 80) {
			System.out.println("The mark is A");
		}
		else if (markOfStudent >= 75) {
			System.out.println("The mark is B+");
		}
		else if (markOfStudent >= 70) {
			System.out.println("The mark is B");
		}
		else if (markOfStudent >= 65) {
			System.out.println("The mark is C+");
		}
		else if (markOfStudent >= 60) {
			System.out.println("The mark is C");
		}
		else if (markOfStudent >= 55) {
			System.out.println("The mark is D");
		}
		else if (markOfStudent >= 50) {
			System.out.println("The mark is P");
		}
		else {
			System.out.println("Fail");
		}
	}

}
