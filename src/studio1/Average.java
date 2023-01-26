package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("The first integral to be averaged?");
		int n1 = scan.nextInt();
		System.out.println("The second integral to be averaged?");
		int n2 = scan.nextInt();
		double average = (n1+n2) / 2.0;
		System.out.println("The average is " + average);
				
	}

}
