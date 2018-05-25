package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
	    int num = Integer.parseInt(input);
		String A = scanner.nextLine();
	    float B = Float.parseFloat(A);
	   
	    // 1. num과 B를 곱한 값을 저장한 변수 생성
	    
	    // 2. num과 B, 1번에서 생성한 변수를 이용해서 출력
	    
	    System.out.printf("49 * 0.268300= %f", num, B);
	    System.out.println(13.146700);
		
	}

}
