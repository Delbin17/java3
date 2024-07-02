package crack.java;

public class slidingwindow {

	public static void main(String[]args) {
		int arr[]= {1,8,3,4,0,10,2,0};
		
		int k=3;
		int n=arr.length;
		

		  

		        if (k > n) {
		            System.out.println("Window size is larger than the array size.");
		            return;
		        }

		        // Calculate the sum of the first window
		        int sum = 0;
		        for (int i = 0; i < k; i++) {
		            sum += arr[i];
		        }

		        // Initialize the maximum sum to the sum of the first window
		        int maxSum = sum;

		        // Slide the window from left to right across the array
		        for (int i = k; i < n; i++) {
		            // Slide the window to the right by removing the left element and adding the right element
		            sum = sum - arr[i - k] + arr[i];
		            // Update the maximum sum if the current window's sum is greater
		            if (sum > maxSum) {
		                maxSum = sum;
		                System.out.println(i);
		            }
		        }

		        // Print the maximum sum
		        System.out.println("Maximum sum of a subarray of size " + k + ": " + maxSum);
		    
	}
	}
