package ch03;

public class Ch03Ex04_01 {
	public static void main(String[] args) {
		// 프로그램 실행 중에 1번 위치의 a값이 궁금할 경우
		// 방법1 : print 메소드를 이용해 출력
		// 방법2 : 디버깅 도구를 사용
		int a = 5;
		a += 10;
		a = a - 1; // ①									// f5 = 메소드 내부 진입, f6 = 현재 기다리고있는 줄 실행
		System.out.printf("%d%n", a);					// f8 = 다른 break point로 이동
	}

	private static void dsbugTset(int b) {
		System.out.println(b + 10);
		
	}
}
