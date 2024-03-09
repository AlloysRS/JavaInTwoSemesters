package exercise2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		String studentNumber;
		String studentName;
		
		studentNumber = "123";
		studentName = "Laura";
		Student student1 = new Student(studentNumber, studentName);
		student1.enterMarks(93, 90, 37);
		students.add(student1);
		
		studentNumber = "234";
		studentName = "John";
		Student student2 = new Student(studentNumber, studentName);
		student2.enterMarks(33, 55, 77);
		students.add(student2);
		
		studentNumber = "345";
		studentName = "Simon";
		Student student3 = new Student(studentNumber, studentName);
		student3.enterMarks(40, 50, 60);
		students.add(student3);
		
		Student.setFee(1000.00);
		
		for (Student student : students)
		{
			System.out.println("STUDENT IS:");
			System.out.println("Student ID: " + student.getNumber());
			System.out.println("Student Name: " + student.getName());
			if (student.getMathsMark() == -1 || student.getEnglishMark() == -1 || student.getScienceMark() == -1)
			{
				System.out.println("One or marks is not set for this student, please set");
				break;
			}
			System.out.println("Maths mark: " + student.getMathsMark());
			System.out.println("English mark: " + student.getEnglishMark());
			System.out.println("Science mark: " + student.getScienceMark());
			System.out.println("Average mark: " + student.calculateAverageMark());
			if (student.getFee() == -1)
			{
				System.out.println("Tuition fee is not set, please set");
				break;
			}
			System.out.println("Fee to pay: " + student.getFee());
			System.out.println();
		}
		
	}

}
