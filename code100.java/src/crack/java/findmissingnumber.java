package crack.java;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,3,4,5,6,7,9,10};
		int j=arr.length;
		int num;
		int sum=0;
	
		for(int i=0;i<j;i++) {
			sum+=arr[i];
			
		}
		num=j*(j+1)/2-sum;
		

	
     System.out.println(num);
     
     
}
}