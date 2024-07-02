package crack.java;
import java.util.*;

class book{
	String name;
	String author;
	long year;
	int quantity;
	
	book(String name,String author,long year,int quantity){
		
		
		
		this.name=name;
		this.author=author;
		this.year=year;
		this.quantity=quantity;
	}
}
public class hashmap {

	public static void main(String[] args) {
		
		
		HashMap <Integer,book> b1= new HashMap<Integer,book>();

		
		book a1=new book("blue ","klr",2008,200);
		book a2=new book("ocean ","kan",2007,300);
		book a3=new book("the","yuir",2021,700);
		
	b1.put(1,a1);
	b1.put(2,a2);
	b1.put(3,a2);
		
	for(Map.Entry<Integer, book> entry: b1.entrySet()){
		 int key=entry.getKey();
		 book b=entry.getValue(); 
		System.out.print(key+" ");
		System.out.println(b.author+" "+b.name+" "+b.year+" "+b.quantity);
		
	}
	}
}
