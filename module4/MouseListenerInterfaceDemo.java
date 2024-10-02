package module4;
import java.awt.Color;
import javax.swing.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;
public class MouseListenerInterfaceDemo implements MouseListener{
JFrame f;
	public MouseListenerInterfaceDemo(){
		f=new JFrame();
		f.addMouseListener(this); // link the frame with ML
	    f.setSize(500,300); f.setVisible(true);}
	//the area where the contents of the JFrame is being displayed is actually the "content pane",and not contents of the JFrame itself.
	// to change the color of Frame,actually changes the property of "content pane* 
	public void mousePressed(MouseEvent e){
		f.getContentPane().setBackground(Color.CYAN);
		System.out.println("Mouse is Pressed");}
	public void mouseReleased(MouseEvent e){
		f.getContentPane().setBackground(Color.red);
	    System.out.println("Mouse is Released");}
	public void mouseClicked(MouseEvent e){
	   // setBackground(Color.green);
		f.getContentPane().setBackground(Color.GREEN);
	    System.out.println("Mouse is Clicked");	}
	public void mouseEntered(MouseEvent e){
		f.getContentPane().setBackground(Color.darkGray);
	    System.out.println("Mouse is Entered");	}
	public void mouseExited(MouseEvent e){
		f.getContentPane().setBackground(Color.magenta);
		System.out.println("Mouse is Exited");}
	public static void main(String args[]){
	     new MouseListenerInterfaceDemo();}}


