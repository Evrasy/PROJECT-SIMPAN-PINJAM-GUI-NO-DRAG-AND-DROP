/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datamasuk;
import Login.Komponenlog;
import java.awt.*;
import java.awt.event.*;
public class FrameDat extends Komponenlog{
    static Framenab ab=new Framenab();
    static Framebay  bay=new Framebay();
    static Framepin pin=new Framepin();
    public void odt(){
        
        
    judul.setBounds(105, 25, 400, 30);
    judul.setFont(new Font("Consolas",Font.BOLD,25));
    judul.setForeground(Color.BLUE);
    add(judul);
        
    one.setBounds(10, 70, 150, 50);
    one.setBackground(Color.lightGray);
    one.setForeground(Color.BLACK);
    one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               ab.nab();
                
            }
        });
    add(one);
        
        
    two.setBounds(170, 70, 150, 50);
    two.setBackground(Color.lightGray);
    two.setForeground(Color.BLACK);
    two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
             bay.by();
            }
        });
    add(two);

    three.setBounds(335, 70, 150, 50);
    three.setBackground(Color.lightGray);
    three.setForeground(Color.BLACK);
    three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               pin.pn();
            }
        });
    add(three);
    
        
        getContentPane().setBackground(Color.darkGray);
        setTitle("MENU");
        setSize(520, 200);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
