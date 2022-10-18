package day8;

class Parent {
	
	//int a;
	void display(int a) {
		System.out.println(a);
	}
}

class Child1 extends Parent{
	//int x;
	void show(int x) {
		System.out.println(x);
	}
}

class Child2 extends Parent{
	//int y;
	void show(int y) {
		System.out.println(y);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {

		Child1 c1=new Child1();
		//c1.a=100;
		//c1.x=200;
		c1.display(200);
		
		Child2 c2=new Child2();
		//c2.a=200;
		//c2.y=300;
		c2.show(300);
		

	}

}
