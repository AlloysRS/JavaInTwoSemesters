package exercise7;

import java.util.Scanner;

public class ApartmentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Apartment apartment = new Apartment();
		String tempRoomName;
		double tempValue;
		int choice = 0;
		
		do
		{			
			System.out.println("Welcome to the Apartment, select options");
			System.out.println("[1] Add Room");
			System.out.println("[2] Get Room Area");
			System.out.println("[3] Get Room Length");
			System.out.println("[4] Get Room Height");
			System.out.println("[5] Set Room Length");
			System.out.println("[6] Set Room Height");
			System.out.println("[7] Display Total Rooms");
			System.out.println("[0] Quit");
			
			System.out.println("Enter option (0-7)");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice)
			{
				case 1:
					System.out.println("What is the new room name?");
					tempRoomName = scanner.nextLine();
					if (!apartment.add(tempRoomName))
						System.out.println("Room already exists!");
					break;
				case 2:
					System.out.println("What is the existing room name?");
					tempRoomName = scanner.nextLine();
					double roomArea = apartment.getRoomArea(tempRoomName);
					if (roomArea != -1)
						System.out.println("Room Area: " + roomArea);
					else
						System.out.println("Room does not exist!");
					break;
				case 3:
					System.out.println("What is the existing room name?");
					tempRoomName = scanner.nextLine();
					double roomLength = apartment.getRoomLength(tempRoomName);
					if (roomLength != -1)
						System.out.println("Room Area: " + roomLength);
					else
						System.out.println("Room does not exist!");
					break;
				case 4:
					System.out.println("What is the existing room name?");
					tempRoomName = scanner.nextLine();
					double roomHeight = apartment.getRoomHeight(tempRoomName);
					if (roomHeight != -1)
						System.out.println("Room Area: " + roomHeight);
					else
						System.out.println("Room does not exist!");
					break;
				case 5:
					System.out.println("What is the existing room name?");
					tempRoomName = scanner.nextLine();
					System.out.println("What is the new Length?");
					tempValue = scanner.nextInt();
					scanner.nextLine();
					if (!apartment.setRoomLength(tempRoomName, tempValue))
						System.out.println("Room does not exist!");
					break;				
				case 6:
					System.out.println("What is the existing room name?");
					tempRoomName = scanner.nextLine();
					System.out.println("What is the new Height?");
					tempValue = scanner.nextInt();
					scanner.nextLine();
					if (!apartment.setRoomHeight(tempRoomName, tempValue))
						System.out.println("Room does not exist!");
					break;
				case 7:
					System.out.println("There are " + apartment.getRoomsTotal() + " rooms");
					break;
				case 0:
					System.out.println("Thank you for using the Apartment!");
					break;
			}
		} while (choice != 0);
		scanner.close();
	}

}
