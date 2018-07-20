package Test01;

import java.util.Scanner;

public class te1 {
	public static void main(String[] args) {
		int[][] score = new int[4][3];

		for(int i = 0; i < score.length; i++) {
			System.out.printf("%dclass?", i + 1);

			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(numbers[j]);

			}
		}

		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			for(int j = 0; j < score[i].length; j++) {
			int a = j > 0 ? j : 0;
			}
			System.out.printf("%dcalss : %d%n", i + 1);
		}
	}	
}
