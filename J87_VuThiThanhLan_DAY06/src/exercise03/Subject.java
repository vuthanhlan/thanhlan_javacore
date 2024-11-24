package exercise03;

public class Subject {

	
	
	private int code;
	private String name;
	private double credit;
	private double mark;
	
	
	
	public Subject() {
		super();
	}
	public Subject(int code, String name, double credit, double mark) {
		super();
		this.code = code;
		this.name = name;
		this.credit = credit;
		this.mark = mark;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	
}
