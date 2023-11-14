package AyamOrganik;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TampilDataPenjualan extends JFrame implements ActionListener{

    public static void main(String[] args) {
        
        new TampilDataPenjualan();
        
    }

    JPanel lefPanel, upLeftPanel;
    JLabel penjualan, restock, prof;
    JButton loBtn, idBtn, tdBtn, stBtn, upRightPanel;
    
    public TampilDataPenjualan() {
        
        setTitle("AyamOrganik");        
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
                
        penjualan = new JLabel("PENJUALAN");
        penjualan.setBounds(258, 7, 98, 19);
        add(penjualan);
        
//        restock = new JLabel("RESTOCK");
//        restock.setBounds(520, 8, 77, 19);
//        add(restock);
        
        loBtn = new JButton("LOG OUT");
        loBtn.setBounds(38, 150, 112, 30);
        loBtn.setBackground(Color.red);
        loBtn.setForeground(Color.white);
        loBtn.addActionListener(this);
        loBtn.setFocusable(false);
        add(loBtn);
        
        idBtn= new JButton("INPUT DATA");
        idBtn.setBounds(28, 250, 133, 35);
        idBtn.setBackground(Color.black);
        idBtn.setForeground(Color.white);
        idBtn.addActionListener(this);
        idBtn.setFocusable(false);
        add(idBtn);
        
        tdBtn = new JButton("TAMPIL DATA");
        tdBtn.setBounds(28, 300, 133, 35);
        tdBtn.setBackground(Color.white);
        tdBtn.setForeground(Color.black);
        tdBtn.setFocusable(false);
        add(tdBtn);        
        
        stBtn = new JButton("SETELAN");
        stBtn.setBounds(28, 410, 133, 35);
        stBtn.setBackground(Color.gray);
        stBtn.setForeground(Color.white);
        stBtn.addActionListener(this);
        stBtn.setFocusable(false);
        add(stBtn);        
        
        upRightPanel = new JButton("RESTOCK");
        upRightPanel.setBackground(new Color(15,251,51));
        upRightPanel.setBounds(438, 0, 272, 35);
        upRightPanel.addActionListener(this);
        upRightPanel.setFocusable(false);
        add(upRightPanel);
        
        upLeftPanel = new JPanel();
        upLeftPanel.setBackground(Color.white);
        upLeftPanel.setBounds(175, 0, 265, 35);
        add(upLeftPanel);
        
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
        } else if (e.getSource() == stBtn) {
            dispose();
            new Setelan().setVisible(true);
        } else if (e.getSource() == upRightPanel) {
            dispose();
            new TampilDataRestock().setVisible(true);
        }
    }
    
    
    
}
