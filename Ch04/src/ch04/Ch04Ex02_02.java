package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseUnsignedInt(input);
		
		int sum = 0;
		int b = 1;
		
		while(b <= 10) {
			++b;
			System.out.printf("%d%n", b, sum);
		}
	}


}
