package assignment.java;

public class Student {

		// TODO Auto-generated method stub
    int rollno;
    String name;
    int age;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
 
}