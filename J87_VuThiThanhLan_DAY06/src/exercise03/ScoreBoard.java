package exercise03;

public class ScoreBoard {

	private Student student;
	private Subject[] subjects;
	public ScoreBoard() {
		super();
	}
	public ScoreBoard(Student student, Subject[] subjects) {
		super();
		this.student = student;
		this.subjects = subjects;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject[] getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
	
	
	
}
