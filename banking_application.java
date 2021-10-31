package bank;
import java.util.*;
public class banking_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("This is online banking account project created by Arpit ");
	    System.out.println("=====================================================================================================================================================================");
	    System.out.print("Enter your name : ");
		String sname=input.next();
		 System.out.println("=====================================================================================================================================================================");
		 System.out.print("Enter your id : ");
		String cid=input.next();
		 System.out.println("=====================================================================================================================================================================");
		
		 bank obj=new bank(sname,cid);
		
		obj.showmenu();
	}
	static class bank
	{
		
		int balance ;
		int previoustransaction;
		String customername;
		String customerid;
		
		bank(String cname,String cid)
		{
			customername=cname;
			customerid=cid;
			
		}
		
		void deposit(int amount)
		{
			
			if (amount!=0)
			{
				balance+=amount;
				previoustransaction=amount;
				
			}
		}
		void withdraw(int amount)
		{
			if (amount!=0)
			{
				balance-=amount;
				previoustransaction=amount;
				
			}
		}
		
		void getprevioustransaction()
		{
			if(previoustransaction>0)
			{
				System.out.println("deposited !!!!"+previoustransaction);
			}
			else if(previoustransaction <0)
			{
				System.out.println("withdrawn !!!!"+Math.abs(previoustransaction));
			}
			else 
			{
				System.out.println("No transaction occured ");
			}
		}
		public static void show()
		{
			System.out.println("A. CHECK BALANCE");
			System.out.println("B. DEPOSIT");
			System.out.println("C. WITHDRAW");
			System.out.println("D. PREVIOUS TRANSACTION");
			System.out.println("E. EXIT");
		}
		
		void showmenu()
		{
			
			char option='\0';
			Scanner input=new Scanner(System.in);
			
			System.out.println("Welcome " +customername);
			System.out.println("Your id is "+customerid);
			System.out.println("\n");

			do 
			{
				show();
				System.out.println("Enter an option");
				option=input.next().charAt(0);
				
				System.out.println("\n");
				
				switch(option)
				{
				case 'A': 
					System.out.println("BALANCE OF ACCOUNT IS " +balance);
					System.out.println("\n");
					
					break;
					
				case 'B':
					System.out.println("Enter the amount to deposit: ");
					int amount=input.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
				case 'C':
					System.out.println("Enter the amount to wihdraw:");
					int amount2=input.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					
					break;
					
				case 'D':
					System.out.println();
					getprevioustransaction();
					System.out.println("\n");
					break;
				case 'E':
					System.out.println("********************************");
					System.out.println("\n");
					
				default :
					System.out.println("Invalid option");
					break;
				}
				
			}
			while(option !='E');
			
			
			System.out.println("Thanks for using Arpit bank ");
				
				
				
				
	}
}
}
