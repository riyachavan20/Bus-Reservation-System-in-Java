package com.java.bus;
import java.util.*;
public class Bus {
public static void main(String[] args) {
	System.out.println("enter bus you are looking for:");
	Scanner sc=new Scanner(System.in);
	String bus=sc.next();
	if(bus.equals("shivshahi") || bus.equals("humsafar") || bus.equals("shreyas"))
	{
		System.out.println("enter num of members:");
	}
	int mem=sc.nextInt();
	switch(mem)
	{
	case 1:
		System.out.println("costing for 1 person is 5000 Rs");
		break;
	case 2:
		System.out.println("costing for 2 persons is 10000 Rs");
		break;
	case 3:
		System.out.println("costing for 3 persons is 15000 Rs");
		break;
	case 4:
		System.out.println("costing for 4 persons is 20000 Rs");
		break;
	case 5:
		System.out.println("costing for 5 persons is 25000 Rs");
		break;
		default:
			System.out.println("enter choice below 5");
	}
	System.out.println("Which ward do you want to take?");
	String ward=sc.next();
	if(ward.equals("general"))
	{
		System.out.println("you do not have additional costing, it is same as mentioned above");
	}
	else
	{
		switch(ward)
		{
		case "ac":
			System.out.println("additional 2000 per person");
			break;
		case "sleeper":
			System.out.println("additional 1000 per person");
			break;
		}
	}
	System.out.println("what do you want to do next?");
	String reply=sc.next();
	if(reply.equals("book_tickets"))
	{
		System.out.println("how would you like to pay?");
		String method=sc.next();
		if(method.equals("phonepay") || method.equals("gpay") || method.equals("card"))
		{
			System.out.println("you can proceed with the payment");
			System.out.println("you have successfully booked your tickets");
			System.out.println("Thank you for using red bus, Have a good day!!");
		}
	}
	else
	{
		System.out.println("Thank you for using red bus, Have a good day!!");
	}
}
}
