package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {

		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in); 

		while(true) {
			System.out.println(" (1) Korea");
			System.out.println(" (2) USA");
			System.out.println(" (3) Japan");
			System.out.println(" (4) China");
			System.out.println("원하는 메뉴(1~4)를 선택하세요.(종료:0)>");

			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);	 // 입력받은 문자열(tmp)을 숫자로 변환

			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (1 == menu) {
				System.out.println("Seoul. (종료는 0)");

			}else if (2 == menu) {
				System.out.println("Washington. (종료는 0)");

			}else if (3 == menu) {
				System.out.println("Tokyo. (종료는 0)");

			}else if (4 == menu) {
				System.out.println("Beijing. (종료는 0)");
				continue;

			}	System.out.println("선택하신 메뉴는 " + menu + "번입니다.");

		}
	}
}