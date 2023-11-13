package BankingApp;
import java.util.Scanner;

class InvalidAmountException  extends Exception  
{  
    public InvalidAmountException (String str)  
    {  
        
        super(str);  
    }  
}  
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
		System.out.println("..............................................");
		System.out.println("The accout number is "+accountNumber);
		System.out.println("The accout Type is "+accountType);
		System.out.println("The Customer name is "+customerName);
		System.out.println("The accout balance is $"+accountBalance);
		System.out.println("..............................................");
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
		
		
		int choice = 0;
		int searchAccount;
		while (choice != 5) {
			System.out.println("\n 					Menu  					\n");
			System.out.println("1.Display Account DEtails");
			System.out.println("2.Search the account ");
			System.out.println("3. Deposit");
			System.out.println("5. Exit ");
			System.out.println("Enter the choice");
			choice = sc.nextInt();

			
			if (choice == 1) {
				for (int i = 0; i<numberOfCustomer;i++){
					
					customer[i].getCustomerDetails();;
				}
			}
			
			else if(choice == 2) {
				System.out.println("Enter the Accont number ");
				searchAccount = sc.nextInt();
				for(int i = 0; i<numberOfCustomer;i++) {
					if (customer[i].accountNumber == searchAccount) {
						customer[i].getCustomerDetails();
					}
				}
			}
			
			else if (choice == 3) {
				try {
				System.out.println("Enter the Accont number to be searched");
				searchAccount = sc.nextInt();
				System.out.println("Enter the amount to depost ");
				int depositAmount = sc.nextInt();
				if (depositAmount < 0) {
					throw new InvalidAmountException("amount less than 0");
				}
				for(int i = 0; i<numberOfCustomer;i++) {
					if (customer[i].accountNumber == searchAccount) {
						customer[i].accountBalance = customer[i].accountBalance + depositAmount;
					}
				}
			}
				catch(InvalidAmountException e) {
					System.out.println("The amount is less than 0");
					
				}
				
				
			}
		}
	
	}
}
