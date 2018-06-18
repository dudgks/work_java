package ch05;

import java.util.Scanner;

public class Ch05Ex01_03 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int i;

		Scanner scanner = new Scanner(System.in); 
		String input = scanner.nextLine();

		for (i = 0; i < arr.length; i++) {
				System.out.printf(" %c", arr[i]);    
				break;
			}
			System.out.printf(" %c %c %c", (char)arr[0], (char)arr[3], (char)arr[6]);
			System.out.println(arr[i]);
		}


	}

