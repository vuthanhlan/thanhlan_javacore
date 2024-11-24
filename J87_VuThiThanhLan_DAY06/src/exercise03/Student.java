package exercise03;

public class Student {

	
	private String code;
	private String name;
	private String date;
	private String field;
	
	
	public Student() {
		super();
	}


	public Student(String code, String name, String date, String field) {
		super();
		this.code = code;
		this.name = name;
		this.date = date;
		this.field = field;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}
	
	
	
}
