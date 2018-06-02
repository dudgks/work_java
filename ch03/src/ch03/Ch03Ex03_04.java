package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		double kor = Double.parseDouble(numbers[0]);
		double eng = Double.parseDouble(numbers[1]);
		double math = Double.parseDouble(numbers[2]);
		
		// 총점은 정수부분의 합계 -> int형변환해서 합계구하기
		int sum = (int)kor + (int)eng + (int)math;
		
		// 평균은 실수의 평균을 구한뒤 정수부분만 츨략 -> 실수의 평균을 int형변환하기
		int avg = (int)(kor + eng + math) / 3;
		
		// 결과출력
		System.out.printf("%s %d%n %s %d%n", "sum", sum, "avg", avg);
	}

}
