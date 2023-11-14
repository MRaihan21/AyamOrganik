package AyamOrganik;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    public static void main(String[] args) {

        new Login();

    }

    JLabel labelLogin, labelUsername, labelPassword, lblRegister;
    JTextField textUsername, textPassword;
    JButton buttonLogin;

    public Login() {

        setTitle("Login");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon image = new ImageIcon("C:\\Users\\A C E R\\Downloads\\JavaPicture\\chickenudel.png");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(100, 228, 20));

        labelLogin = new JLabel("Ayam Organik");
        labelLogin.setBounds(165, 76, 200, 29);
        labelLogin.setFont(new Font("Arial", Font.PLAIN, 24));
        labelLogin.setForeground(Color.white);
        add(labelLogin);

        labelUsername = new JLabel("USERNAME");
        labelUsername.setBounds(143, 135, 68, 15);
        labelUsername.setForeground(Color.gray);
        add(labelUsername);

        textUsername = new JTextField();
        textUsername.setBounds(135, 123, 230, 40);
        add(textUsername);

        labelPassword = new JLabel("PASSWORD");
        labelPassword.setBounds(142, 207, 70, 15);
        labelPassword.setForeground(Color.gray);
        add(labelPassword);

        textPassword = new JTextField();
        textPassword.setBounds(135, 195, 230, 40);
        add(textPassword);

        buttonLogin = new JButton("LOGIN");
        buttonLogin.setBounds(196, 270, 109, 34);
        buttonLogin.setBackground(Color.black);
        buttonLogin.setForeground(Color.white);
        buttonLogin.setFocusable(false);
        buttonLogin.addActionListener(this);
        add(buttonLogin);

        lblRegister = new JLabel();
        lblRegister.setText("Register");
        lblRegister.setBounds(225, 245, 180, 15);
        lblRegister.setForeground(Color.red);

        lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new Register().setVisible(true);
            }
        });

        add(lblRegister);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonLogin) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_ayamorganik", "root", "");

                Statement stm = con.createStatement();

                String username = textUsername.getText();
                String password = textPassword.getText();
                String sql = "SELECT * FROM tabel_login WHERE username='"
                        + username + "' AND password='" + password + "'";

                ResultSet rs = stm.executeQuery(sql);

                if (username.equals("") && password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Isi Username dan Password", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Isi Password", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Isi Username", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Anda Berhasil Login");
                    dispose();
                    new MainPage().setVisible(true);                    
                } else {
                    JOptionPane.showMessageDialog(null, "Username & Password Salah", "Message", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, "Aktifkan Service MySQL Menggunakan XAMPP", "", JOptionPane.WARNING_MESSAGE);
                System.out.println(ee.getMessage());
            }

        }
    }
}
