package AyamOrganik;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputDataRestock extends JFrame implements ActionListener {

    public static void main(String[] args) {

        new InputDataRestock();

    }

    JPanel lefPanel, upRightPanel;
    JLabel restock, prof, tanggalPenjualan, lblNp, LblPa, lblTa, lblTh, lblTxtTp, lblTxtNp;
    JLabel sd, st, se, sl, fp, fd;
    JButton loBtn, idBtn, tdBtn, stBtn, inputBtn, upLeftPanel;
    JTextField txtTgl, txtNp;
    JCheckBox satu, dua, tiga, empat, lima, enam;
    ButtonGroup grup1, grup2;

    public InputDataRestock() {

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

        //
        tanggalPenjualan = new JLabel("Tanggal Restock");
        tanggalPenjualan.setBounds(190, 46, 150, 25);
        add(tanggalPenjualan);

        lblTxtTp = new JLabel("mm/dd/yy");
        lblTxtTp.setBounds(200, 88, 100, 19);
        lblTxtTp.setForeground(Color.gray);
        add(lblTxtTp);

        txtTgl = new JTextField();
        txtTgl.setBounds(192, 83, 310, 30);
        add(txtTgl);

        lblNp = new JLabel("Nama Penjual");
        lblNp.setBounds(192, 130, 110, 25);
        add(lblNp);

        lblTxtNp = new JLabel("Nama");
        lblTxtNp.setBounds(200, 172, 100, 19);
        lblTxtNp.setForeground(Color.gray);
        add(lblTxtNp);

        txtNp = new JTextField();
        txtNp.setBounds(192, 167, 310, 30);
        add(txtNp);

        LblPa = new JLabel("Pilihan Ayam");
        LblPa.setBounds(192, 214, 100, 25);
        add(LblPa);

        inputBtn = new JButton("Input");
        inputBtn.setBounds(192, 401, 100, 25);
        inputBtn.setBackground(Color.blue);
        inputBtn.setFocusable(false);
        inputBtn.setForeground(Color.white);
        inputBtn.addActionListener(this);
        add(inputBtn);

        //
        sd = new JLabel("1.2");
        sd.setBounds(236, 254, 25, 20);
        add(sd);

        st = new JLabel("1.3");
        st.setBounds(236, 296, 25, 20);
        add(st);

        se = new JLabel("1.4");
        se.setBounds(236, 337, 25, 20);
        add(se);

        fp = new JLabel("Fillet Paha");
        fp.setBounds(341, 254, 79, 20);
        add(fp);

        fd = new JLabel("Fillet Dada");
        fd.setBounds(341, 296, 79, 20);
        add(fd);

        sl = new JLabel("1.5");
        sl.setBounds(341, 337, 25, 20);
        add(sl);

        //
        satu = new JCheckBox();
        satu.setBounds(192, 250, 30, 27);
        satu.setBackground(new Color(100, 228, 20));
        add(satu);

        dua = new JCheckBox();
        dua.setBounds(192, 292, 30, 27);
        dua.setBackground(new Color(100, 228, 20));
        add(dua);

        tiga = new JCheckBox();
        tiga.setBounds(192, 337, 30, 27);
        tiga.setBackground(new Color(100, 228, 20));
        add(tiga);

        empat = new JCheckBox();
        empat.setBounds(295, 251, 30, 27);
        empat.setBackground(new Color(100, 228, 20));
        add(empat);

        lima = new JCheckBox();
        lima.setBounds(295, 295, 30, 27);
        lima.setBackground(new Color(100, 228, 20));
        add(lima);

        enam = new JCheckBox();
        enam.setBounds(295, 337, 30, 27);
        enam.setBackground(new Color(100, 228, 20));
        add(enam);

        grup1 = new ButtonGroup();
        grup1.add(satu);
        grup1.add(dua);
        grup1.add(tiga);
        grup1.add(enam);

        grup2 = new ButtonGroup();
        grup2.add(empat);
        grup2.add(lima);        

        //
        ImageIcon profile = new ImageIcon("C:\\Users\\A C E R\\Downloads\\JavaPicture\\profile2.png");

        prof = new JLabel("Admin");
        prof.setIcon(profile);
        prof.setHorizontalTextPosition(JLabel.CENTER);
        prof.setVerticalTextPosition(JLabel.BOTTOM);
        prof.setBounds(60, -20, 200, 200);
        add(prof);

//        penjualan = new JLabel("PENJUALAN");
//        penjualan.setBounds(258, 7, 98, 19);
//        add(penjualan);
        restock = new JLabel("RESTOCK");
        restock.setBounds(520, 8, 77, 19);
        add(restock);

        loBtn = new JButton("LOG OUT");
        loBtn.setBounds(38, 150, 112, 30);
        loBtn.setBackground(Color.red);
        loBtn.setForeground(Color.white);
        loBtn.addActionListener(this);
        loBtn.setFocusable(false);
        add(loBtn);

        idBtn = new JButton("INPUT DATA");
        idBtn.setBounds(28, 250, 133, 35);
        idBtn.setBackground(Color.white);
        idBtn.setForeground(Color.black);
        idBtn.setFocusable(false);
        add(idBtn);

        tdBtn = new JButton("TAMPIL DATA");
        tdBtn.setBounds(28, 300, 133, 35);
        tdBtn.setBackground(Color.black);
        tdBtn.setForeground(Color.white);
        tdBtn.addActionListener(this);
        tdBtn.setFocusable(false);
        add(tdBtn);

        stBtn = new JButton("SETELAN");
        stBtn.setBounds(28, 410, 133, 35);
        stBtn.setBackground(Color.gray);
        stBtn.setForeground(Color.white);
        stBtn.addActionListener(this);
        stBtn.setFocusable(false);
        add(stBtn);

        upRightPanel = new JPanel();
        upRightPanel.setBackground(Color.white);
        upRightPanel.setBounds(438, 0, 272, 35);
        add(upRightPanel);

        upLeftPanel = new JButton("PENJUALAN");
        upLeftPanel.setBackground(new Color(15, 251, 51));
        upLeftPanel.setBounds(177, 0, 265, 35);
        upLeftPanel.setFocusable(false);
        upLeftPanel.addActionListener(this);
        add(upLeftPanel);

        add(lefPanel);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loBtn) {
            new Login().setVisible(true);
            dispose();
        } else if (e.getSource() == tdBtn) {
            dispose();
            new TampilDataPenjualan().setVisible(true);
        } else if (e.getSource() == stBtn) {
            dispose();
            new Setelan().setVisible(true);
        } else if (e.getSource() == upLeftPanel) {
            dispose();
            new InputDataPenjualan();
        } else if (e.getSource() == inputBtn) {            
            
            String nama = txtNp.getText();
            String tgl = txtTgl.getText();
            
            if (grup1.getSelection() == null || grup2.getSelection() == null
                    || nama.isEmpty() || tgl.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isi Semua Data", "", JOptionPane.ERROR_MESSAGE);
            } else {            
            JOptionPane.showMessageDialog(null, "Input Data Berhasil");
            
            txtNp.setText("");
            txtTgl.setText("");
            grup1.clearSelection();
            grup2.clearSelection();
            
            }
        }
    }

}
