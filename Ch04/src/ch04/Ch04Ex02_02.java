package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>");
		String input = scanner.nextLine();
		int a = Integer.parseUnsignedInt(input);
		
		int sum = 0;
		int b = 0;
		
		while(b < 15) {
			++b;
			System.out.printf("%d", b, sum);
		}
	}


}
