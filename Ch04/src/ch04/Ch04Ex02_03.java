package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("정수를 입력하세요(0:종료).>");
			
			String tmp = scanner.nextLine(); 
			i = Integer.parseInt(tmp);
			if(i == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (i > 0) {
				System.out.println("positive integer");
			} else if (i < 0) {
				System.out.println("negative integer");
				continue;
			
			}
		}
	}
}
	

