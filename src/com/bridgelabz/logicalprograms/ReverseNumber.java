package com.bridgelabz.logicalprograms;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		 int num = 0, reversed = 0;  
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter The Number");
		 num=sc.nextInt();
		    while(num != 0) {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num = num/10;
		    }
		    System.out.println("Reversed Number: " + reversed);

	}

}
