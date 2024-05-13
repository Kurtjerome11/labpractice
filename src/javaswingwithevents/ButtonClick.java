/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingwithevents;

/**
 *
 * @author Mhacee Caryl
 */

import javax.swing.*;
import java.awt.event.*;

public class ButtonClick {
    private JFrame f1 = new JFrame();
    private JButton b1;
    
    ButtonClick(){
        f1.setSize(200,200);
        f1.setVisible(true);
        
        b1 = new JButton("Click Me!");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f1, "thank you for clicking me !");
            }
        });
        
        f1.add(b1);
        
    
}
    
}
