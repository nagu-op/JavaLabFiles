package Strings;
import java.util.Scanner;
public class StringRversing {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String userInput = sc.next();
		int len = userInput.length();
		char []  rev = new char[userInput.length()];
		int j = len-1;
		for(int i = 0; i< userInput.length(); i++) {
			rev[i] = userInput.charAt(j);
			j--;
		}
		System.out.println("The reversed String is\n ");
		for(int i = 0; i< userInput.length(); i++) {
			System.out.print(rev[i]);
		}
		
	}
}
