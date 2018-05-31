package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a1 = scanner.nextLine();
		String b1 = scanner.nextLine();
				
		int num1 = Integer.parseInt(a1);
		int num2 = Integer.parseInt(b1);
		
		System.out.printf("%d > %d --- %b%n",num1 , num2, num1 > num2); 
		System.out.printf("%d < %d --- %b%n",num1 , num2, num1 < num2);
		System.out.printf("%d >= %d --- %b%n",num1 , num2, num1 >= num2);
		System.out.printf("%d <= %d --- %b%n",num1 , num2, num1 <= num2);
		
}
}