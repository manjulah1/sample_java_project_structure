package corejava.collection.assignmentset2.question4.solution;

import java.util.List;
import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {
	private String[] studentData;

	public AverageMarksCalculator(String[] studentData) {
		super();
		this.studentData = studentData;
	}
	// map input array to list of Student
	public List<Student> mapInputArrayToListOfStudent() {
		return null;
	}

	// get lowest id from the list of students
	public Integer getLowestIdFromTheListOfStudents() {
		return null;
	}

	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(Integer Id) {
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String studentInfo : studentData) {
			sb.append(studentInfo);
			sb.append("\n"); // find what should be the better way for new line character
		}
		return sb.toString();
	}

}
