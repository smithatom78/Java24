package module5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListernerDemo implements KeyListener{  
    JLabel label;  
    JTextArea textArea;  
    KeyListernerDemo(){  
    	JFrame f = new JFrame("My Frame title");
		JPanel p = new JPanel( );
        label=new JLabel();  
        label.setBounds(20,50,100,20);  
        textArea=new JTextArea();  
        textArea.setBounds(20,80,300, 300);  
        textArea.addKeyListener(this);  
        p.add(label);
        p.add(textArea);
        f.setContentPane(p); 
        f.setSize(400,400);  
       p. setLayout(null);  
        f.setVisible(true); 
        }  
    public void keyPressed(KeyEvent e) {  
    	label.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
    	label.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        label.setText("Key Typed");  
    }  
    public static void main(String[] args) {  
        new KeyListernerDemo();  
    }  }  
