package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   	     	 		 

		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		int num3 = Integer.parseInt(scanner.nextLine());

		boolean isNum1Big01 = num1 > num2;		// num1이 num2보다 크면 true
		boolean isNum1Big02 = num1 > num3;		// num1이 num3보다 크면 true
		boolean isNum1Big = isNum1Big01 && isNum1Big02; // 두 결과 모두 true면 num1이 가장 크다

		boolean isSame01 = num1 == num2;	// num1과 num2가 같으면 true
		boolean isSame02 = num1 == num3;	// num1과 num2가 같으면 true
		boolean isSame = isSame01 && isSame02;	// 두 결과 모두 true면 세 개의 수가 모두 같다

		System.out.printf("%b %b%n", isNum1Big, isSame);                   
	}
}
