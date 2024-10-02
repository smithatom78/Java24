package m1;
import java.util.*;

class Account11{
String accname,acctype;
int accbalance=0;
int accno;

void DepositAccount(int damount){
try {
if(damount<=0)
{
throw new InvalidAmountException("Enter amount greater than 0");
}
accbalance=accbalance+damount;
}
catch(InvalidAmountException a) {
System.out.println(a);
}

}
void WithdrawAccount(int wamount){
try {
if(wamount>accbalance)
{
throw new InsufficientAmountException("Insufficient Balance");
}
accbalance=accbalance-wamount;
}
catch(InsufficientAmountException e) {
System.out.println(e);
}

}
void Display(){
System.out.println("Account name="+accname+"\nAccount No:"+accno+"\n"
+ "Account Balance:"+accbalance+"\nAccount Type:"+acctype+"\n");

}

boolean searchAccount(int accno){
    if(this.accno==accno) {
        return(true);
    }
    else {
        return(false);
    }
    
}

}

public class BankDemo{

public static void main(String[] args)  {

   Scanner s=new Scanner(System.in);

   System.out.println("Enter The number of Customers");
   int n=s.nextInt();
   Account11 a[]=new Account11[n];
   
   int i=0;
   int num=0;
   int accno,flag=0;
   

while(true) {
System.out.println("Choose operation \n1.Create Account\n2.Show Account"
+"\n3.Deposit the amount\n4.Withdraw the amount\n5.Search Account \n6.Exit");
int ch=s.nextInt();

switch(ch) {

case 1: 
    num++;
    while(i<num) {
        a[i]=new Account11();
  System.out.println("Enter the name of the Account Holder");
  a[i].accname=s.next();
  System.out.println("Enter the type of the Account");
  a[i].acctype=s.next();
  System.out.println("Enter the account number of the customer");
  a[i].accno=s.nextInt();
  System.out.println("Enter account balance of the customer");
  a[i].accbalance=s.nextInt();
  i++;
    }
break;

case 2:
    for(int j=0;j<num;j++) {
        System.out.println("\n\tDetails of the Customer "+(j+1)+"\n\n");
        a[j].Display();
    }
 break;
 
case 3:
    System.out.println("Enter the Account number");
    accno=s.nextInt();
    {
    for(i=0;i<num;i++) {
        if(a[i].searchAccount(accno)){
            System.out.println("Enter the amount to be deposited");
            int damount=s.nextInt();
            a[i].DepositAccount(damount);
            flag=1;
            break;
        }
    }
    if(flag==0)
        System.out.println("Invalid account number");
    }
    
break;
    
case 4:
    System.out.println("Enter the Account number");
    accno=s.nextInt();
    
    for(i=0;i<num;i++) {
        if(a[i].searchAccount(accno)){
            System.out.println("Enter the amount to be Withdrawn");
            int wamount=s.nextInt();
            a[i].WithdrawAccount(wamount);
            flag=1;
            break;
        }
 if(flag==0)
     System.out.println("Invalid Account number");
    }
    
break;

case 5:
    System.out.println("Enter the Account number");
    accno=s.nextInt();
    
    {
    for(i=0;i<num;i++) {
        if(a[i].searchAccount(accno)){
            System.out.println("Account found\n");
            a[i].Display();
            flag=1;
            break;
        }
    }
    if(flag==0) {
        System.out.println("Search Failed");
    }
    }
break;
case 6:
System.exit(0);

}
}

}

}