package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());					
		
		boolean res1 = num1 != 0;
		boolean res2 = num2 != 0;
		
		System.out.printf("%b %b%n", res1 && res2, res1 || res2);
	}

}
