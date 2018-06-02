package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		double num1 = Double.parseDouble(numbers[0]);
		double num2 = Double.parseDouble(numbers[1]);
		
		int res1 = (int)(num1 * num2);
	
		// 두 수를 각각 정수로 변환하여 곱을 구하기
		int res2 = (int)num1 * (int)num2;
		
		// 결과 출력
		System.out.printf("%d %d%n", res1, res2);
	}

}
