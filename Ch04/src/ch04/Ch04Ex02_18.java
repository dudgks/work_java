package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {
		// 1. 자연수 하나 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());

		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		} 

		for (int a = 1; a < num; a++) {
			for (int b = 0; b < num; b++) {
				if (b >= a) {
					System.out.print("#");

				}
				else {
					System.out.print(" ");
				} 

			}
			System.out.println();

		}

	}

}
