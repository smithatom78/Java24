package module5;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*; 
public class ColorDemo  implements ActionListener{ 
	 JButton button;
	 JPanel panel ;
	ColorDemo(){
		JFrame frame = new JFrame();
		 panel = new JPanel();
		button = new JButton("Change my Color");
		panel.add(button);
		panel.setBackground(Color.RED);
		button.addActionListener(this);
		frame.setContentPane(panel);
		frame.setSize(1000, 600);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){ 
Color c = JColorChooser.showDialog(panel, "Choose a color", panel.getBackground());
		    if (c != null) {
		      panel.setBackground(c);}
		
	}
		public static void main(String[] args)
	   {
	      new ColorDemo();
	    
	   }
}
