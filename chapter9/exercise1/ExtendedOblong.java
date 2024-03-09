package exercise1;

public class ExtendedOblong extends Oblong {
	private char symbol;
	
	// the constructor
	public ExtendedOblong(double lengthIn, double heightIn, char symbolIn)
	{
		super(lengthIn, heightIn);
		symbol = symbolIn;
	}
	
	public void setSymbol(char symbolIn)
	{
		symbol = symbolIn;
	}
	
	public String draw()
	{
		String s = new String(); // start off with an empty string
		int l;
		int h;
		// type cast from double to int
		l = (int) getLength();
		h = (int) getHeight();
		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < l; j++)
			{
				s = s + symbol; // add the symbol to the string
			}
			s = s + '\n'; // add the newline character
		}
		return s; // return the string representation
	}
}
