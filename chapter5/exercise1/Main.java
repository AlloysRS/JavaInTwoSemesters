package exercise1;

public class Main {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println(myMethod(x, y));
		System.out.println(y);
	}

	static int myMethod(int firstInt, int secondInt) {
		int x = 10;
		int y;
		y = x + firstInt + secondInt;
		return y;
	}

}
