package day6;

public class Students {
	
	int sid;
	String sname;
	char grade;
	
	Students(int id,String name, char g){
		sid = id;
		sname=name;
		grade=g;
	}
	
	void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);	
	}
	
	void getValues(int id, String name, char g) {
		sid = id;
		sname=name;
		grade=g;
	}
}
