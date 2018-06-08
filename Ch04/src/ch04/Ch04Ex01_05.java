package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {

		double x = 0.0;
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		double a = Double.parseDouble(numbers[0]);
		double b = Double.parseDouble(numbers[1]);
		String[] numbers1 = scanner.nextLine().split(" ");
		double c = Double.parseDouble(numbers[0]);
		double d = Double.parseDouble(numbers[1]);

		if(x >= 4.0) { 
			System.out.println('A');
		} if (x >= 3.0) {
			System.out.println('B');		
		}else {
			System.out.println('C');
		}

	}

}
