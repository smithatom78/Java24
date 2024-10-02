package module4;
import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
public class AdjustmentEventDemo extends JPanel implements AdjustmentListener{
	JScrollBar bar = new JScrollBar(SwingConstants.VERTICAL, 50, 10, 0, 500);
	  
	  public AdjustmentEventDemo() {
		  JFrame frame = new JFrame();
		    frame.add(new AdjustmentEventDemo());
		  //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBounds(50,50, 500,500);
		    add(bar);
		    frame.setVisible(true);
	    bar.addAdjustmentListener(this); 
	  }
	  public void adjustmentValueChanged(AdjustmentEvent evt) {

	    int newValue = bar.getValue();
	    System.out.println(newValue);
	    repaint();
	  }
	  public static void main(String[] args) {
	   
	  }
}

