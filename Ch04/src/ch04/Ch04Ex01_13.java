package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		System.out.print("번호를 입력하세요.>");
		int n = scanner.nextInt();		
		String result ; 
		switch (n) {
		case 1:result ="dog"; 	
		case 2:result ="cat"; 
		case 3:result = "chick"; 
		default:result = "I don't know.";
		System.out.println();
		
		}
	}
}
