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

		/* in the below the following logic takes place:
	for eg lets take a array arr = [1,1,7,3]
 	the main quetion arises when we ask will the 1 get appended to the arr 2 because when we check arr[i] == arr[j] the Repeat getts addded hence skipping the element 1
  	But no, it won't do that
	instaed it will first check arr[i] (ie 1) and will check it with arr[j](ie, arr[i+1] = 1 it self) it will skip the numberr by incrimenting 1 to Repeat,
 	now i takes the position 1 that is arr[1] (ie one itself) and check it with arr[j] (ie, arr[2] = 7 ). Hence arr[1] != arr[2] && arr[1] != arr[3],
	therefore arr[1](ie, 1) will get appended to arr2 resulting arr 2 = [1,7,3]
 	then it will get bubble sorted and arr[1] is outputted as the second smalleset number...
  */
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
