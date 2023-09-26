/*File          : GreatestAmoungThree.java
 *Description   : Find the greatest among three numbers
 *Author        : Nagaraj Menon K S 
 * Version      : 1.0
 * Date			: 26/09/2023
 * */

package firstJavaLab;
import java.util.Scanner;
public class GreatestAmoungThree {
	public static void main(String[]args) {
		int numberOne,numberTwo,numberThree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number:");
		numberOne = sc.nextInt();
		System.out.println("Input the number:");
		numberTwo = sc.nextInt();
		System.out.println("Input the number:");
		numberThree = sc.nextInt();
		if (numberOne>numberTwo && numberOne > numberThree) {
			System.out.println("The greatest number is "+numberOne);
		}
		else if(numberTwo>numberThree) {
			System.out.println("The greatest number is "+ numberTwo);
		}
		else {
			System.out.println("The greates number is "+ numberThree);
		}
	}
	

}
