import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class fileReader {
    public static void main(String [] args){
        try{
            FileWriter writer = new FileWriter("hellow.txt");
            System.out.println("Enter the required details: ");
            Scanner sc = new Scanner(System.in);
            String details = sc.nextLine();
            writer.write(details);
            writer.close();
            System.out.println("The details in hellow.txt is : ");
            FileReader file = new FileReader("hellow.txt");
            int data = file.read();
            while(data!= -1){
                System.out.print((char)data);
                data = file.read();
            }
            file.close();
        }
        catch(FileNotFoundException e){
            e.getStackTrace();
        }
        catch(IOException e){
            e.getStackTrace();

        }

    }
}
