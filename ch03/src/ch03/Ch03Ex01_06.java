package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
				
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int a = 2;
		int b = 0;						
		
		System.out.printf("%b", 'a' == 'b');
		System.out.printf("%b", 'b' == 'b');
	}

}
