package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
								
		int num = Integer.parseInt(scanner.nextLine());				 
		
		System.out.println(num++);
		++num;
		System.out.println(num);
		
		//System.out.printf("%d%n%d",num++);
		
		
	}

}
