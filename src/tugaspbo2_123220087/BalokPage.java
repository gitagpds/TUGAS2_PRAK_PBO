/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo2_123220087;

import BangunDatar.Persegi;
import BangunRuang.Balok;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author gitap
 */
public class BalokPage extends JFrame implements ActionListener {
    // KALIMAT PEMBUKA
    JLabel kal1 = new JLabel();
    JLabel kal2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    
    // INPUT PANJANG, LEBAR, DAN TINGGI
    JLabel labelPanjang = new JLabel("Panjang");
    JTextField inputPanjang = new JTextField();
    
    JLabel labelLebar = new JLabel("Lebar");
    JTextField inputLebar = new JTextField();
    
    JLabel labelTinggi = new JLabel("Tinggi");
    JTextField inputTinggi = new JTextField();
    
    // BUTTON HITUNG & RESET
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolReset = new JButton("Reset");
    
    // HASIL
    JLabel kal_hasil = new JLabel("Hasil");
    
    // LUAS & KELILING PERSEGI
    JLabel labelLuas = new JLabel("Luas Persegi");
    JLabel hasilLuas = new JLabel("[Hasil berupa angka]");
    JLabel labelKeliling = new JLabel("Keliling Persegi");
    JLabel hasilKeliling = new JLabel("[Hasil berupa angka]");
    
    // VOLUME & LUAS PERMUKAAN BALOK
    JLabel labelVolume = new JLabel("Volume Balok");
    JLabel hasilVolume = new JLabel("[Hasil berupa angka]");
    JLabel labelLuasPermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuasPermukaan = new JLabel("[Hasil berupa angka]");
    
    BalokPage(String username, String password, String jenisKelamin){
        String panggilan = (jenisKelamin == "l") ? "Mr. " : "Mrs. ";
        
        setVisible(true);
        setSize(650, 650);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        // KALIMAT PEMBUKA
        add(kal1);
        kal1.setText("Welcome, " + panggilan + username);
        kal1.setFont(kal1.getFont().deriveFont(24.0f));
        kal1.setBounds(30, 10, 500, 50);
        
        add(kal2);
        kal2.setFont(kal2.getFont().deriveFont(16.0f));
        kal2.setBounds(30, 40, 500, 50);
        
        // INPUT PANJANG
        add(labelPanjang);
        labelPanjang.setFont(labelPanjang.getFont().deriveFont(16.0f));
        labelPanjang.setBounds(30, 90, 100, 50);
        
        add(inputPanjang);
        inputPanjang.setBounds(190, 100, 390, 35);
        
        // INPUT LEBAR
        add(labelLebar);
        labelLebar.setFont(labelLebar.getFont().deriveFont(16.0f));
        labelLebar.setBounds(30, 140, 100, 50);
        
        add(inputLebar);
        inputLebar.setBounds(190, 150, 390, 35);
        
        // INPUT TINGGI
        add(labelTinggi);
        labelTinggi.setFont(labelTinggi.getFont().deriveFont(16.0f));
        labelTinggi.setBounds(30, 190, 100, 50);
        
        add(inputTinggi);
        inputTinggi.setBounds(190, 200, 390, 35);
        
        // BUTTON HITUNG
        add(tombolHitung);
        tombolHitung.setFont(tombolHitung.getFont().deriveFont(16.0f));
        tombolHitung.setBounds(30, 260, 550, 40);
        tombolHitung.setBackground(Color.white);
        
        // BUTTON RESET
        add(tombolReset);
        tombolReset.setFont(tombolReset.getFont().deriveFont(16.0f));
        tombolReset.setBounds(30, 320, 550, 40);
        tombolReset.setBackground(Color.white);
        
        // TULISAN HASIL
        add(kal_hasil);
        kal_hasil.setFont(kal_hasil.getFont().deriveFont(16.0f));
        kal_hasil.setHorizontalAlignment(SwingConstants.CENTER);
        kal_hasil.setBounds(55, 370, 500, 35);
        
        // LUAS PERSEGI
        add(labelLuas);
        labelLuas.setFont(labelLuas.getFont().deriveFont(16.0f));
        labelLuas.setBounds(30, 400, 200, 50);
        
        add(hasilLuas);
        hasilLuas.setFont(hasilLuas.getFont().deriveFont(16.0f));
        hasilLuas.setBounds(250, 400, 200, 50);
        
        // KELILING PERSEGI
        add(labelKeliling);
        labelKeliling.setFont(labelKeliling.getFont().deriveFont(16.0f));
        labelKeliling.setBounds(30, 440, 200, 50);
        
        add(hasilKeliling);
        hasilKeliling.setFont(hasilKeliling.getFont().deriveFont(16.0f));
        hasilKeliling.setBounds(250, 440, 200, 50);
        
        // VOLUME BALOK
        add(labelVolume);
        labelVolume.setFont(labelVolume.getFont().deriveFont(16.0f));
        labelVolume.setBounds(30, 480, 200, 50);
        
        add(hasilVolume);
        hasilVolume.setFont(hasilVolume.getFont().deriveFont(16.0f));
        hasilVolume.setBounds(250, 480, 200, 50);
        
        // LUAS PERMUKAAN BALOK
        add(labelLuasPermukaan);
        labelLuasPermukaan.setFont(labelLuasPermukaan.getFont().deriveFont(16.0f));
        labelLuasPermukaan.setBounds(30, 520, 200, 50);
        
        add(hasilLuasPermukaan);
        hasilLuasPermukaan.setFont(hasilLuasPermukaan.getFont().deriveFont(16.0f));
        hasilLuasPermukaan.setBounds(250, 520, 200, 50);
        
        tombolHitung.addActionListener(this);
        tombolReset.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tombolHitung) {
            try {
            String panjangStr = inputPanjang.getText();
            String lebarStr = inputLebar.getText();
            String tinggiStr = inputTinggi.getText();
            
            // Periksa apakah ada input yang kosong
            if (panjangStr.isEmpty() || lebarStr.isEmpty() || tinggiStr.isEmpty()) {
                throw new Exception("Empty string");
            }

            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double tinggi = Double.parseDouble(tinggiStr);

            Persegi bangun1 = new Persegi(panjang, lebar);
            Balok bangun2 = new Balok(panjang, lebar, tinggi);

            String Luas = String.valueOf(bangun1.Luas());
            String Keliling = String.valueOf(bangun1.Keliling());
            String Volume = String.valueOf(bangun2.Volume());
            String LuasPermukaan = String.valueOf(bangun2.LuasPermukaan());

            hasilLuas.setText(Luas);
            hasilKeliling.setText(Keliling);
            hasilVolume.setText(Volume);
            hasilLuasPermukaan.setText(LuasPermukaan);
        } catch (NumberFormatException ex) {
            // Tangani kesalahan jika input berupa string
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            // Tangani kesalahan jika ada input yang kosong
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
            
        } 
        
        
        else if (e.getSource() == tombolReset) {
            inputPanjang.setText("");
            inputLebar.setText("");
            inputTinggi.setText("");
            hasilLuas.setText("");
            hasilKeliling.setText("");
            hasilVolume.setText("");
            hasilLuasPermukaan.setText("");
        }
    }
    
}
