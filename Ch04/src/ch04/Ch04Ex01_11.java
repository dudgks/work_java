package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = Integer.toString(a);

		if(a == 0) {
			System.out.println("zero");
		} if (a > 0) {
			System.out.println("plus");
		} if(a < 0) {
			System.out.println("minus");

		}
	}


}


