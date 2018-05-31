package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);   	     	 		 
		 
    	 String strNum1 = scanner.nextLine();
    	 String strNum2 = scanner.nextLine();
    	 String strNum3 = scanner.nextLine();
    	
    	 int a1 = Integer.parseInt(strNum1);
    	 int b1 = Integer.parseInt(strNum2);
         int c1 = Integer.parseInt(strNum3);
         
         System.out.printf("%b",--a1, "a1" == "b1", "b1" == "c1", "a1" == "c1");
         System.out.printf("%b", "a1" == "b1", "b1" == "c1", "a1" == "c1");
	}

}
