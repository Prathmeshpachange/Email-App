package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private int mailboxCapacity=500; 
	private int defaultPasswordLength=6;
	private String companySuffix="modernday.com"; 
	
	//constructor reciving first name and last name
	public Email(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
		//calling method Department
		this.department=setDepartment();
		
		//calling method random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: "+this.password);
		
		//combine element to generate Email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	}
	//Asking for Department
	private String setDepartment() {
	   System.out.println("Hii "+firstName+" choose your department code\n1 for sales\n2 for Development\n3 for Accounting\n4 for none\n"+"Enter the department code");
	   
	   Scanner sc=new Scanner(System.in);
	   int departmentChoice=sc.nextInt();
	   
	   if(departmentChoice==1) {
		   return "Sales";
	   } 
	   else if(departmentChoice==2) {
		   return "Development";
	   }
	   else if(departmentChoice==3) {
		   return "Accounting";
	   }
	   else {
		   return "";
	   }
	}
	
	//Generating a random password 
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%&";
		char[] password=new char[length];
		
		for(int i=0; i<length; i++) {
			
			int rand=(int) (Math.random()*passwordSet.length());
			
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//mailbox capacity
	  public void setMailboxCapacity(int capacity) {
		  this.mailboxCapacity=capacity;
	  }
	  
	//alternate email
	  public void setAlternateEmail(String altEmail) {
		  this.alternateEmail=altEmail;
	  }
	  
	//change Password
	  
	  public void changePassword(String password) {
		  this.password=password;
	  }
	  
	//returning mail box capacity, alternate email and password.  
	  public int getMailboxCapacity() {
		  return mailboxCapacity;
	  }
	  
	  public String getAlternateEmail() {
		  return alternateEmail;
	  }
	  
	  public String getPassword() {
		  return password;
	  }
	  
	  public String showInfo(){
		  
		  return "Display Name: "+ firstName+" "+lastName +"\n" +
				  "Company Email: "+ email + "\n" +
				  "Mailbox Capacity: "+ mailboxCapacity +" mail";
	  }
}
