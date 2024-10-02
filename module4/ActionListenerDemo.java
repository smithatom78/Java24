package module4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ActionListenerDemo  implements ActionListener
{JFrame f;
	JTextField t ;
	JButton b;
	// int numClicks = 0;
	public int numClicks = 0;
	ActionListenerDemo() {
		 f=new JFrame();
		t = new JTextField(20);
		JButton b;
		
		
		//Create a new button and add it to layout 
		b = new JButton("Click me");
		f.add(b);
		//add textfield  to layout
		f.add(t);
		//Register the listener with the source(button)
		b.addActionListener(this);
		f.setSize(550,300);
		f.setVisible(true);
				//used to arrange the components in a line
		f.setLayout(new FlowLayout());
    }
	// override the abstract methods of ActionListener interface 
	public void actionPerformed(ActionEvent e)
	{
		numClicks++;
		t.setText("Button Clicked " + numClicks + " times");
    }
	public static void main(String[] args) {
		 new ActionListenerDemo();
    }
}
