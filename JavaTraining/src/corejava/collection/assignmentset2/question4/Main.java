package corejava.collection.assignmentset2.question4;

import java.util.List;
import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;

public class Main {

	public static void main(String[] args) {
		String[] inputData = { "22, Data Structures, 45", "23, English, 52", "22, English, 51",
				"26, Data Structures, 72", "23, Data Structures, 61", "24, English, 81", };
//		Student student = new Student(22, "Data structure", 45);
//		System.out.println(student);
//		System.out.println(student.toString());
//		System.out.println(
//				student.getStudentId() + "\t" + student.getStudentSubject() + "\t" + student.getStudentMarks());
//		;
		
		
		
		AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(inputData);
		
		averageMarksCalculator.toString();
		// map input array to list of Student
		List<Student> studentList = averageMarksCalculator.mapInputArrayToListOfStudent();

		// get lowest id from the list of students
		Integer lowestId = averageMarksCalculator.getLowestIdFromTheListOfStudents(studentList);

		// get average marks for the student having lowest id
		Double average = averageMarksCalculator.getAverageMarksForTheStudent(lowestId, studentList);

		// print the results
		System.out.println("Average marks of student with lowest Id " + lowestId + " is: " + average);
	}

}
