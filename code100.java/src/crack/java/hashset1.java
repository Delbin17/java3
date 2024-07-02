package crack.java;
import java.util.*;

public class hashset1 {

	public static void main(String[] args) {
		HashSet <String> car=new HashSet<String>();
		
		car.add("benz");
		car.add("ford");
		car.add("pagani");
		car.add("ford");
		
		car.removeIf(str->str.contains("benz"));
//		car.isEmpty();
	
	System.out.println(car.isEmpty());

}
}