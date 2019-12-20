/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Registrasi.Frameregis;
import Login.Framelogin;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class GUI extends Komponenmen {
    static Frameregis on=new Frameregis();
    static Framelogin  nelog=new Framelogin();  
    public void All(){
    
    
    log.setBounds(120, 70, 150, 50);
    log.setBackground(Color.lightGray);
    log.setForeground(Color.BLACK);
    log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               nelog.Log();
                
            }
        });
    add(log);
        
        
    regis.setBounds(120, 10, 150, 50);
    regis.setBackground(Color.lightGray);
    regis.setForeground(Color.BLACK);
    regis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             on.Reg();    
            }
        });
    add(regis);
        
        
        getContentPane().setBackground(Color.darkGray);
        setTitle("MENU");
        setSize(400, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}