package day9;

interface A{
	int a=10;//by default variables are static and final
	void m1();
	
}

public class Test implements A {
	
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Test obj = new Test();//same as A obj = new Test();
		obj.m1();
		
	}

}
 