package crack.java;

public class maximumsubstring {

	public static void main(String[] args) {
		
		
		String n="whwhw00l";
		String m="njswhw0l";
		
		char[]c1=n.toCharArray();
		char[]c2=m.toCharArray();
		 int max=0;
		 
		 int[][]aa=new int[c1.length+1][c2.length+1];
		 for(int i=1;i<=c1.length;i++) {
			 for(int j=1;j<=c2.length;j++) {
				 if(c1[i-1]==c2[j-1]) {
					 aa[i][j]=aa[i-1][j-1]+1;
					 max=Math.max(aa[i][j], max);
				 }
			 }
		 }
			 System.out.println(max);
			 
		 }
		
		
	}

	
	