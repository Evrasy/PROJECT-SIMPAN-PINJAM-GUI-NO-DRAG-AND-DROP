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

public class Framepin extends Komponenlog{
    static int line=0;
    public void pn(){     
        jud3.setBounds(395, 10, 250, 22);
        jud3.setFont(new Font("Consolas",Font.BOLD,22));
        add(jud3);
        
        nama3.setBounds(20, 30, 100, 25);
        nama3.setFont(new Font("Consolas",Font.BOLD, 20));
        nama3.setBounds(20, 55, 150, 18);
        nama3.setFont(new Font("Consolas",Font.BOLD,17));
        add(nama3);
        add(namap);
        noHp3.setBounds(20, 75, 100, 25);
        noHp3.setFont(new Font("Consolas",Font.BOLD,20));
        noHpp.setBounds(20, 100, 150, 18);
        noHpp.setFont(new Font("Consolas",Font.BOLD,17));
        add(noHp3);
        add(noHpp);
        
        u3.setBounds(20, 125, 100, 25);
        u3.setFont(new Font("Consolas",Font.BOLD,20));
        p3.setBounds(20, 145, 150, 18);
        p3.setFont(new Font("Consolas",Font.BOLD,17));
        add(u3);
        add(p3);
        
        DefaultTableModel tabel;
        JTable tbl = new JTable();
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(285, 45, 350, 250);
        scroll.setViewportView(tbl);

        tabel = (DefaultTableModel) tbl.getModel();
        tabel.addColumn("Nama");
        tabel.addColumn("NoHp");

        mask3.setBounds(20, 250, 200, 25);
        mask3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tabel.addRow(new Object[0]);
                tabel.setValueAt(namap.getText(), line, 0);
                tabel.setValueAt(noHpp.getText(), line, 1);
                tabel.setValueAt(p3.getText(), line, 2);
                line++;

            }
        });
        add(scroll);
        add(mask3);
        
        clea3.setBounds(230, 250, 50, 20);
        clea3.setForeground(Color.BLACK);
        clea3.setBackground(Color.red);
        clea3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                namap.setText("");
                noHpp.setText("");
            }
        });
        add(clea3);
        
        setTitle("Pinjam");
        setSize(700, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
