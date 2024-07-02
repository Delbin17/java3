package crack.java;
import java.math.*;

public class squarenum {
	

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		long left=0;
		long right=(int)Math.sqrt(n);
		while(left<=right) {
			if(left*left+right*right==n) {
		
				return true;
			}
			else if(left*left+right*right<n)
				left++;
			else   
			  right--;
		}
		
		
		return false;
	}
}
