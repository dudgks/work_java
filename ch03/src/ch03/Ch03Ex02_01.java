package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" "); // 가로로 입력받을 때

		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.printf("%d / %d = %d...%d%n",num1, num2, quotient, remainder);												

	}
}