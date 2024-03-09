package exercise3;

public class Main {
	public static void main (String[] args)
	{
		System.out.println("Part a\n");
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nPart b\n");
		
		for (int i = 0; i < 6; i++)
		{
			if (i == 2 || i == 3)
				System.out.println("*********");
			else
				System.out.println("***");
		}
		
		System.out.println("\nPart c\n");
		
		for (int i = 0; i < 4; i ++)
		{
			for (int j = 4; j > i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
