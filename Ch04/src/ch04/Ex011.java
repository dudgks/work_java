package ch04;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	
		int num = Integer.parseInt(tmp);
		
		for(int i=0; i < str.length(); i++) {
			sum += num%10;	
			System.out.printf("sum = %3d num = %d%n", sum, num);
			num /= 10;
		}
		System.out.println("sum="+sum);
	}
}