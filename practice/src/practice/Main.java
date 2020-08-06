package practice;

public class Main {
	public static void main(String arg[]) {
		//object creation through reference variable
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		s.insertdata(101, "mayank",10000.0);
		
		s1.insertdata(200, "Deepali",50000.0);
		
		s2.insertdata(201, "alex", 30000.0);
		s.displaydata();
		s1.displaydata();
		s2.displaydata();
		
	}
}
