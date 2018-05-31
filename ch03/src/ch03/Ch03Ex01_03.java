package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 10;
		++a;
		
		int b = 20;
		--b;
		
				
		String a1 = scanner.nextLine();
		String b1 = scanner.nextLine();
				
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		
		int result = a2 * b;
		
		System.out.printf("%d",a, a1);
		System.out.printf("%3d",b, b1);
		System.out.printf("%4d", result);
		
		
		
		
	}

}
