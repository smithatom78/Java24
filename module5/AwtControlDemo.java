package module5;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class AwtControlDemo implements ActionListener
{Label statusLabel;
   public AwtControlDemo()
   {JFrame f = new JFrame("My Frame title");
	   f.setTitle("Java AWT Examples");
	     f.setSize(400,400);
	     f.setLayout(new GridLayout(2,2));
	         
	      statusLabel = new Label();        
	      Button okButton = new Button("OK");
	      Button submitButton = new Button("Submit");
	      Button cancelButton = new Button("Cancel");
	      okButton.addActionListener(this); 
	      submitButton.addActionListener(this); 
	      cancelButton.addActionListener(this); 
	      f.add(statusLabel);
	      f.add(okButton);
	      f.add(submitButton);
	      f.add(cancelButton);   
	      f.setVisible(true);   
   }
   public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       if( command.equals( "OK" ))  {
          statusLabel.setText("Ok Button clicked.");
       }
       else if( command.equals( "Submit" ) )  {
          statusLabel.setText("Submit Button clicked."); 
       }
       else  {
          statusLabel.setText("Cancel Button clicked.");
       }  
   }
   public static void main(String[] args)
   {
      new AwtControlDemo();
    
   }
}

