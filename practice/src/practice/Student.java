package practice;

public class Student {
	int id;
	String name;
	double salary;
	
	void insertdata(int r,String n,double m) {
		id=r;
		name=n;
		salary=m;
	}
	
	void displaydata() {
		System.out.println(id+" "+name+" "+salary);
	}
	
	
}
