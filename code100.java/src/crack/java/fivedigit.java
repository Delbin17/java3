package crack.java;

import java.util.Scanner;

public class fivedigit {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%7==0) {
				
				System.out.println(i);
			}


}
}
}
