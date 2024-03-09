package exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 	BEGIN
		//		PRINT LENGTH PROMPT
		//		SCAN LENGTH VALUE
		//		PRINT HEIGHT PROMPT
		//		SCAN HEIGHT VALUE
		//		CALCULATE AREA AS LENGTH * HEIGHT
		//		PRINT AREA
		//	END
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give rectangle length: ");
		int length = keyboard.nextInt();
		System.out.print("Give rectangle height: ");
		int height = keyboard.nextInt();
		int area = length * height;
		System.out.println("Area is: " + area);
		keyboard.close();
	}

}
