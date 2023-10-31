package ArraySmallest;
import java.util.Scanner;
public class SmallestElement {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter the limit of the array: ");
		int limit = sc.nextInt();
		int arr [] = new int[limit];
		for(int i = 0 ; i<limit; i++) {
			System.out.println("Enter the element ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The elemetns in the array are:");
		for(int i = 0 ; i<limit; i++) {
			
			System.out.print(" "+arr[i]+" ");
		}
		
		int [] arr2 = new int [limit];
		int count = 0;
		for (int i = 0; i<limit; i++) {
			int Repeat = 0;
			for(int j = i + 1;j<limit; j++) {
				if (arr[i]== arr[j]) {
					Repeat++;
					
				}
			}
			if (Repeat== 0) {
				arr2[count] = arr[i];
				count ++;
			}
		}
		int temp;
		for(int i = 0; i<count; i++) {
			for(int j = i + 1; j<count; j++) {
				if (arr2[i]>arr2[j]) {
					temp = arr2[i];
					arr2[i]= arr2[j];
					arr2[j]= temp;
				}
			}
		}
		System.out.println("The seconed smallest number is "+ arr2[1]);
//		System.out.println("The smallest element is ");
//		System.out.print(" "+arr[0]+" ");
	
	}

}
