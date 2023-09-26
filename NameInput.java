/*File          : NameInput.java
 *Description   : To input and print the name of the user
 *Author        : Nagaraj Menon K S 
 * Version      : 1.0
 * Date			: 26/09/2023
 * */




package firstJavaLab;
import java.util.Scanner;
public class NameInput {
	public static void main(String[]args) {
		System.out.println(" Enter the name: ");
		String num;
		Scanner sc = new Scanner(System.in);
		num = sc.next();
		System.out.println("The name is "+num);
		
		}
}
