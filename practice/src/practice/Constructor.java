package practice;

public class Constructor {
	
	int id;
	String name;
	int age;

	Constructor(int i,String n){
		id=i;
		name=n;
	}
	Constructor(int i,String n,int umr){
		id=i;
		name=n;
		age=umr;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
		
		public static void main(String arg[])
		{
			Constructor c=new Constructor(101,"mayank");
			Constructor c1=new Constructor(102,"Deepali",21);
			c.display();
			c1.display();
			
		}
	}

