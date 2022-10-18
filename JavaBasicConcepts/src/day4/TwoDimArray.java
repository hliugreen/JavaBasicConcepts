package day4;

public class TwoDimArray {

	public static void main(String[] args) {
		
//		int a[][]=new int[3][2];
//		a[0][0] = 100;
		int a[][]= {{10,20},{30,40},{50,60}            };
		for (int r[]:a) {
			for(int i:r) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
