package exercise7;

import java.util.ArrayList;

public class Apartment {
	ArrayList<Oblong> rooms = new ArrayList<>();
	
	public boolean add(String roomName)
	{
		int index = search(roomName);
		if (index == -1)
		{
			rooms.add(new Oblong(roomName, 0.0, 0.0));
			return true;
		}
		return false;
	}
	
	private int search(String roomName)
	{
		for (int i = 0; i < rooms.size(); i++)
		{
			Oblong tempRoom = rooms.get(i); // find the room at index i
			String tempRoomName = tempRoom.getName(); // get room number
			if (tempRoomName.equals(roomName))
			{
				return i; // return the index
			}
		}
		return -1;
	}	
	
	public int getRoomsTotal()
	{
		return rooms.size();
	}
	
	public double getRoomArea(String roomName)
	{
		int index = search(roomName);
		if (index != -1)
		{
			double roomArea = rooms.get(index).getArea();
			return roomArea;
		}
		else
		{
			return -1;
		}
	}
	
	public double getRoomLength(String roomName)
	{
		int index = search(roomName);
		if (index != -1)
		{
			double roomLength = rooms.get(index).getLength();
			return roomLength;
		}
		else
		{
			return -1;
		}	
	}
	
	public double getRoomHeight(String roomName)
	{
		int index = search(roomName);
		if (index != -1)
		{
			double roomHeight = rooms.get(index).getHeight();
			return roomHeight;
		}
		else
		{
			return -1;
		}
	}
	
	public boolean setRoomLength(String roomName, double roomLength)
	{
		int index = search(roomName);
		if (index != -1)
		{
			rooms.get(index).setLength(roomLength);
			return true;
		}
		else
		{
			System.out.println("Not a valid room!");
			return false;
		}	
	}

	public boolean setRoomHeight(String roomName, double roomHeight)
	{
		int index = search(roomName);
		if (index != -1)
		{
			rooms.get(index).setHeight(roomHeight);
			return true;
		}
		else
		{
			return false;
		}	
	}

}
