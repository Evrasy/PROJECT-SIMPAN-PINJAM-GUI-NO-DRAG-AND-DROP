/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datamasuk;

import Login.Komponenlog;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Framebay extends Komponenlog{
    static int line=0;
    public void by(){     
        jud2.setBounds(395, 10, 250, 22);
        jud2.setFont(new Font("Consolas",Font.BOLD,22));
        add(jud2);
        
        nama2.setBounds(20, 30, 100, 25);
        nama2.setFont(new Font("Consolas",Font.BOLD, 20));
        nabay.setBounds(20, 55, 150, 18);
        nabay.setFont(new Font("Consolas",Font.BOLD,17));
        add(nama2);
        add(nabay);
        noHp2.setBounds(20, 75, 100, 25);
        noHp2.setFont(new Font("Consolas",Font.BOLD,20));
        noHpbay.setBounds(20, 100, 150, 18);
        noHpbay.setFont(new Font("Consolas",Font.BOLD,17));
        add(noHp2);
        add(noHpbay);
        
        u2.setBounds(20, 125, 100, 25);
        u2.setFont(new Font("Consolas",Font.BOLD,20));
        p2.setBounds(20, 145, 150, 18);
        p2.setFont(new Font("Consolas",Font.BOLD,17));
        add(u2);
        add(p2);
        
        DefaultTableModel tabel;
        JTable tbl = new JTable();
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(285, 45, 350, 250);
        scroll.setViewportView(tbl);

        tabel = (DefaultTableModel) tbl.getModel();
        tabel.addColumn("Nama");
        tabel.addColumn("NoHp");
        tabel.addColumn("Bayar");

        mask2.setBounds(20, 250, 200, 25);
        mask2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tabel.addRow(new Object[0]);
                tabel.setValueAt(nabay.getText(), line, 0);
                tabel.setValueAt(noHpbay.getText(), line, 1);
                tabel.setValueAt(p2.getText(), line, 2);
                line++;

            }
        });
        add(scroll);
        add(mask2);
        
        clea2.setBounds(230, 250, 50, 20);
        clea2.setForeground(Color.BLACK);
        clea2.setBackground(Color.red);
        clea2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nabay.setText("");
                noHpbay.setText("");

            }
        });
        add(clea2);
        
        setTitle("Bayar pinjaman");
        setSize(700, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}

