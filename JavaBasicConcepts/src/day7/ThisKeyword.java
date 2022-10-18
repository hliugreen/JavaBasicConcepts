package day7;

public class ThisKeyword {
	int a,b;
	
//	ThisKeyword(int a, int b){
//		this.a=a;
//		this.b=b;
//	}
	
	void add(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	void display() {

		System.out.println(a);
		System.out.println(b);
		System.out.println("Sum of a and b: " + (a+b));
		
		
	}

	public static void main(String[] args) {
		
	ThisKeyword th = new ThisKeyword();
	th.add(10, 20);
	th.display();

	}

}
