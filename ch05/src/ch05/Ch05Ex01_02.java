package ch05;

public class Ch05Ex01_02 {
	public static void main(String[] args) {
		int i, j = 1;
		int[] arr = new int [10];

		 for (i = 0; i < 10; i++) {
		  arr[i] = j;
		  j++;
		 }

		 for (i = 0; i < 10; i++) {
		  System.out.printf("%d ", arr[i]);
		 }
	}
}



