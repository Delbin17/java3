package crack.java;
import java.util.*;

class student{
	String name;
	int rollno;
	int age;
	

	student(String name,int rollno,int age){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
    }

public class arraylist1 {

	public static void main(String[] args) {
		
		
		student s1=new student("delbin",121,22);
		student s2=new student("leo",126,28);
		student s3=new student("kian",181,20);
		
		
		ArrayList<student> a1=new ArrayList<student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		//a1.remove(0);
		//a1.add(null);
		
		
		for(student s:a1) {
		//Iterator itr= a1.iterator();
		
		//while(itr.hasNext()) {
		//student student=(student)itr.next();
		System.out.println(s.name+" "+s.rollno+"  "+s.age);
	

		
		}
	}

}
