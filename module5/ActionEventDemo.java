package module5;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
class ActionEventDemo  implements ActionListener
{    TextField textField;
    Label myLabel;
    ActionEventDemo ()
    {JFrame f = new JFrame("My Frame title");
        textField = new TextField ("My TextField");
        myLabel=new Label("My Label");
        myLabel.setBounds (60, 50, 200, 20);
        textField.setBounds (60, 50, 200, 20);
        Button button = new Button ("Press");
        button.setBounds (90, 140, 75, 40);
        button.addActionListener (this);
        f.add(myLabel);
        f.add (textField);
        f.add (button);
        f.setSize (550,550);
        f.setLayout(new FlowLayout());
        f.setVisible (true);
      }
    public void actionPerformed (ActionEvent e)
    {
        textField.setText ("Plz practice Java");
        myLabel.setText("Hellooo");
       
    }
   public static void main (String args[])
    {
        new ActionEventDemo ();
    }
}