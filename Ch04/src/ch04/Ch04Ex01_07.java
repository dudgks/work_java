package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {

		char grade = '0';

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();	

		if (grade == 'A') {				
			System.out.println("Excellent");
		}
		else if (grade == 'B') {			
			System.out.println("Good");
		}
		else if(grade == 'C') {
			System.out.println("Usually");
		}
		else if (grade == 'D') {		
			System.out.println("Effort");
		}
		else if(grade == 'F') {
				System.out.println("Failure");
			}
		else {
			System.out.println("error");
		}
	}

}
