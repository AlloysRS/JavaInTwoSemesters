package exercise2;

public class Student {
	private String studentNumber;
	private String studentName;
	private int markForMaths = -1;
	private int markForEnglish = -1;
	private int markForScience = -1;
	static double fee = -1.0;

	public Student(String studentNumber, String studentName)
	{
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}
	
	public String getNumber()
	{
		return studentNumber;
	}
	
	public String getName()
	{
		return studentName;
	}
	
	public void enterMarks(int mathsMark, int englishMark, int scienceMark)
	{
		markForMaths = mathsMark;
		markForEnglish = englishMark;
		markForScience = scienceMark;
	}
	
	public int getMathsMark()
	{
		return markForMaths;
	}
	
	public int getEnglishMark()
	{
		return markForEnglish;
	}
	
	public int getScienceMark()
	{
		return markForScience;
	}
	
	public double calculateAverageMark()
	{
		int total = markForMaths + markForEnglish + markForScience;
		return total / 3.0;
	}
	
	public double getFee()
	{
		return fee;
	}
	
	public static void setFee(double newFee)
	{
		fee = newFee;
	}	
}
