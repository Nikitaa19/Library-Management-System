package quiz.application;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Login();
        
    }
    
}
