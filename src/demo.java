import java.awt.*;
import javax.swing.*;

public class demo
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel Label1 = new JLabel("Hello !!", SwingConstants.CENTER);
        Label1.setFont(new Font("Monotype Corsiva",Font.BOLD, 22));
        Label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(10)); 
        mainPanel.add(Label1);

        JPanel Panel1 = new JPanel(new FlowLayout());
        JLabel Label2 = new JLabel("Name:");
        Label2.setAlignmentX(Component.LEFT_ALIGNMENT);
        Label2.setFont(new Font("Monotype Corsiva",Font.BOLD, 22));
        JTextField textField = new JTextField(5);
        textField.setToolTipText("Enter your name");
        
       
        JLabel Label3 = new JLabel("Password:");
        Label3.setFont(new Font("Monotype Corsiva",Font.BOLD, 22));
        JPasswordField passwordField = new JPasswordField(5);
        passwordField.setToolTipText("Enter your password");

        Panel1.add(Label2);
        Panel1.add(textField);
        Panel1.add(Label3);
        Panel1.add(passwordField);
        mainPanel.add(Panel1);
        
       


        JButton loginButton = new JButton("LOG IN");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(10)); 
        mainPanel.add(loginButton);
        
        loginButton.addActionListener(e -> 
        {
            String name = textField.getText();
            String password = new String(passwordField.getPassword());

            if (name.isEmpty() || password.isEmpty()) 
            {
                JOptionPane.showMessageDialog(frame, "Enter your name and password", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            } else 
            {
                JOptionPane.showMessageDialog(frame, "Logged in successfully");
            }
        }
        );
        
        frame.setVisible(true);
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null); 
       
    }
}