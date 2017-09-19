package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends Component {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JPanel pnlMain;
    private String password = "test";
    public JPanel test1 = new JPanel();

    public Login() {

        test1.add(txtUsername);
        test1.add(txtPassword);
        test1.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //test1.setBackground(Color.blue);

                String pw = txtPassword.getText();
                String user = txtUsername.getText();
                if (pw.contains(password)) {
                    txtPassword.setText(null);
                    txtUsername.setText(null);


                }
            }
        });
    }

    public void setData(Login data) {
    }

    public void getData(Login data) {
    }

    public boolean isModified(Login data) {
        return false;
    }

    public void setData(Menu data) {
    }

    public void getData(Menu data) {
    }

    public boolean isModified(Menu data) {
        return false;
    }

}