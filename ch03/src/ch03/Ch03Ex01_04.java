package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println(num1 == num2);
		
		System.out.println(num1 != num2);
	}
}

