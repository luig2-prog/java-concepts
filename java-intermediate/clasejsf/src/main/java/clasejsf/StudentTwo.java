package clasejsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//@ManagedBean(name = "studentTwo")
@ManagedBean
@RequestScoped
public class StudentTwo {
	
	private String firstName;
	private String lastName;
	private String clase;
	
	// Contructor sin argumentos 
	
	public StudentTwo() {
		firstName = "Luis";
		lastName = "Jimenez";
		clase = "PHP";
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

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	
	
	
	
	
	
	
}
