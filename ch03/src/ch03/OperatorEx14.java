package ch03;

public class OperatorEx14 {
	public static void main(String[] args) {
		char c ='a';
		// 반복문 for문 : 같은 문장을 반복 실행한다.
		for(int i = 0; i<26; i++) {			// 블럭{} 안의 문장을 26번을 반복한다.
			System.out.print(c++);		// 'a'부터 26개의 문자를 출력한다.
		}
		System.out.println();	// 줄바꿈을 한다.
		
		//for 1. int i = 0; 2. i<26; 3. System.out.print(c++) 4. i++
		
		c = 'A';
		for(int i = 0; i<26; i++) {			// 블럭{} 안의 문장을 26번 반복한다.
			System.out.print(c++);		// 'A'부터 26개의 문자를 출력한다.
		}
		System.out.println();	// 줄바꿈을 한다.
		
		c = '0';
		for(int i = 0; i<10; i++) {			// 블럭{} 안의 문장을 10번 반복한다.
			System.out.print(c++);		// '0'부터 10개의 문자를 출력한다
		}
		System.out.println();	//줄바꿈을 한다.
	}

}
