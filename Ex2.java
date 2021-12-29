package curs5;

public class Ex2 {

	public static void main(String[] args) {

		int var1 = 0;
		int var2 = 1;
		int sum;
		int count = 9;

		System.out.print("Seria Fibonacci pentru 9 numere: " + var1 + " " + var2);
//
//		for (int i = 2; i < count; i++) {
//
//			sum = var1 + var2;
//			var1 = var2;
//			var2 = sum;
//
//			System.out.print(" " + sum);
//
//		}

		int i = 2;
		while (count > i) {
			
			i = i + 1;
			
			sum = var1 + var2;
			var1 = var2;
			var2 = sum;
			
			System.out.print(" " + sum);
		}

	}

}
