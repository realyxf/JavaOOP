package model;

public class Student {
	public String name;
	public int age;
	public String gender;
	public String idno;
	public Student(String name, int age, String gender, String idno) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.idno = idno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	
	
}
