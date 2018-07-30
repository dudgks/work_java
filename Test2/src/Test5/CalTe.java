package Test5;

public class CalTe {
	
	int add(int a, int b) {
		return a + b;
	}
	int minus(int a, int b) {
		return a - b;
	}
	int  multiple(int a, int b) {
		return a * b;
	}
	int divide(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		CalTe calculator = new CalTe();

		int result = calculator.minus(10, 5);
		System.out.println("minus : " + result);

		int result1 = calculator.multiple(10, 5);
		System.out.println("multiple : " + result1);

		int result2 = calculator.divide(10, 5);
		System.out.println("divide : " + result2);

		int result3 = calculator.add(result, 3);
		System.out.println("test1 : " + result3);
		
		int result4 = calculator.divide(result1, 2);
		System.out.println("test2 : " + result4);
	}

}
