package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
				
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
				
		System.out.printf("%b%n", "strNum1" == "strNum1");
		System.out.printf("%b%n", "strNum2" != "strNum2");	
	}
}

