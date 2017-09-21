package com.company;

import jdk.nashorn.internal.objects.Global;

import javax.swing.*;
import javax.xml.bind.annotation.XmlElementDecl;
import java.awt.*;

/**
 * Created by griffithsa on 19/09/2017.
 */
public class Controller {

    private JFrame frame = new JFrame();
    private JLayeredPane lpane = new JLayeredPane();
    private JPanel panelBlue = new JPanel();
    private JPanel panelGreen = new JPanel();
    private Login form = new Login();
    private Menu form2 = new Menu();
    public String testPanel = "";

    public Controller() {

        frame.setPreferredSize(new Dimension(600, 400));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        frame.setContentPane(form.pnlMain);
        if (testPanel.equals("2")) frame.setContentPane(form2.panel1);
        else frame.setContentPane(form.pnlMain);

        lpane.setBounds(0, 0, 600, 400);
        panelBlue.setBackground(Color.BLUE);
        panelBlue.setBounds(0, 0, 600, 400);
        panelBlue.setOpaque(true);
        //panelGreen.setBackground(Color.GREEN);
        form.test1.setBounds(000, 100, 600, 200);
        //panelGreen.setOpaque(true);
        lpane.add(panelBlue, new Integer(0), 0);
        lpane.add(form.test1, new Integer(1), 0);
        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        Controller gui = new Controller();

    }

}
