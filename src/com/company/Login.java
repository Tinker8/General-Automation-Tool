package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends Component {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    public JPanel pnlMain;
    private JTabbedPane tabbedPane1;
    private JButton button1;
    private JTextArea testTextArea;
    private JComboBox comboBox1;
    private JTextArea txtArea1;
    private JLabel lblHeroes;
    private String password = "test";
    public JPanel test1 = new JPanel(new GridLayout(2,1));

    public Login() {
        //test1.add(txtUsername);
        //test1.add(txtPassword);
        //test1.add(btnLogin);


        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pnlMain.setBackground(Color.blue);
                //frame.setContentPane(form.pnlMain);
                //pnlMain.

                String pw = txtPassword.getText();
                String user = txtUsername.getText();
                if (pw.contains(password)) {
                    txtPassword.setText(null);
                    txtUsername.setText(null);


                }
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if (comboBox1.getSelectedItem().equals("Sven")) txtArea1.setText("Sven");
                String temp = comboBox1.getSelectedItem().toString();
                String name = temp.replaceAll(" ", "_");
                txtArea1.setText(temp);
                ImageIcon image = new ImageIcon("C:\\Users\\griffithsa\\Documents\\GitHub\\General-Automation-Tool\\src\\com\\company\\Images/" + name + "_full.png");
                //lblHeroes = new JLabel("",image,JLabel.CENTER);
                lblHeroes.setIcon(image);
                //pnlMain.add(lblHeroes,BorderLayout.CENTER);
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