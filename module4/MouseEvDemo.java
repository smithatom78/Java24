package module4;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;  
public class MouseEvDemo extends JFrame implements MouseListener{  
String msg;
public MouseEvDemo(){
	addMouseListener(this); // link the frame with ML
    setSize(300,300);
    setVisible(true);
   	}
   public void mouseClicked(MouseEvent e) {  
        System.out.println("Mouse clicked");
    }  
    public void mouseEntered(MouseEvent e) {  
       System.out.println("Mouse Entered");
    }   public void mouseExited(MouseEvent e)     {  
           System.out.println("Mouse Exited");
        }  
        public void mousePressed(MouseEvent e)   {  
            System.out.println( "Mouse Pressed");
        }  
        public void mouseReleased(MouseEvent e) {  
               System.out.println("Mouse Released");
        }  
        public static void main(String args[]){
   	     new MouseEvDemo();
   	   	}
   }
