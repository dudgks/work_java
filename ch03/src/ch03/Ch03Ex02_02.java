package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int width = Integer.parseInt(numbers[0]);
		int length = Integer.parseInt(numbers[1]);
				
		width += 5;
		length *= 2;
		
		int area = width * length;

		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);




	}
}
