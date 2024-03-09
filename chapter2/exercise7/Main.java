package exercise7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give number of students: ");
		int students = scanner.nextInt();
		System.out.println("Give number of teams: ");
		int teams = scanner.nextInt();
		int numTeams = students / teams;
		int numRemaining = students % teams;
		System.out.println(students + " students in " + teams + " teams results in: " + numTeams + " teams and " + numRemaining + " students without a team");
		scanner.close();
	}
}
