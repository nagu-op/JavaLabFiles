package BankingApp;
import java.util.Scanner;
class Customer{
	int accountNumber;
	String accountType;
	String customerName;
	int accountBalance;
	Scanner sc = new Scanner(System.in);
	public void setCustomerDetails() {
		System.out.println("Enter the account number ");
		accountNumber = sc.nextInt();
		System.out.println("Enter the account Type number ");
		accountType= sc.next();
		System.out.println("Enter the customer Name");
		customerName= sc.next();
		System.out.println("Enter the account Balence");
		accountBalance= sc.nextInt();
	}
	
	public void getCustomerDetails() {
		System.out.println("The accout number is "+accountNumber);
		System.out.println("The accout Type is "+accountType);
		System.out.println("The Customer name is "+customerName);
		System.out.println("The accout balance is $"+accountBalance);
	}
}




public class step1 {
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers :");
		int numberOfCustomer = sc.nextInt();
		Customer [] customer = new Customer[numberOfCustomer];
		for (int i = 0; i<numberOfCustomer;i++){
			customer[i] = new Customer(); // used for creating objects for each user...
			customer[i].setCustomerDetails();
		}
		for (int i = 0; i<numberOfCustomer;i++){
		
			customer[i].getCustomerDetails();;
		}
	}
}
