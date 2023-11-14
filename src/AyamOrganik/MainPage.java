package AyamOrganik;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JFrame implements ActionListener{

    public static void main(String[] args) {
        
        new MainPage();
        
    }

    JPanel lefPanel, upPanel;
    JLabel judul, prof;
    JButton loBtn, idBtn, tdBtn, stBtn;
    
    public MainPage() {
        
        setTitle("Main Page");        
        setSize(700, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(null);
        
        ImageIcon image = new ImageIcon("C:\\Users\\A C E R\\Downloads\\JavaPicture\\chickenudel.png");
        setIconImage(image.getImage());        
        getContentPane().setBackground(new Color(100, 228, 20)); 
        
        lefPanel = new JPanel();
        lefPanel.setBackground(new Color(15,251,51));
        lefPanel.setBounds(0, 0, 177, 500);        
        
        ImageIcon profile = new ImageIcon("C:\\Users\\A C E R\\Downloads\\JavaPicture\\profile2.png");

        prof = new JLabel("Admin");
        prof.setIcon(profile);
        prof.setHorizontalTextPosition(JLabel.CENTER);
        prof.setVerticalTextPosition(JLabel.BOTTOM);
        prof.setBounds(60, -20, 200, 200);
        add(prof);
        
        judul = new JLabel("APLIKASI AYAM ORGANIK");
        judul.setBounds(235, 195, 418, 63);
        judul.setForeground(Color.white);
        judul.setFont(new Font("Arial", Font.BOLD, 30));
        add(judul);
        
        loBtn = new JButton("LOG OUT");
        loBtn.setBounds(38, 150, 112, 30);
        loBtn.setBackground(Color.red);
        loBtn.setForeground(Color.white);                
        loBtn.setFocusable(false);
        loBtn.addActionListener(this);
        add(loBtn);
        
        idBtn= new JButton("INPUT DATA");
        idBtn.setBounds(28, 250, 133, 35);
        idBtn.setBackground(Color.black);
        idBtn.setForeground(Color.white);
        idBtn.setFocusable(false);
        idBtn.addActionListener(this);
        add(idBtn);
        
        tdBtn = new JButton("TAMPIL DATA");
        tdBtn.setBounds(28, 300, 133, 35);
        tdBtn.setBackground(Color.black);
        tdBtn.setForeground(Color.white);
        tdBtn.setFocusable(false);
        tdBtn.addActionListener(this);
        add(tdBtn);        
        
        stBtn = new JButton("SETELAN");
        stBtn.setBounds(28, 410, 133, 35);
        stBtn.setBackground(Color.gray);
        stBtn.setForeground(Color.white);
        stBtn.setFocusable(false);
        stBtn.addActionListener(this);
        add(stBtn);        
        
        upPanel = new JPanel();
        upPanel.setBackground(new Color(15,251,51));
        upPanel.setBounds(177, 0, 523, 35);
        add(upPanel);
        
        add(lefPanel);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == loBtn) {
            new Login().setVisible(true);
            dispose();
        } else if (e.getSource() == idBtn){
            dispose();
            new InputDataPenjualan().setVisible(true);
        } else if (e.getSource() == tdBtn){
            dispose();
            new TampilDataPenjualan().setVisible(true);
        } else if (e.getSource() == stBtn) {
            dispose();
            new Setelan().setVisible(true);
        }
        
    }
    
    
    
}
