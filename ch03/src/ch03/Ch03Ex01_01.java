package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 100;
		int b = 10;		
		
		String a1 = scanner.nextLine();
		String b1 = scanner.nextLine();

		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
								
		System.out.printf("%d", a2 + a);
		System.out.printf("%2d", b2 % b);


	}

}
