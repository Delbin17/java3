package crack.java;

import java.util.*;

class college{
	String name;
	int students;
	String dept;
	college(String name,int students,String dept){
		this.name=name;
		this.students=students;
		this.dept=dept;
	}

	
	
	
}





public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<college>c1=new HashSet<college>();
		 college s1=new college("sxcce",2000,"5");
		 college s2=new college("nmcc",200,"6");
		 college s3=new college("loyola",800,"7");
		 
		 c1.add(s1);
		 c1.add(s2);
		 c1.add(s3);
		 
		 
		 Iterator itr= c1.iterator();
		 
		 while(itr.hasNext()) {
			 college colg=(college)itr.next();
			 System.out.println(colg.name+"  "+colg.students+"  "+colg.dept);
		 }
		 
	}

}
