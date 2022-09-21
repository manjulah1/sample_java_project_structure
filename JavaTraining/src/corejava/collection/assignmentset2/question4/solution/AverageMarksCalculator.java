package corejava.collection.assignmentset2.question4.solution;

import java.util.ArrayList;
import java.util.List;

import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {
	private List<Student> studentList;

	public AverageMarksCalculator(List<Student> studentList) {
		this.studentList = studentList;
	}

	// get lowest id from the list of students
	public Integer getLowestIdFromTheListOfStudents() {
		Integer lowestID = studentList.get(0).getStudentId();
		for(Student student: studentList) {
			if(student.getStudentId() < lowestID) {
				lowestID = student.getStudentId();
			}
		}
		return lowestID;
	}

	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(Integer id) {
		Double averageMarks = 0.0;
		Integer sum = 0;
		int count = 0;
		for(Student student: studentList) {
			if(student.getStudentId() == id) {
				sum += student.getStudentMarks();
				count++;
			}
		}
		averageMarks = (double) (sum/count);
		return averageMarks;
	}
	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		String newline = System.lineSeparator();
//		for (String studentInfo : studentData) {
//			sb.append(studentInfo);
//			sb.append(newline); // find what should be the better way for new line character
//		}
//		return sb.toString();
//	}

}
