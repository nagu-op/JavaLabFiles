package firstJavaLab;
import java.util.Scanner;
public class PositiveNumbers {
	public static void main(String[]args) {
		int usrNumber, sum=0;
		System.out.println("Enter the numbers: ");
		Scanner sc = new Scanner(System.in);
		usrNumber = sc.nextInt();
		while(usrNumber>0) {
			sum = sum + usrNumber;
			usrNumber = sc.nextInt();
			
		}
		System.out.println("The sum is "+sum);
		
	}
}
