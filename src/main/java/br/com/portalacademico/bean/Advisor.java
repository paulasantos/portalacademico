package br.com.portalacademico.bean;

import java.util.Set;
import java.util.TreeSet;


//Bean that represents the advisor properties
public class Advisor {
	private Long id;
    private String name;
    private String second_name;
    private String email_adress;
    private String password;
    private Set<Student> studentList = new TreeSet<Student>();
    private Set<Field> fields = new TreeSet<Field>();
    private Set<Qualification> academic_qualifications;
    
    //Default constructor
    public Advisor() {
		super();
	}
    

    //Getters and setters
	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getEmail_adress() {
		return email_adress;
	}

	public void setEmail_adress(String email_adress) {
		this.email_adress = email_adress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Set<Student> studentList) {
		this.studentList = studentList;
	}

	public Set<Field> getFields() {
		return fields;
	}

	public void setFields(Set<Field> fields) {
		this.fields = fields;
	}

	public Set<Qualification> getAcademic_qualifications() {
		return academic_qualifications;
	}

	public void setAcademic_qualifications(
			Set<Qualification> academic_qualifications) {
		this.academic_qualifications = academic_qualifications;
	}

}

