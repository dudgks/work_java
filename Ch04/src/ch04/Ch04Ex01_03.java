package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
		System.out.print("현제나이는?>");

		int j = 20;

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int year = Integer.parseInt(tmp);

		if(year > j) {
			System.out.println("adult");
		} else if(year < j) {
			System.out.printf("%dyearslater", j - year);

		}
	}
}
