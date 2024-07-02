package crack.java;
import java.awt.*;


class sample {
	
	sample(){
		Frame frame=new Frame("form");
		Button btn=new Button("click me");
		
		btn.setBounds(50, 50, 80, 40);
		Label label=new Label("this is button");
		label.setBounds(150, 50, 80, 40);
	     TextField textfield=new TextField("enter the data");
	     textfield.setBounds(50, 100, 120, 40);
	     TextArea textarea=new  TextArea("enter the description");
	     //textfield.setBounds(50, 100, 120, 40);
	    Checkbox checkbox= new Checkbox("brazil");
	    Checkbox checkbox1= new Checkbox("germany");
	    Choice choice =new Choice();
	    choice.setBounds(50, 150, 120, 40);
	    
	    
	    choice.add("germany");
	    choice.add("brazil");
		
		frame.add(btn);
		frame.add(textfield);
		frame.add(textarea);
		frame.add(label);
		frame.add(checkbox);frame.add(checkbox1);
		frame.add(choice);
		
		

	
	//Button btn=new Button("click me");
		
	
	frame.setLayout( null);
	frame.setVisible(true);

	frame.setSize(500,500);

}
}
public class awt {
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	sample s1=new sample();
	
	}

	}
