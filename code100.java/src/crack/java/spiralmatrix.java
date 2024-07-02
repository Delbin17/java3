package crack.java;

import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int[][] aa = {{1, 2, 3, 4, 5, 6}, {6, 7, 8, 9, 4, 5}};

		    List<Integer> result = new ArrayList<>();
		
		
		int rowbegin=0;
		int rowend=aa.length - 1;
		int colbegin=0;
		int colend=aa[0].length - 1;
		
		
		
		while(rowbegin<=rowend&&colbegin<=colend) {
			
			
			for(int j=colbegin;j<=colend;j++) {
				result.add(aa[rowbegin][j]);
			}
			rowbegin++;
			
			
			for(int j=rowbegin;j<=rowend;j++) {
				result.add(aa[j][colend]);
			}
			colend--;
			
			
			if(rowbegin<=rowend) {
			for(int j=colend;j>=colbegin;j--) {
				result.add(aa[rowend][j]);
			}
			rowend--;
			}
			
			if(colbegin<=colend) {
			for(int j=rowend;j>=rowbegin;j--) {
				result.add(aa[j][colbegin]);
			}
			colbegin++;
			}
					
		}
		System.out.println(rowend);
		System.out.println(colend);
		System.out.println(result);

	}

}
