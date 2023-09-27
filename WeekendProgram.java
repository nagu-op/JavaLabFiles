/*File          : FirstProject.java
 *Description   :  Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name
 *Author        : Nagaraj Menon K S 
 * Version      : 1.0
 * Date			: 27/09/2023
 * */


import java.util.Scanner;
public class FirstProblem {
	public static void main(String []args) {
		int key = 1;
		while (key == 1) {
			System.out.println("Input the day: ");
			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();
			if (userInput>0 && userInput <8) {
				if(userInput == 1) {
					System.out.println("Monday");
				}
				else if(userInput == 2) {
					System.out.println("Tuesday");
				}
				else if(userInput == 3) {
					System.out.println("Wednessday");
				}
				else if(userInput == 4) {
					System.out.println("Thursday");
				}
				else if(userInput == 5) {
					System.out.println("Friday");
				}
				else if(userInput == 6) {
					System.out.println("Saturday");
				}
				else {
					System.out.println("Sunday");
				}
			}
			else {
				System.out.println("You fool there is no day called "+userInput);
			}
		}
	}	

}
