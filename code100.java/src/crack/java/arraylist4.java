package crack.java;
import java.util.*;

public class arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> a1=new ArrayList<String>();
		a1.add("hi");
		a1.add("hello");
		a1.add("welcome");
		a1.add("to");
		a1.add("java coding");
		a1.remove(3);
		a1.add(3, "to");
		
		//for(String s1:a1) {
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		//System.out.println(s1);
		

	}

}
}
