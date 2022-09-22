package corejava.collection.assignmentset2.question4.mapper;

import corejava.collection.assignmentset2.question4.model.Student;

public class StudentMapper {
	public static Student map(String data) {
		String[] arrData = data.split(",");
		try {
		Integer studId = Integer.parseInt(arrData[0]);
		String studSubject = arrData[1];
		Integer studMarks = Integer.parseInt(arrData[2]);
		
		Student student = new Student(studId, studSubject, studMarks);
		return student;
		} catch(NumberFormatException numberFormatException) {
			throw new RuntimeException(numberFormatException);
		} catch(Exception exception) {
			throw new RuntimeException(exception);
		}
	}
}
