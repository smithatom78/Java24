package module4;
/*
* ContainerEventDemo.java requires no other files.
*/
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
public class ContainerAdapterExample extends JPanel implements ActionListener {
  JTextArea display;
  JPanel buttonPanel;
  JButton addButton, removeButton, clearButton;
  Vector<JButton> buttonList;
  static final String ADD = "add";
  static final String REMOVE = "remove";
  static final String CLEAR = "clear";
  static final String newline = "\n";

  public ContainerAdapterExample() {
    super(new GridBagLayout());
    GridBagLayout gridbag = (GridBagLayout) getLayout();
    GridBagConstraints c = new GridBagConstraints();
    // Initialize an empty list of buttons.
    buttonList = new Vector<JButton>(10, 10);
    // Create all the components.
    addButton = new JButton("Add a button");
    addButton.setActionCommand(ADD);
    addButton.addActionListener(this);
    removeButton = new JButton("Remove a button");
    removeButton.setActionCommand(REMOVE);
    removeButton.addActionListener(this);
    buttonPanel = new JPanel(new GridLayout(1, 1));
    buttonPanel.setPreferredSize(new Dimension(200, 75));
    buttonPanel.addContainerListener(new ContainerAdapter() {
      public void componentAdded(ContainerEvent e) {
        displayMessage(" added to ", e);
      }

      public void componentRemoved(ContainerEvent e) {
        displayMessage(" removed from ", e);
      }
    });
    display = new JTextArea();
    display.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(display);
    scrollPane.setPreferredSize(new Dimension(200, 75));
    clearButton = new JButton("Clear text area");
    clearButton.setActionCommand(CLEAR);
    clearButton.addActionListener(this);
    c.fill = GridBagConstraints.BOTH; // Fill entire cell.
    c.weighty = 1.0; // Button area and message area have equal height.
    c.gridwidth = GridBagConstraints.REMAINDER; // end of row
    gridbag.setConstraints(scrollPane, c);
    add(scrollPane);
    c.weighty = 0.0;
    gridbag.setConstraints(clearButton, c);
    add(clearButton);
    c.weightx = 1.0; // Add/remove buttons have equal width.
    c.gridwidth = 1; // NOT end of row
    gridbag.setConstraints(addButton, c);
    add(addButton);
    c.gridwidth = GridBagConstraints.REMAINDER; // end of row
    gridbag.setConstraints(removeButton, c);
    add(removeButton);
    c.weighty = 1.0; // Button area and message area have equal height.
    gridbag.setConstraints(buttonPanel, c);
    add(buttonPanel);
    setPreferredSize(new Dimension(400, 400));
    setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
  }

  void displayMessage(String action, ContainerEvent e) {
    display.append(((JButton) e.getChild()).getText() + " was" + action
        + e.getContainer().getClass().getName() + newline);
    display.setCaretPosition(display.getDocument().getLength());
  }

  /*
   * This could have been implemented as two or three classes or objects, for
   * clarity.
   */
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    if (ADD.equals(command)) {
      JButton newButton = new JButton("JButton #"
          + (buttonList.size() + 1));
      buttonList.addElement(newButton);
      buttonPanel.add(newButton);
      buttonPanel.revalidate(); // Make the button show up.
    } else if (REMOVE.equals(command)) {
      int lastIndex = buttonList.size() - 1;
      try {
        JButton nixedButton = buttonList.elementAt(lastIndex);
        buttonPanel.remove(nixedButton);
        buttonList.removeElementAt(lastIndex);
        buttonPanel.revalidate(); // Make the button disappear.
        buttonPanel.repaint(); // Make the button disappear.
      } catch (ArrayIndexOutOfBoundsException exc) {
      }
    } else if (CLEAR.equals(command)) {
      display.setText("");
    }
  }

  /**
   * Create the GUI and show it. For thread safety, this method should be
   * invoked from the event-dispatching thread.
   */
  private static void createAndShowGUI() {
    // Create and set up the window.
    JFrame frame = new JFrame("ContainerAdapterExample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Create and set up the content pane.
    JComponent newContentPane = new ContainerAdapterExample();
    newContentPane.setOpaque(true); // content panes must be opaque
    frame.setContentPane(newContentPane);
    // Display the window.
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    // Schedule a job for the event-dispatching thread:
    // creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}
