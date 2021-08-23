package com.bridgelabz.logicalprograms;
import java.util.*;
import java.time.*;
public class StopWatch {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			Instant start, end;
			System.out.println("Press 1 to Start");
			int input1 = sc.nextInt();
			if(input1 == 1) {
				start = Instant.now();
			}
			else {
				System.out.println("Wrong option");
				return;
			}
				
			System.out.println("Press 2 to stop");
			int input2 = sc.nextInt();
				
			end = Instant.now();
			Duration timeTaken = Duration.between(start, end);
			System.out.println("Time elapsed : "+ timeTaken.toMillis()/1000 +"seconds");
		}
	
}