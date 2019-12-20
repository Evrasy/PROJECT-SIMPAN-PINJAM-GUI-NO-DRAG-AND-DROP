/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrasi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Frameregis extends Komponenreg{
    static int line=0;
    public  Data[] dat=new Data[10];
    public int index=0;
    public void Reg(){
        jud.setBounds(395, 10, 250, 22);
        jud.setFont(new Font("Consolas",Font.BOLD,22));
        add(jud);
        
        nama.setBounds(20, 30, 100, 25);
        nama.setFont(new Font("Consolas",Font.BOLD, 20));
        nama1.setBounds(20, 55, 150, 18);
        nama1.setFont(new Font("Consolas",Font.BOLD,17));
        add(nama);
        add(nama1);
        noHp.setBounds(20, 75, 100, 25);
        noHp.setFont(new Font("Consolas",Font.BOLD,20));
        noHp1.setBounds(20, 100, 150, 18);
        noHp1.setFont(new Font("Consolas",Font.BOLD,17));
        add(noHp);
        add(noHp1);
        alamat.setBounds(20, 120, 100, 25);
        alamat.setFont(new Font("Consolas",Font.BOLD,20));
        alamat1.setBounds(20, 145, 150, 18);
        alamat1.setFont(new Font("Consolas",Font.BOLD,17));
        add(alamat);
        add(alamat1);
        
        DefaultTableModel tabel;
        JTable tbl = new JTable();
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(285, 45, 350, 250);
        scroll.setViewportView(tbl);

        tabel = (DefaultTableModel) tbl.getModel();
        tabel.addColumn("Nama");
        tabel.addColumn("NoHp");
        tabel.addColumn("Alamat");

        daf.setBounds(20, 250, 200, 25);
        daf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tabel.addRow(new Object[0]);
                tabel.setValueAt(nama1.getText(), line, 0);
                tabel.setValueAt(noHp1.getText(), line, 1);
                tabel.setValueAt(alamat1.getText(), line, 2);
                
                dat[index]=new Data(nama1.getText(),alamat1.getText(),noHp1.getText());
                index++;
                line++;

            }
        });
        add(scroll);
        add(daf);
        
        clea.setBounds(230, 250, 50, 20);
        clea.setForeground(Color.BLACK);
        clea.setBackground(Color.red);
        clea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama1.setText("");
                noHp1.setText("");
                alamat1.setText("");

            }
        });
        add(clea);
        
        setTitle("Registrasi");
        setSize(700, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
