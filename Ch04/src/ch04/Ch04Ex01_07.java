package ch04;

import java.text.BreakIterator;
import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {

		char ch = '0';

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();	
		String a = Integer.toString(ch);
		

		if (ch < 'A') {				
			System.out.println("Excellent");
		}
		else if('A' < 'B') {			
			System.out.println("Good");
		}
		else if('B' < 'C') {
			System.out.println("Usually");
		}
		else if ('C' < 'D') {		
			System.out.println("Effort");
		}
		else if('D' < 'F') {
			System.out.println("Failure");
		}
		else {
			System.out.println("error");
			
		}
	}

}
