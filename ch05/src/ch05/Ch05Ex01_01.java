package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		int[] str = new int [10];
		
		Scanner scanner =  new Scanner(System.in);
		String input = scanner.nextLine();
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%c", str[i]);			
		}
		System.out.println();
	}

}
