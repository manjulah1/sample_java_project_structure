package corejava.collection.assignmentset2.question4.solution;

import java.util.List;
import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {
	private List<Student> studentList;

	public AverageMarksCalculator(List<Student> studentList) {
		this.studentList = studentList;
	}

	// get lowest id from the list of students
	private Integer getLowestIdFromTheListOfStudents() {
		Integer lowestId = studentList.get(0).getStudentId();
		for(Student student: studentList) {
			if(student.getStudentId() < lowestId) {
				lowestId = student.getStudentId();
			}
		}
		return lowestId;
	}

	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(Integer id) {
		Integer sum = 0;
		int count = (int) studentList.stream().filter(student -> student.getStudentId().equals(id)).count();
		for(Student student: studentList) {
			if(student.getStudentId() == id) {
				sum += student.getStudentMarks();
			}
		}
		return (double) (sum/count);
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
