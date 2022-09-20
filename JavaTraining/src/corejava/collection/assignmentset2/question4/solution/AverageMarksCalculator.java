package corejava.collection.assignmentset2.question4.solution;

import java.util.ArrayList;
import java.util.List;

import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {
	private String[] studentData;

	public AverageMarksCalculator(String[] studentData) {
		super();
		this.studentData = studentData;
	}
	// map input array to list of Student
	public List<Student> mapInputArrayToListOfStudent() {
		List<Student> list = new ArrayList<Student>();
		for(String data: studentData) {
			Student student = StudentMapper.map(data);
			list.add(student);
		}
		return list;
	}

	// get lowest id from the list of students
	public Integer getLowestIdFromTheListOfStudents(List<Student> studentList) {
		Integer lowestID = studentList.get(0).getStudentId();
		for(Student student: studentList) {
			if(student.getStudentId() < lowestID) {
				lowestID = student.getStudentId();
			}
		}
		return lowestID;
	}

	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(Integer id, List<Student> studentList) {
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String newline = System.lineSeparator();
		for (String studentInfo : studentData) {
			sb.append(studentInfo);
			sb.append(newline); // find what should be the better way for new line character
		}
		return sb.toString();
	}

}
