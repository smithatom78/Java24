package module4;
import java.awt.*;
import java.awt.event.*;

public class ComponentEventDemo {

	public static void main(String[] args) {
Frame frame = new Frame("ComponentEventExample");
    TextArea txtArea = new TextArea();
    Checkbox checkbox1 = new Checkbox("Checkbox 1");
    Checkbox checkbox2 = new Checkbox("Checkbox 2");
   
    frame.add(txtArea, BorderLayout.CENTER);
    frame.add(checkbox1, BorderLayout.NORTH);
    frame.add(checkbox2, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
    ComponentListener componentListener = new MyComponentListener();
    frame.addComponentListener(componentListener);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}

class MyComponentListener implements ComponentListener {
  public void componentShown(ComponentEvent evt) {
    System.out.println("componentShown");
  }

  public void componentHidden(ComponentEvent evt) {
	  
    System.out.println("componentHidden");
  }

  public void componentMoved(ComponentEvent evt) {
    System.out.println("componentMoved");
  }

  public void componentResized(ComponentEvent evt) {
    System.out.println("componentResized");
  }
}
