package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what year is it");
		int year = scan.nextInt();
		System.out.println( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
		
		
		
		// TODO Auto-generated method stub

	}

}
