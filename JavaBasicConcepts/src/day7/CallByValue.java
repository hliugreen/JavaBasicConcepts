package day7;

public class CallByValue {
	
	int x;
	public void addition(int a) {
		x=a+5;
		System.out.println(x);
	}

	public static void main(String[] args) {
		CallByValue cv = new CallByValue();
		cv.addition(5);

	}

}
