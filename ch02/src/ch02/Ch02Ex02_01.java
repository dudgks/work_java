package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("합계와 평균을 구하는 식은 다음과 같다.>");
		    String input = scanner.nextLine();
		    int kor = 90;	
		    String A = scanner.nextLine();
            int mat = 80;
            String B = scanner.nextLine();
            int eng = 100;
            int sum = kor+mat+eng;
            int avg = (kor+mat+eng)/3;
		    
		    System.out.printf("kor=%d%n", kor);
		    System.out.printf("mat=%d%n", mat);
		    System.out.printf("eng=%d%n", eng);
		    System.out.printf("sum=%d%n", sum);
		    System.out.printf("avg=%d%n", avg);
		    
		}
	}

