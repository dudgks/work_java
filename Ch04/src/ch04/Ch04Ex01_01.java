package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		i = Integer.parseInt(tmp);
		String tmp2 = scanner.nextLine();
		j = Integer.parseInt(tmp2);
		
		if(j < 0) {
			System.out.println(j);
			System.out.println("minus");
			if(i > 0) {
				System.out.println(i);
			}
		}
		
	}
}
