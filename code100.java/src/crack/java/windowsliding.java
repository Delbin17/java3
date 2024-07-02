package crack.java;

public class windowsliding {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,8,5,8,3,-4,-9,1,7,3};
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++) 
			sum=sum+arr[i];
		
		int maxsum=sum;
		
		int startindex=0;
		int endindex=k;
		
		
		while(endindex<arr.length) {
			sum=sum-arr[startindex];
			startindex++;
			
			sum=sum+arr[endindex];
			endindex++;
		
		
		
		maxsum= Math.max( maxsum,sum);
		
		 
			
	
		}
	System.out.println(maxsum/k);
		
}
		}
	

	
	
