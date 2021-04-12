package com.madhavjasti_C0789050_a9;

import java.util.*;

public class BobsHomeComputer {

	public static double sales ;
	public static double rate;
	public static double commission;
	public static double advance;
	public static double pay;
	
	public static double commissionRate(double sales){
		
		if(sales<10000) {
		    commission = (sales/100)*5 ; 
		}
		 else if ((sales<=14999) && (sales>=10000)) {
			commission = (sales/100)*10 ;
		}
		 else if ((sales<=17999) && (sales>=15000)) {
			commission = (sales/100)*12 ;
		}
		 else if ((sales<=21999) && (sales>=18000)) {
			commission = (sales/100)*15 ;
		}
		 else if(sales>=22000) {
			 commission = (sales/100)*16 ;
		 }
		return commission;
	}
	public static void salesPersonsPay(double advance,double rate)
	{
		if(advance<0 || advance>1500) {
			System.out.println("Advance pay is not more than $1500 and not less than $0");
		}else {
			pay = rate - advance;
			if(pay<0) {
				System.out.println("salesperson must pay $"+ String.format("%.2f", -pay)+" back");
			}else {
				System.out.println("salesperson earned amount $"+String.format("%.2f", pay));
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the sales persons monthly sales :");
		try {
			 sales = Double.parseDouble(s.nextLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.print("Enter the amount of advance pay :");
		try {
			advance = Double.parseDouble(s.nextLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			s.close();
		}
		double rate = commissionRate(sales);
		salesPersonsPay(advance, rate);
	}
	
}
