package crack.java;

import java.util.Arrays;

public class minimummove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {0,9,9,1,1,2};
		Arrays.sort(num);
		int move=0;
		for(int i=1;i<num.length;i++) {
			if(num[i]<=num[i-1]) {
				move+=num[i-1]-num[i]+1;
				num[i]=num[i-1]+1;
			}
		}
		System.out.println(move);

	}

}
