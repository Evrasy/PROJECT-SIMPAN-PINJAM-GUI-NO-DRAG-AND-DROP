/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datamasuk;
import Login.Komponenlog;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Framenab extends Komponenlog{
    static int line=0;
    public  void nab(){     
        jud1.setBounds(395, 10, 250, 22);
        jud1.setFont(new Font("Consolas",Font.BOLD,22));
        add(jud1);
        
        nama1.setBounds(20, 30, 100, 25);
        nama1.setFont(new Font("Consolas",Font.BOLD, 20));
        namab.setBounds(20, 55, 150, 18);
        namab.setFont(new Font("Consolas",Font.BOLD,17));
        add(nama1);
        add(namab);
        noHp1.setBounds(20, 75, 100, 25);
        noHp1.setFont(new Font("Consolas",Font.BOLD,20));
        noHpb.setBounds(20, 100, 150, 18);
        noHpb.setFont(new Font("Consolas",Font.BOLD,17));
        add(noHp1);
        add(noHpb);
        
        u.setBounds(20, 125, 100, 25);
        u.setFont(new Font("Consolas",Font.BOLD,20));
        p.setBounds(20, 145, 150, 18);
        p.setFont(new Font("Consolas",Font.BOLD,17));
        add(u);
        add(p);
        
        DefaultTableModel tabel;
        JTable tbl = new JTable();
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(285, 45, 350, 250);
        scroll.setViewportView(tbl);

        tabel = (DefaultTableModel) tbl.getModel();
        tabel.addColumn("Nama");
        tabel.addColumn("NoHp");
        tabel.addColumn("NAbung");

        mask1.setBounds(20, 250, 200, 25);
        mask1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tabel.addRow(new Object[0]);
                tabel.setValueAt(namab.getText(), line, 0);
                tabel.setValueAt(noHpb.getText(), line, 1);
                tabel.setValueAt(p.getText(), line, 2);
                line++;

            }
        });
        add(scroll);
        add(mask1);
        
        clea1.setBounds(230, 250, 50, 20);
        clea1.setForeground(Color.BLACK);
        clea1.setBackground(Color.red);
        clea1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                namab.setText("");
                noHpb.setText("");

            }
        });
        add(clea1);
        
        setTitle("SIMPAN");
        setSize(700, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}

