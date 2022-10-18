package day8;

class A {
	
	int a;
	void display() {
		System.out.println(a);
	}
}

class B extends A {
	
	int b;
	void print() {
		System.out.println(b);
	}
}

class C extends B{
	int c;
	void show() {
		System.out.println(c);
	}
}

public class InteritanceTypes {

	public static void main(String[] args) {
		
		A aobj = new A();
		aobj.a=100;
		aobj.display();
		
		B bobj = new B();
		bobj.a=10;
		bobj.display();
		bobj.print();
		
		C cobj =new C();
		cobj.a=15;
		cobj.b=25;
		cobj.c=35;
		cobj.display();
		cobj.print();
		cobj.show();

	}

}
