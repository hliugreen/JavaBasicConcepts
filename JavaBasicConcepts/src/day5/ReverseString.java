package day5;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="selenium";
		String reversed="";
		
		for(int i=s.length()-1; i>=0; i--) {
			reversed+=s.charAt(i);
		}
		System.out.println(reversed);

	}

}
