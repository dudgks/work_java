package ch03;

public class Ch03Ex04_01 {
	public static void main(String[] args) {
		// 프로그램 실행 중에 1번 위치의 a값이 궁금할 경우
		// 방법1 : print 메소드를 이용해 출력
		// 방법2 : 디버깅 도구를 사용
		int a = 5;
		a += 10;
		a = a - 1; // ①
		System.out.printf("%d%n", a);
	}

}
