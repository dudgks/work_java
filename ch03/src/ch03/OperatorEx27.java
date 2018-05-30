package ch03;

public class OperatorEx27 {
	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b); // boolean 값 앞에 !를 붙이면 반대 값 출력
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');

		System.out.printf("!('a'<=ch && ch <= 'z' %b%n", !('a' <= ch && ch<= 'z'));
		System.out.printf("  'a' <= ch && ch <= 'z' = %b%n", 'a' <= ch && ch <= 'z');
	}

}
