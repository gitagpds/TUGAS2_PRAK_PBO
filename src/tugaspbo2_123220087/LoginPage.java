/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo2_123220087;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author gitap
 */

public class LoginPage extends JFrame implements ActionListener {
    // KALIMAT PEMBUKA
    JLabel kal1 = new JLabel("Selamat Datang!");
    JLabel kal2 = new JLabel("Silakan masuk untuk melanjutkan.");
    
    // INPUT USERNAME DAN PASSWORD
    JLabel labelUsername = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    
    JLabel labelPassword = new JLabel("Password");
    JTextField inputPassword = new JTextField();
    
    // RADIOBUTTON JENIS KELAMIN
    JLabel labelJK = new JLabel("Jenis Kelamin");
    JRadioButton pilihLaki = new JRadioButton("Laki-laki");
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan", true);
    
    // BUTTON LOGIN
    JButton tombolLogin = new JButton("Login");
    
    LoginPage(){
        setVisible(true);
        setSize(650, 650);
 
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        // KALIMAT PEMBUKA
        add(kal1);
        kal1.setFont(kal1.getFont().deriveFont(24.0f));
        kal1.setBounds(30, 10, 500, 50);
        
        add(kal2);
        kal2.setFont(kal2.getFont().deriveFont(16.0f));
        kal2.setBounds(30, 40, 500, 50);
        
        // INPUT USERNAME DAN PASSWORD
        add(labelUsername);
        labelUsername.setFont(labelUsername.getFont().deriveFont(16.0f));
        labelUsername.setBounds(30, 80, 100, 50);
        
        add(inputUsername);
        inputUsername.setBounds(30, 125, 570, 35);
        
        add(labelPassword);
        labelPassword.setFont(labelPassword.getFont().deriveFont(16.0f));
        labelPassword.setBounds(30, 170, 100, 50);
        
        add(inputPassword);
        inputPassword.setBounds(30, 215, 570, 35);
        
        // RADIOBUTTON JENIS KELAMIN
        add(labelJK);
        labelJK.setFont(labelJK.getFont().deriveFont(16.0f));
        labelJK.setBounds(30, 260, 500, 50);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);
        
        add(pilihLaki);
        pilihLaki.setFont(pilihLaki.getFont().deriveFont(16.0f));
        pilihLaki.setBounds(28, 305, 100, 30);
        
        add(pilihPerempuan);
        pilihPerempuan.setFont(pilihPerempuan.getFont().deriveFont(16.0f));
        pilihPerempuan.setBounds(300, 305, 300, 30);
        
        // BUTTON LOGIN
        add(tombolLogin);
        tombolLogin.setFont(tombolLogin.getFont().deriveFont(16.0f));
        tombolLogin.setBounds(30, 360, 570, 35);
        tombolLogin.setBackground(Color.white);
            tombolLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = inputUsername.getText();
            String password = inputPassword.getText();
            String jenisKelamin = pilihLaki.isSelected() ? "l" : "p" ; // operator ternary
            
            if (username.isEmpty())
            {
                throw new Exception("Username Tidak Boleh Kosong");
            }
            
            if (password.isEmpty()) 
            {
                throw new Exception("Password tidak boleh kosong.");
            }
            
            new BalokPage(username, password, jenisKelamin);
            this.dispose();
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
}
