package crack.java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class button {

	button(){
		Frame frame =new Frame("from");
		
		
		
		Label Name=new Label("Name :");
		Name.setBounds(50, 100, 100, 30);
		
		
		
		Label Email=new Label("Email : ");
		Email.setBounds(50, 150, 100, 30);
		
		
		Label Password=new Label("Password :");
		Password.setBounds(50, 200, 100, 30);
		
		
		

		TextField nameinput=new TextField("Enter your name");
		nameinput.setBounds(150,100, 100, 30);
		
		TextField mailinput=new TextField("Enter your email");
		mailinput.setBounds(150,150, 100, 30);
		
		TextField passwordinput=new TextField("Enter your password");
		passwordinput.setBounds(150,200, 100, 30);
		
		
		Button Submit=new Button("SUBMIT");
			Submit.setBounds(100, 300, 50, 30);
	
			
		ButtonListener buttonlistener=new 	ButtonListener (nameinput,mailinput,passwordinput);
		
		Submit.addActionListener((ActionListener) buttonlistener);
			
		
		
		class ButtonListener implements ActionListener{
			TextField nameInput;
			TextField mailInput;
			TextField passwordInput;
			
			
			ButtonListener( TextField nameInput,TextField mailInput,TextField passwordInput){
				this.nameInput=nameInput;
				this.mailInput=mailInput;
				this.passwordInput=passwordInput;
			}
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(nameInput.getText());
				System.out.println(mailInput.getText());
				System.out.println(passwordInput.getText());
				
			}
			
		}
		
		frame.add(Name);
		frame.add(Email);
		frame.add(Password);
		frame.add(nameinput);
		frame.add(mailinput);
		frame.add(passwordinput);
		frame.add(Submit);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400, 400);
		
		
	}
	


	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	
		 new button();
		}
}
		



	
