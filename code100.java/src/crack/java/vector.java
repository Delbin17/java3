package crack.java;
import java.util.*;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <String> lang =new Vector<String>();
		
		lang.add("java");
		lang.addElement("c++");
		lang.addElement("kotlin");
		lang.addElement("javascript");
		
		
		if(lang.contains("kotlin")) {
			System.out.println(lang.set(0, "ad.java"));
		}
		lang.get(0);
		
		System.out.println(lang.get(3));
		System.out.println(lang.set(3, "python"));
		System.out.println(lang);
		System.out.println(lang.size());
		System.out.println(lang.capacity());
		
		Enumeration <String> a1=lang.elements();
		
		while(a1.hasMoreElements()) {
			System.out.println(a1.nextElement());
		}
	}

}
