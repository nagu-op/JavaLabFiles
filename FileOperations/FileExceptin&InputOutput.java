

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTrial  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String write_data;
		String write_data_2 = "";
		
		try {
			FileWriter fw = new FileWriter("INPUT.txt");
			System.out.println("OUTPUT.txt created");
			System.out.print("Enter the data : ");
			write_data = sc.nextLine();
			fw.write(write_data);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("INPUT.txt");
			int read_data = fr.read();
			while(read_data != -1) {
				write_data_2 += (char)read_data;
				read_data = fr.read();
			}
			System.out.println("Data : " + write_data_2);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fw2 = new FileWriter("OUTPUT.txt");
			System.out.println("The contents in INPUT.txt is copied to OUTPUT.txt succesfully");
			fw2.write(write_data_2);	
			fw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}
}
