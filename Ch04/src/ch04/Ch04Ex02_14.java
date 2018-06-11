package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>");
		String[] numbers = scanner.nextLine().split(" "); 

		int num1 = Integer.parseInt(numbers[1]);
		int num2 = Integer.parseInt(numbers[0]);

		for (int i = 1; i < 10; i++) {
			   if(num1>num2){
			    for (int j=num1; j >= num2; j--) {
			     System.out.print(j+" * "+ i +" = "+ (i * j) +"\t");
			    }
			    
			   } else if(num2>num1) {
			    for (int j=num2; j >= num1; j--) {
			     System.out.print(j+" * "+ i +" = "+ (i * j) +"\t");
			    }

			    System.out.println(" "); 

			}
		}
	}
}



