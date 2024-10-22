package quiz.application;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.jpeg"));
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Login();
        
    }
    
}
