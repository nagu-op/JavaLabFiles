import java.util.Scanner;
class PrimeChecker{
	public boolean checker(int number) {
		int fact = 0;
		for (int i = 1; i < number; i ++) {
			if (number % i == 0) {
				fact ++;
			}
		}
		if (fact > 1) {
			return false;
		}
		else {
			return true;
		}
	}
}



public class Prime {
	public static void main(String [] args) {
		System.out.println("Enter the number to be checked : ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		PrimeChecker p = new PrimeChecker();
		if (p.checker(userInput)) {
			System.out.println("The number " + userInput + " is a prime number ");
			
		}
		else {
			System.out.println("The number " + userInput + " is not a prime number");
		}
	}

}
