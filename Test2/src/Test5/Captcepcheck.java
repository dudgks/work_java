package Test5;

public class Captcepcheck {
	public int var1 = 100;
	static int var2 = 1000;
	
	int printAdd = var1 + var2;
		
	String var3 = "1";
	String var4 = "2";
	String getNumStr(String var3, String var4) {
		return "var3 + var4";
	}
	//2
	int num = 1;
	boolean checkNumsign(int num) {
		if(num%2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	//3
	int a = 10;
	int b = 9;
	int getBiggest(int a, int b) {
		if(a>b) {
			return a;
		}else if(a<b) {
			return b;
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		Captcepcheck cap = new Captcepcheck();
		
		int result = cap.printAdd;
		System.out.println(result);
		
		
	}
}
