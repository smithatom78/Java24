package module5;
import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;  
public class ActionEventDemo1 implements ActionListener {  
    Label l;  
    public static void main(String argv[]) {  
    	ActionEventDemo1 t = new ActionEventDemo1();  
    }  
    public ActionEventDemo1() {  
    	JFrame f = new JFrame("My Frame title");
			f.setLayout(new BorderLayout());  
            Button b1 = new Button("My Button1");  
            b1.addActionListener(this);  
            f.add(b1, BorderLayout.NORTH);  
            Button b2 = new Button("My Button2");  
            b2.addActionListener(this);  
            f.add(b2, BorderLayout.SOUTH);  
            l = new Label("My Label");  
            f.add(l, BorderLayout.CENTER);
            Button b3 = new Button("My Button3");  
            b3.addActionListener(this);  
            f.add(b3, BorderLayout.WEST);  
           Button b4 = new Button("My Button4");  
            b4.addActionListener(this);  
            f.add(b4, BorderLayout.EAST);  
             f.setSize(300, 300);  
        f.setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        Button bton = (Button) e.getSource();  
         l.setText(bton.getLabel());  
    }  
}  