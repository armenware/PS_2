package base;
public class MyInteger {
	// int data field
	private static int iValue;

	// constructor
	public MyInteger(int iValue) {
	}
	

	// get method
	public static int getValue() {
		return iValue;
	}

	// isEven method
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	// isOdd method
	public boolean isOdd() {
		if (iValue % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	// isPrime method
	public boolean isPrime() {
		if (iValue % 2 == 0)
			return false;
		for (int j = 3; j*j <= iValue; j += 2)
			if (iValue % j == 0)
				return false;
		return true;
	}

	// static method isEven(int)
	public static boolean isEven(int int_value) {
		if (int_value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// static method isOdd(int)
	public static boolean isOdd(int int_value) {
		if (int_value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	// static method isPrime(int)
	public static boolean isPrime(int int_value) {
		if (int_value % 2 == 0)
			return false;
		for (int k = 3; k*k <= int_value; k += 2)
			if (int_value % k == 0)
				return false;
		return true;
	}

	// static method isEven(MyInteger)
	public static boolean isEven(MyInteger integer_value) {
		if (getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// static method isOdd(MyInteger)
	public static boolean isOdd(MyInteger integer_value) {
		if (getValue() % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	// static method isPrime(MyInteger)
	public static boolean isPrime(MyInteger integer_value) {
		if (getValue() % 2 == 0)
			return false;
		for (int a = 3; a*a <= getValue(); a += 2)
			if (getValue() % a == 0)
				return false;
		return true;
	}

	// method equals(int)
	public boolean equals(int value) {
		if (value == getValue()) {
			return true;
		} else {
			return false;
		}
	}

	// method equals(MyInteger)
	public boolean equals(MyInteger num) {
		if (iValue == getValue()) {
			return true;
		} else {
			return false;
		}
	}
}