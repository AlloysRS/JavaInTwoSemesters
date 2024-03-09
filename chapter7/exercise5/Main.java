package exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Oblong> rooms = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean finished = false;
		
		Oblong room1 = new Oblong("room 1", 5.2, 4.7);
		rooms.add(room1);
		
		Oblong room2 = new Oblong("room 2", 5.2, 5.7);
		rooms.add(room2);
		
		Oblong room3 = new Oblong("room 3", 8.1, 5.0);
		rooms.add(room3);
		
		do
		{			
			System.out.println("Welcome to the hotel, select options");
			System.out.println("[1] Get number of rooms");
			System.out.println("[2] Set room dimensions");
			System.out.println("[3] Display room details");
			System.out.println("[0] Quit");
			
			System.out.println("Enter option (0-3)");
			choice = scanner.nextInt();
			
			switch (choice)
			{
				case 1:
					int size = rooms.size();
					System.out.println("Number of rooms: " + size);
					break;
				case 2:
					for (Oblong room : rooms)
					{
						System.out.println("Enter " + room.getName() + " length");
						int newLength = scanner.nextInt();
						room.setLength(newLength);
						System.out.println("Enter " + room.getName() + " height");
						int newHeight = scanner.nextInt();
						room.setHeight(newHeight);
					}
					break;
				case 3:
					System.out.println("Enter room name: ");
					scanner.nextLine();
					String chosenRoom = scanner.nextLine();
					boolean roomFound = false;
					for (Oblong room : rooms)
					{
						if (chosenRoom.equals(room.getName()))
						{
							roomFound = true;
							room.printDetails();
							break;
						}
					}
					if (!roomFound)
					{
						System.out.println("Room not found!");
					}
					break;
				case 0:
					System.out.println("Thank you for using the hotel!");
					finished = true;
					break;
			}
		} while (!finished);
		scanner.close();
	}

}
