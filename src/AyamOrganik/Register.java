package AyamOrganik;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Register extends JFrame implements ActionListener {

    public static void main(String[] args) {

        new Register();

    }

    JLabel labelLogin, labelUsername, labelPassword, labelRetryPassword, labelFullName, lblLogin;
    JTextField textUsername, txtFn;
    JPasswordField textPassword, txtUp;
    JButton buttonLogin;

    public Register() {

        setTitle("Register");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon image = new ImageIcon("C:\\Users\\A C E R\\Downloads\\JavaPicture\\chickenudel.png");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(100, 228, 20));

        labelLogin = new JLabel("Ayam Organik");
        labelLogin.setBounds(193, 42, 113, 32);
        labelLogin.setFont(new Font("Arial", Font.PLAIN, 16));
        labelLogin.setForeground(Color.white);
        add(labelLogin);

        labelUsername = new JLabel("USERNAME");
        labelUsername.setBounds(163, 97, 74, 13);
        labelUsername.setForeground(Color.gray);
        add(labelUsername);

        textUsername = new JTextField();
        textUsername.setBounds(155, 92, 190, 23);
        add(textUsername);

        labelPassword = new JLabel("PASSWORD");
        labelPassword.setBounds(163, 135, 74, 13);
        labelPassword.setForeground(Color.gray);
        add(labelPassword);

        textPassword = new JPasswordField();
        textPassword.setBounds(155, 130, 190, 23);
        add(textPassword);

        labelRetryPassword = new JLabel("RETRY PASSWORD");
        labelRetryPassword.setBounds(163, 173, 150, 13);
        labelRetryPassword.setForeground(Color.gray);
        add(labelRetryPassword);

        txtUp = new JPasswordField();
        txtUp.setBounds(155, 168, 190, 23);
        add(txtUp);

        labelFullName = new JLabel("FULL NAME");
        labelFullName.setBounds(163, 211, 150, 13);
        labelFullName.setForeground(Color.gray);
        add(labelFullName);

        txtFn = new JTextField();
        txtFn.setBounds(155, 206, 190, 23);
        add(txtFn);

        buttonLogin = new JButton("REGISTER");
        buttonLogin.setBounds(196, 270, 109, 34);
        buttonLogin.setBackground(Color.black);
        buttonLogin.setForeground(Color.white);
        buttonLogin.setFocusable(false);
        buttonLogin.addActionListener(this);
        add(buttonLogin);

        lblLogin = new JLabel();
        lblLogin.setText("Login");
        lblLogin.setBounds(230, 240, 180, 15);
        lblLogin.setForeground(Color.red);

        lblLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Login().setVisible(true);
            }
        });

        add(lblLogin);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonLogin) {

            String username = textUsername.getText();
            String password = String.valueOf(textPassword.getPassword());
            String uPassword = String.valueOf(txtUp.getPassword());
            String namaP = txtFn.getText();

            PreparedStatement ps;            
            String sql = "INSERT INTO `tabel_login`(`username`, `password`, `fullname`) VALUES (?,?,?)";

            try {
                ps = Connect.getConnection().prepareStatement(sql);

                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, namaP);

                if (username.isEmpty() && password.isEmpty() && uPassword.isEmpty() && namaP.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Isi Semua Data", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (username.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Isi Username", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Isi Password", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (uPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Isi Ulangi Password", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (namaP.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Isi Nama Panjang", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals(uPassword)) {
                    JOptionPane.showMessageDialog(null, "Password Salah", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (ps.executeUpdate() > 0) {                    
                    JOptionPane.showMessageDialog(null, "Anda Berhasil Register");
                    dispose();
                    new Login().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR");
                }

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, "Aktifkan Service MySQL Menggunakan XAMPP", "", JOptionPane.WARNING_MESSAGE);
                System.out.println(ee.getMessage());
            }
        }
    }
}
