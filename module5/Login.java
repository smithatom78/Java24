package module5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login implements ActionListener {
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   Login() {
      // Username Label
	   JFrame f = new JFrame("My Login");
		JPanel panel = new JPanel( );
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField();
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      submit.addActionListener(this);
      f.setContentPane(panel); 
      //add(panel, BorderLayout.CENTER);
      f.setTitle("Please Login Here !");
      f.setSize(450,350);
      f.setVisible(true);
   }
   public static void main(String[] args) {
      new Login();
   }
   
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
      if (userName.trim().equals("admin") && password.trim().equals("admin")) {
         message.setText(" Hello " + userName + "");
      } else {
         message.setText(" Invalid user.. ");
      }
   }
}