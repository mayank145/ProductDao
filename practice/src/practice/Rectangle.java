package practice;

public class Rectangle {
	int length;
	int breadth;
	
	void getlb(int l,int b) {
		length=l;
		breadth=b;
		
	}
	
	void display() {
		System.out.println("The area of rectangle is"+" "+length*breadth);
		
	}

	public static void main(String arg []){
		Rectangle r=new Rectangle();
		r.getlb(10,20);
		r.display();
		 
	}
}
