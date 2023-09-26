package firstJavaLab;
import java.util.Scanner;
public class PositiveNumbersTwo {
	public static void main(String[]args) {
		int usrNumber,sum = 0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		do {
			usrNumber = sc.nextInt();
			if (usrNumber > 0) {
				sum = sum+usrNumber;
			}
			
		}
		while(usrNumber>0);
		System.out.println("The sum is "+sum);
	}

}
