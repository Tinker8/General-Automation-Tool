package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login{
    private JTextField txtUsername;
    private JPanel test1;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JPanel pnlMain;
    private String password = "test";

    public Login() {




        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test1.setBackground(Color.blue);

                String pw = txtPassword.getText();
                String user = txtUsername.getText();
                if (pw.contains(password)){
                    txtPassword.setText(null);
                    txtUsername.setText(null);

                    Menu menu1 = new Menu();

                }
            }
        });
    }

    public void setData(Menu data) {
    }

    public void getData(Menu data) {
    }

    public boolean isModified(Menu data) {
        return false;
    }
}