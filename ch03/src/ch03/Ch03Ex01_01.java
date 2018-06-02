package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		int res1 = num1 + 100;
		int res2 = num2 % 10;
		
		System.out.printf("%d %d%n", res1, res2);


	}

}
