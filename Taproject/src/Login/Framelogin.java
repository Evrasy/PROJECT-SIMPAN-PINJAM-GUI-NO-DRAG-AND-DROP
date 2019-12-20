/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Datamasuk.FrameDat;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;

public class Framelogin extends Komponenlog {

    static FrameDat all= new FrameDat();
    String nama0 = "Admin";
    String pass0 = "123";

    public void Log() {

        id.setBounds(10, 50, 150, 35);
        id.setFont(new Font("Consolas", Font.BOLD, 23));
        ids.setBounds(125, 50, 200, 35);
        ids.setFont(new Font("Consolas", Font.BOLD, 20));
        add(id);
        add(ids);
        passwd.setBounds(10, 115, 150, 35);
        passwd.setFont(new Font("Consolas", Font.BOLD, 23));
        pass.setBounds(125, 115, 200, 35);
        pass.setFont(new Font("Consolas", Font.BOLD, 20));
        add(passwd);
        add(pass);

        eo.setBounds(80, 85, 200, 25);
        eo.setFont(new Font("Consolas", Font.BOLD, 14));
        eo.setForeground(Color.red);
        add(eo);

        log.setBounds(125, 175, 200, 25);
        log.setFont(new Font("Consolas", Font.BOLD, 21));
        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (ids.getText().equals("") && pass.getText().equals("")) {
                    ids.setText("MASUKKAN USERNAME!!");
                    pass.setText("MASUKKAN PASWORD!!");
                } else {
                    try {
                        if (ids.getText().equals(nama0) && pass.getText().equals(pass0)) {
                            all.odt();
                            eo.setText("");
                        } else if (!ids.equals(nama0) && !pass.equals(pass0)) {
                            CheckError();
                        }
                    } catch (Exception ex) {
                        Error();
                    }

                }

            }
        });
        add(log);

        setTitle("LOGIN");
        setSize(380, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void Error() {
        eo.setText("NAMA DAN NO HP SALAH!!");
    }

    private void CheckError() throws IOException {
        if (!ids.equals(nama0) && !pass.equals(pass0)) {
            throw new IOException();
        }
    }

}
