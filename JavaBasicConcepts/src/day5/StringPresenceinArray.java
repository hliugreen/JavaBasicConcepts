package day5;

public class StringPresenceinArray {

	public static void main(String[] args) {

		String s[]= {"welcome","selenium","java","python","javascript"};
		String value="selenium";
		boolean flag=false;
		for(String i:s) {
			if(i.contains(value)) {
				System.out.println("found value in string");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Not found");
		}
		

	}

}
