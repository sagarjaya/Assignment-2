package com.assignment2.java;
import java.util.*;
public class Months {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a month: ");
		String month=scan.next();
		System.out.print("Enter a year: ");
		int year=scan.nextInt();
		scan.close();
		int no=0;
		month=month.toLowerCase();
		switch(month) {
		case "january":
			no=31;
			break;
		case "february":
			no=28;
			if((year%400==0) || (year%4==0) && (year%100!=0))
			{
		no=29;
	}else {
		no=28;
	}
			break;
		case "march":
			no=31;
			break;
		case "april":
			no=30;
			break;
		case "may":
			no=31;
			break;
		case "june":
			no=30;
			break;
		case "july":
			no=31;
			break;
		case "august":
			no=31;
			break;
		case "september":
			no=30;
			break;
		case "october":
			no=31;
			break;
		case "november":
			no=30;
			break;
		case "december":
			no=31;
			break;
		default:
			System.out.println(month+" is invalid name");
		}
		System.out.println(year+" "+month+" has "+no+" days");
		
	}

}
