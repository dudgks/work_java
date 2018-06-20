package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		for(int i = 0; i < numbers.length; i++) {
			boolean changed = false; // 자리바꿈 체크
			
			for(int j = 0; j < numbers.length - 1 - i; j++) {
				if(numbers[j] > numbers[j + 1]) {		// 옆의 값이 작으면 서로 바꾼다.
					String temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					changed = true;
		}
				
		
		
		
	}

}
	}
}
