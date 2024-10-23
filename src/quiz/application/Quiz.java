package quiz.application;

import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    
    Quiz() {
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Quiz();
    }
    
}
