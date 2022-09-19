package corejava.collection.assignmentset2.question4;

import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;

public class Main {

	public static void main(String[] args) {
		String[] inputData = { "22, Data Structures, 45", "23, English, 52", "22, English, 51",
				"26, Data Structures, 72", "23, Data Structures, 61", "24, English, 81", };
//		Student student = new Student(22, "Data structure", 45);
//
//		System.out.println(student);
//		System.out.println(student.toString());
//		System.out.println(
//				student.getStudentId() + "\t" + student.getStudentSubject() + "\t" + student.getStudentMarks());
//		;
		AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(inputData);
		System.out.println(averageMarksCalculator);
		
		// map input array to list of Student

		// get lowest id from the list of students

		// get average marks for the student having lowest id

		// print the results
	}

}
