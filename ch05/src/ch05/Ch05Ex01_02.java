package ch05;

public class Ch05Ex01_02 {
	public static void main(String[] args) {
		// 방법 1
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		// 방법 2
		int[] numbers2 = new int [10];		
		for( int i = 0; i < numbers2.length; i++) { 
			numbers2[i] = i + 1;
		}

		for ( int i = 0; i < numbers2.length; i++) { 
			System.out.print(numbers2[i] + " ");
		}

	}
}




