import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class fileOddEven {
    public static void main(String []args){
        
        System.out.println("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[] arr = new int[limit];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i<limit;i++){
                        arr[i] = sc.nextInt();
        }
        System.out.println("The array of numbers is: ");
        for(int i = 0; i<limit;i++){
            System.out.println(arr[i]);
    }
    try{
            FileWriter oddwriter = new FileWriter("odd.txt");
            FileWriter evenWriter = new FileWriter("even.txt");
            String value;
            for(int i = 0; i<limit;i++){
                if(arr[i]%2==0){
                    value = String.valueOf(arr[i]);
                    evenWriter.write(value);
                    evenWriter.append("\n");
                }
                else{
                    value = String.valueOf(arr[i]);
                    oddwriter.write(value);
                }
        }
        oddwriter.close();
        evenWriter.close();
    }
    catch(IOException e){
        e.getStackTrace();
    }
 
    


}
}