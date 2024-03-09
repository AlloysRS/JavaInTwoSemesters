package exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] javaStudents;
		int size;
		
		System.out.println("Choose size of array: ");
		size = scanner.nextInt();
		
		javaStudents = new int[size];
		
		System.out.println("enterExamMarks called...");
		enterExamMarks(javaStudents, scanner);
		displayMarks(javaStudents);
		System.out.println("increaseMarks called...");
		increaseMarks(javaStudents);
		displayMarks(javaStudents);
		System.out.println("allHavePassed called...");
		boolean havePassed = allHavePassed(javaStudents);
		System.out.println("havePassed results in: " + havePassed);
		displayMarks(javaStudents);
		scanner.close();
	}

	static void enterExamMarks(int[] javaStudents, Scanner scanner) {
		for (int i = 0; i < javaStudents.length; i++)
		{
			System.out.println("Enter a mark: ");
			javaStudents[i] = scanner.nextInt();
		}
	}

	static void increaseMarks(int[] javaStudents) {
		for (int i = 0; i < javaStudents.length; i++)
			javaStudents[i] += 5;
	}

	static boolean allHavePassed(int[] javaStudents) {
		for (int i = 0; i < javaStudents.length; i++)
			if (javaStudents[i] < 40)
				return false;
		return true;
	}
	
	static void displayMarks(int[] javaStudents) {
		for (int item : javaStudents)
			System.out.println(item);
	}

}
