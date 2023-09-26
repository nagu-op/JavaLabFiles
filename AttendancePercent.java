/*File          : AttendancePercent.java
 *Description   : Find the marks for the attendance according to there attendance percent
 *Author        : Nagaraj Menon K S 
 * Version      : 1.0
 * Date			: 26/09/2023
 * */

package firstJavaLab;
import java.util.Scanner;
public class AttendancePercent {
	public static void main(String[]args) {
		float attendancePercent;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the attendance percentage");
		attendancePercent = sc.nextInt();
		if (attendancePercent >= 90) {
			System.out.println("The mark is "+10);
		}
		else {
			float newMark = attendancePercent/10;
			System.out.println("The mark is "+newMark);
		}
	}

}
