package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		int res1 = num1 / num2;
		
		double res2 = (double)num1 /num2;
		
		System.out.printf("%d %.2f", res1, res2);
		
	}

}
