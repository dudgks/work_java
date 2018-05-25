package ch02;

import java.util.Scanner;

public class ScannerEX2 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("정수를 입력 하세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);   
		// int num = scanner.nextInt(); 입력받은 문자열을 정수(int)로 받아 전달
	
		System.out.println("입력내용 : " + input);	   
	    System.out.printf("num=%d%n", num);  // 10진수
		System.out.printf("num=%o%n", num);  // 8진수
		System.out.printf("num=%X%n", num);  // 16진수
	}
}
