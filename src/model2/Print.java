package model2;
import model.Student;
public class Print {
	public static void main(String[] args) {
		Student stu1=new Student("xiaoyang",18,"female","350123200211110101");
		System.out.println("name��"+stu1.name);
		System.out.println("age��"+stu1.age);
		System.out.println("gender��"+stu1.gender);
		System.out.println("ID NO��"+stu1.idno);
	}
	
}
