package com.company;
import java.awt.*;
import java.awt.event.*;
import java.text.Normalizer;
import javax.swing.*;

public class GUIController
{
    private JPanel contentPane;
    private Login panel1;
    private JPanel panel2;
    private JPanel panel3;

    /**public class Main {
     private JFrame frame = new JFrame();
     private JLayeredPane lpane = new JLayeredPane();
     private JPanel panelBlue = new JPanel();
     private JPanel panelGreen = new JPanel();
     public Main()
     {
     frame.setPreferredSize(new Dimension(600, 400));
     frame.setLayout(new BorderLayout());
     frame.add(lpane, BorderLayout.CENTER);
     lpane.setBounds(0, 0, 600, 400);
     panelBlue.setBackground(Color.BLUE);
     panelBlue.setBounds(0, 0, 600, 400);
     panelBlue.setOpaque(true);
     panelGreen.setBackground(Color.GREEN);
     panelGreen.setBounds(200, 100, 100, 100);
     panelGreen.setOpaque(true);
     lpane.add(panelBlue, new Integer(0), 0);
     lpane.add(panelGreen, new Integer(1), 0);
     frame.pack();
     frame.setVisible(true);
     }

     //@param args the command line arguments

    public static void main(String[] args) {
        new Main();
    }
    
     */

    public GUIController() {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();

        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout());


        //panel1 = new JPanel(contentPane);
        //panel2 = new Menu(contentPane);
        //contentPane.add(panel1, "Panel 1");
        //contentPane.add(panel2, "Panel 2");


        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

}

    public static void main(String[] args) {
        GUIController gui = new GUIController();

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
