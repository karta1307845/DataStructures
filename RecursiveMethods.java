public class RecursiveMethods {
	public static int length(String str) {
		if (str == null || str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}

	public static void printChars(String str) {
		if (str == null || str.equals("")) {
			return;
		} else {
			System.out.println(str.charAt(0));
			printChars(str.substring(1));
		}
	}

	public static void printCharsReverse(String str) {
		if (str == null || str.equals("")) {
			return;
		} else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static double power(double x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * power(x, n - 1);
		}
	}

	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		} else if (m < n) {
			return gcd(n, m);
		} else {
			return gcd(n, m % n);
		}
	}

	public static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	private static int fibo(int fibCurrent, int fibPrevious, int n) {
		if (n == 1) {
			return fibCurrent;
		} else {
			return fibo(fibCurrent + fibPrevious, fibCurrent, n - 1);
		}
	}

	public static int fibonacciStart(int n) {
		return fibo(1, 0, n);
	}
}
