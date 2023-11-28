package TockennizerProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		
		int data,even=0,odd=0;
		String write_data;
		try {
			Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("myfile.txt");
			System.out.print("Enter the data : ");
			write_data = sc.nextLine();
			fw.write(write_data);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader in=new BufferedReader(new FileReader("myfile.txt"));
		String str=in.readLine();
		StringTokenizer string=new StringTokenizer(str);
		while(string.hasMoreTokens()) {
			data=Integer.parseInt(string.nextToken());
			if(data%2==0) {
				 even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("no of evennumbers="+even);
		System.out.println("no of odd numbers="+odd);

	}

}
