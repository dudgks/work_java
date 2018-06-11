package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요.>");
		String input = scanner.nextLine();
		int year = Integer.parseInt(input);

		if(year % 400 == 0) {
			System.out.println("leap year");
		} else if (year % 4 ==0) {
			System.out.println("leap year");
		} else if (year % 100 !=0) {
			System.out.println("common year");
		}
	}

}
