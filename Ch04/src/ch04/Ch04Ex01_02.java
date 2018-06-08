package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		String weight;
		String height;

		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int height1 = Integer.parseInt(numbers[0]);
		int weight1 = Integer.parseInt(numbers[1]);

		int result = (weight1 + 100) - height1;
		System.out.println(result);
		
		if(result > 0) {
			System.out.println("Obesity");
		}
	}

}
