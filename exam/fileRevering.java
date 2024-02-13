import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class fileRevering {
    public static void main(String [] args){
        try{
            FileReader reader = new FileReader("hellow.txt");
            int data = reader.read();
            char []arr = new char [1000];
            int limit=0,i=0;
            while(data != -1){
                arr[i] = (char)data;
                i++;
                limit++;
                data = reader.read();
            }
            reader.close();
            System.out.println("The char array is");
            for(int j = 0 ; j<limit; j++){
                System.out.print(arr[j]);
            }
            FileWriter writer = new FileWriter("file3.txt");
            for(int j= limit-1;j>=0;j--){
                writer.write(arr[j]);
            }
            writer.close();
        }
        catch(IOException e){
            e.getStackTrace();
        }
        
        
    }
    
}
