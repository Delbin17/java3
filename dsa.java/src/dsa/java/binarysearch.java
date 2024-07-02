package dsa.java;

public class binarysearch {

	public static void main(String[] args) {
		
		int num[]= {-4,-3,-1,2,5,7,45,56,67,78,87};
		int target=79;
		int result=binarysearch(num,target);
		
		
		if(result==-1) {
			System.out.print("no value");
		}
			else {
				System.out.println("the index is"+ result);
			}
			
		}
		
	


	private static int binarysearch(int[] num, int target) {
		// TODO Auto-generated method stub
		int start=0;
		int end=num.length-1;
		//int mid=(start+end)/2;
		//return 0;
		while(start<=end) {
			 int mid=(start+end)/2;
			if(target==num[mid]) {
				return mid;
			}
			
			
			if(target<num[mid]) {
				end=mid-1;
			}
				else {
					start=mid+1;
				}
			}
		
		return -1;
	}

}
