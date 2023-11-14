package AyamOrganik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Setelan extends JFrame implements ActionListener {

    public static void main(String[] args) {

        new Setelan();

    }

    JPanel lefPanel, upPanel, midPanel;
    JLabel prof, lblTat, lblCl, lblBl, lblTtp, rd, rp;
    JButton loBtn, idBtn, tdBtn, stBtn, r1, r2;

    public Setelan() {

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
        lefPanel.setBackground(new Color(15, 251, 51));
        lefPanel.setBounds(0, 0, 177, 500);

        ImageIcon profile = new ImageIcon("C:\\Users\\A C E R\\Downloads\\JavaPicture\\profile2.png");

        prof = new JLabel("Admin");
        prof.setIcon(profile);
        prof.setHorizontalTextPosition(JLabel.CENTER);
        prof.setVerticalTextPosition(JLabel.BOTTOM);
        prof.setBounds(60, -20, 200, 200);
        add(prof);

        loBtn = new JButton("LOG OUT");
        loBtn.setBounds(38, 150, 112, 30);
        loBtn.setBackground(Color.red);
        loBtn.setForeground(Color.white);
        loBtn.setFocusable(false);
        loBtn.addActionListener(this);
        add(loBtn);

        idBtn = new JButton("INPUT DATA");
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
        stBtn.setBackground(Color.white);
        stBtn.setForeground(Color.black);
        stBtn.setFocusable(false);
        stBtn.addActionListener(this);
        add(stBtn);

        upPanel = new JPanel();
        upPanel.setBackground(new Color(15, 251, 51));
        upPanel.setBounds(177, 0, 523, 35);
        add(upPanel);

//        lblTat = new JLabel("Total Ayam Terjual");
//        lblTat.setBounds(201, 54, 138, 19);
//        lblTat.setForeground(Color.white);
//        add(lblTat);

        lblCl = new JLabel("Costumer Langganan");
        lblCl.setBounds(492, 54, 162, 19);
        lblCl.setForeground(Color.white);
        add(lblCl);

        lblTtp = new JLabel("Total Transaksi Penjualan");
        lblTtp.setBounds(201, 54, 170, 19);
        lblTtp.setForeground(Color.white);
        add(lblTtp);

//        lblBl = new JLabel("Banyak Transaksi");
//        lblBl.setBounds(492, 142, 132, 19);
//        lblBl.setForeground(Color.white);
//        add(lblBl);

        rd = new JLabel("Reset Database");
        rd.setBounds(208, 375, 120, 19);
        rd.setForeground(Color.white);
        add(rd);

        rp = new JLabel("Reset Password");
        rp.setBounds(208, 420, 122, 19);
        rp.setForeground(Color.white);
        add(rp);
        
        r1 = new JButton("Reset");
        r1.setBounds(354, 375, 78, 23);
        r1.setFocusable(false);
        r1.setBackground(Color.black);
        r1.setForeground(Color.white);
        r1.addActionListener(this);
        add(r1);
        
        r2 = new JButton("Reset");
        r2.setBounds(354, 420, 78, 23);
        r2.setFocusable(false);
        r2.setBackground(Color.black);
        r2.setForeground(Color.white);
        r2.addActionListener(this);
        add(r2);

        midPanel = new JPanel();
        midPanel.setBounds(180, 33, 520, 467);
        midPanel.setBackground(Color.gray);
        add(midPanel);                

        add(lefPanel);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loBtn) {
            new Login().setVisible(true);
            dispose();
        } else if (e.getSource() == idBtn) {
            dispose();
            new InputDataPenjualan().setVisible(true);
        } else if (e.getSource() == tdBtn) {
            dispose();
            new TampilDataPenjualan().setVisible(true);
        } else if (e.getSource() == r1) {
            JOptionPane.showMessageDialog(null, "Database Berhasil di Reset");
        } else if (e.getSource() == r2) {
            JOptionPane.showMessageDialog(null, "Password Berhasil di Reset");
        }

    }

}
