package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers01 = scanner.nextLine().split(" ");
		int minsooHeight =Integer.parseInt(numbers01[0]);
		int minsooWeight =Integer.parseInt(numbers01[1]);
		
		String[] numbers02 = scanner.nextLine().split(" ");
		int kiyeongHeight =Integer.parseInt(numbers01[0]);
		int kiyeongWeight =Integer.parseInt(numbers01[1]);
		
		boolean isgreatestMinsoo = minsooHeight > kiyeongHeight ? 
				(minsooWeight > kiyeongWeight ? true : false) : false;
				
				System.out.println(isgreatestMinsoo);
		
	}

}
