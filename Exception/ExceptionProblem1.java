package trial;

import java.util.Scanner;
public class exceptionProblem {
	public static void main(String []args) {
		
		
		Scanner sc = new Scanner(System.in);
		char ans = 'y';
		while(ans == 'y') {
			System.out.println("Enter the first number ");
			int num1 = sc.nextInt();
			System.out.println("Enter Second number ");
			int num2 = sc.nextInt();
			try {
				int result = num1/num2;
				System.out.println("Resut="+result);
			}
			catch (Exception e) {
				System.out.println("/by zero");
				
			}
			finally {
				System.out.println("End of the program");
			}
			System.out.println("Do you want to continue y or n");
			ans = sc.next().charAt(0);


			
		}
		
	}

}
