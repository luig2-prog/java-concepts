package students.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import students.model.Student;

@ManagedBean
@SessionScoped
public class StudentController {

	private Student student;
	private List<Student> students;
	
	public StudentController() {
		student = new Student();
		students = new ArrayList<Student>();
	
		students.add(new Student("Elizabeth", "eli@gmail.com", 3, 4, 4));
		students.add(new Student("Elizabeth 2", "eli@gmail.com", 1, 4, 4));
		students.add(new Student("Elizabeth 3", "eli@gmail.com", 2, 4, 4));

	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public String saveStudent() {
		students.add(student);
		student = new Student();
		return "studentList.xhtml?faces-redirect=true";
	}
	
	public double calcularPromedio(Student student) {
		return student.calcularPromedio();
	}
	
	public String newStudent() {
		student = new Student();
		return "studentForm.xhtml?faces-redirect=true";
	}
	
	public List<Student> pierden() {
		return students.stream().filter(
				student -> student.calcularPromedio() < 3
				).collect(Collectors.toList()
		);
	}
	
	public List<Student> ganan() {
		return students.stream().filter(
				student -> student.calcularPromedio() >= 3).collect(Collectors.toList()
		);
	}
	
}
