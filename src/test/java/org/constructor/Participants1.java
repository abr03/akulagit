package org.constructor;

public class Participants1 {

	String name;
	String email;
	boolean paymentStatus;
	int phone;
	
	/*
	 *  Rules for creating constructor - constructor construct the values for object
	 * 
	 *  1- Constructor will have the same name as class name
	 *  2- does not return any value - any return type not even void
	 *  3- will be called automatically when you create object
	 */
	
	public Participants1()
	{
		System.out.println("Calling default cons......");
	}
	
	
	
	public Participants1(String fullName,String emaildID,boolean status,int phoneNumber)
	{
		System.out.println("Calling cons......");
		
		name=fullName;
		
		email=emaildID;
		
		paymentStatus=status;
		
		phone=phoneNumber;
	}
	
	
	public static void main(String[] args) 
	{
		/*
		Participants anshul=new Participants("Anshual Kumar", "anshual@gmail.com", true, 44);
		Participants deepthi=new Participants("Deepti Joshi", "joshi@gmail.com", false, 55);
		Participants keerthi=new Participants("keerthi", "keerthi@gmail.com", false, 98);
		
		*/
		
		Participants1 anshul=new Participants1("Anshual Kumar", "anshual@gmail.com", true, 44);
		Participants1 deepthi=new Participants1();
		Participants1 keerthi=new Participants1();
		Participants1 akula = new Participants1(null, null, false, 0);
		
		System.out.println(keerthi.phone);
		System.out.println(deepthi.phone);
		System.out.println(anshul.phone);

		

	}
}
