package model2;
import model.Student;
public class Print {
	public static void main(String[] args) {
		Student stu1=new Student("xiaoyang",18,"female","350123200211110101");
		System.out.println("name£º"+stu1.name);
		System.out.println("age£º"+stu1.age);
		System.out.println("gender£º"+stu1.gender);
		System.out.println("ID NO£º"+stu1.idno);
	}
	
}
