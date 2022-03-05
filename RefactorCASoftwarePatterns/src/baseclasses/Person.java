package baseclasses;

public class Person {
	//this class will exist to reduce the amount of parameters in Customer class
	String PPS, firstName, surname, DOB;
	
	public Person() {
		
	}
	
	public Person(String PPS, String firstName, String surname, String DOB) {
		this.PPS = PPS;
		this.firstName = firstName;
		this.surname = surname;
		this.DOB = DOB;
	}

	public String getPPS() {
		return PPS;
	}

	public void setPPS(String pPS) {
		PPS = pPS;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
	

}
