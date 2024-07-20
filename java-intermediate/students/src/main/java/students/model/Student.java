package students.model;


public class Student {
	
	private String name;
	private String email;
	private double not1;
	private double not2;
	private double not3;
	private double promedio;
	
	public Student() {
		
	}
	
	public Student(String name, String email, double not1, double not2, double not3) {
		this.name = name;
		this.email = email;
		this.not1 = not1;
		this.not2 = not2;
		this.not3 = not3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getNot1() {
		return not1;
	}
	public void setNot1(double not1) {
		this.not1 = not1;
	}
	public double getNot2() {
		return not2;
	}
	public void setNot2(double not2) {
		this.not2 = not2;
	}
	public double getNot3() {
		return not3;
	}
	public void setNot3(double not3) {
		this.not3 = not3;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	public double calcularPromedio() {
		return (not1 + not2 + not3) / 3;
	}
	
	
	
}
