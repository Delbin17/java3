package crack.java;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=9991;
     int rem=0;
    int num2=num;
      while(num>0) {
    	  rem=(rem*10)+num%10;
    	  num=num/10;
      
    	  
      }
      System.out.println(rem);
      
      if (rem==num2) {
      System.out.println("the num is palidrome"); 
      
    		 
    	 }
      else {
    	  System.out.println("the num is not palindrome");
      }
   
	}
}
