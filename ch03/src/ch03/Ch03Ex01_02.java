package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 5;
				
		String strNum1 = scanner.nextLine();
		int a1 = Integer.parseInt(strNum1);
		
		int result = a += 2; 
		
		System.out.println(a1);
		System.out.printf("%d", result);
		
		
		
	}

}
