package m1;
import java.util.Scanner;
class Account {
	Long AccNo ;
	String Name;
	double balance;
	
	void printDetails() {
		System.out.println("Name of Acc Holder : "+Name+"\nAccount Number : "+AccNo+"\nBalance : "+balance);
	}
}

class SavingsAccount extends Account{
	Scanner s= new Scanner(System.in);
	double interest = 0.1,interestAmount;
	
	void AddInterest() {
		System.out.println("Enter the Time Period : ");
		int time = s.nextInt();
		
		interestAmount=(balance*interest*time)/100;
		
		balance = balance +interestAmount;
		
		System.out.println("An amount of "+interestAmount+" has been credited to your Account");
	}
}

class CurrentAccount extends Account{
	int overdraftL;
	
}
public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch;
		
		System.out.println("How many Accounts do you want to create : ");
		int num = s.nextInt();
		
		do {
			System.out.println("Which type of Account do you wish to create :\n1.Regular Account\n2.Savings Account\n3.Current Account");
			int choice = s.nextInt();

			if(choice==1) {
				Account Acc1[]=new Account[num];
				for(int i=0;i<num;i++) {
					Acc1[i] = new Account();
				//}
				//for(int i=0;i<num;i++) {
					System.out.println("Enter the Account Holder name : ");
					Acc1[i].Name=s.next();
					System.out.println("Enter the Account no : ");
					Acc1[i].AccNo=s.nextLong();
					//Acc1[i].AccNo=Acc1[i].AccNo++;
					System.out.println("Enter the Amount : ");
					Acc1[i].balance=s.nextDouble();
					//Acc1[i].balance=0;
					}
				for(int i=0;i<num;i++) 
				{
				Acc1[i].printDetails();
				}
				
			}
			else if(choice==2) {
				SavingsAccount Acc1[]=new SavingsAccount[num];
			}
			else if(choice ==3) {
				CurrentAccount Acc1[]=new CurrentAccount[num];
			}
			else {
				System.out.println("Wrong Input");
			}
			
			System.out.println("Do u wish create more account ?");
			ch=s.next().charAt(0);
			
			//System.out.println(Acc1[1].Name);
			
		}while(ch=='y'||ch=='Y');
		
		for(int i=0;i<num;i++) {
		//	System.out.println(Acc1[i].Name);
		}
		
	}

}