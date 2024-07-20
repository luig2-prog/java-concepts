package clasejsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//@ManagedBean(name = "studentTwo")
@ManagedBean
@RequestScoped
public class StudentThree {
	
	private String firstName;
	private String lastName;
	private String[] clases;
	
	List<StudentThree> estudiantes;
	
	// Contructor sin argumentos 
	
	public StudentThree() {
		estudiantes = new ArrayList<StudentThree>();
	}

	// set & get

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getClases() {
		return clases;
	}

	public void setClases(String[] clases) {
		this.clases = clases;
	}


	
	public void agregarEstudiante() {
		
	}
	
	
	
	
	
}
