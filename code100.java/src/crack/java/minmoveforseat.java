package crack.java;
import java.util.Arrays;

public class minmoveforseat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seat[]= {2,2,6,6};
		int student[]= {1,3,2,6};
		
		Arrays.sort(student);
		Arrays.sort(seat);
		int move=0;
		for(int i=0;i<student.length;i++) {
			move +=Math.abs(student[i]-seat[i]);
		}
		
	       System.out.println(move);
}

	       }
	       
	       
