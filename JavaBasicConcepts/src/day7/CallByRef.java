package day7;

public class CallByRef {
	
	int x;
	public void addition(CallByRef a) {
		x=a.x+5;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		CallByRef cr = new CallByRef();
		cr.x=10;
		cr.addition(cr);

	}

}
