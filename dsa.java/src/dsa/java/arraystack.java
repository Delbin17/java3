package dsa.java;

public class arraystack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st=new stack();
		
		
		st.push(4);
		st.push(5);
		st.push(5);
		st.push(4);
		st.push(4);
		st.push(9);
		st.push(9);
		st.push(7);
		st.push(5);
		st.push(3);
		st.push(2);
		st.push(6);
		//st.push(98);
		
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		

	}

}
