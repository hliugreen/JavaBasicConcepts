package day4;

public class EvenNumbersinArray {

	public static void main(String[] args) {

		int a[] = {10,15,20,25,30,35,40,45};
		
		for(int i:a) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
