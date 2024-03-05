package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {

	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your first and last name");
	   String s1=sc.next();
	   String s2=sc.next();
	   
		Email e=new Email(s1,s2);
		
		System.out.println(e.showInfo());
		
	    System.out.println("-----------");
		
        System.out.println("For more Enter 1: ");
        
        int choice=sc.nextInt();
        if(choice==1) {
    		System.out.println("set the alternate Email: ");
    		String alemail=sc.next();		
    		e.setAlternateEmail(alemail); 		
    		
    		System.out.println("set the Mailbox Capacity: ");
    		int MBC=sc.nextInt();		
    		e.setMailboxCapacity(MBC);
    		
    		System.out.println("set the new password: ");
    		String pass=sc.next();		
    		e.changePassword(pass);
    		
    		System.out.println("Your alternate Email is: "+e.getAlternateEmail());
    		System.out.println("Now your Mailbox Capacity is: "+e.getMailboxCapacity());
    		System.out.println("Your new password is: "+e.getPassword());


        }

	}

}
