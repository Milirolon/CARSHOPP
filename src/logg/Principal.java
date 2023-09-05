package logg;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.BorderFactory;

public class Principal {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 584, 360);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 584, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(182, 50, 248, 154);
		panel.add(panel_1);
		panel_1.setLayout(null);

		
		JLabel lblNewLabel = new JLabel("¡ Bienvenido !");
		lblNewLabel.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 25));
		lblNewLabel.setBounds(50, 11, 149, 45);
		panel_1.add(lblNewLabel);
		
		ImageIcon logo = new ImageIcon("img/Logo1.png");
        Image logo1 = logo.getImage();
        Image scaledlogo = logo1.getScaledInstance(200, 60, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage = new ImageIcon(scaledlogo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(scaledlogoImage);
		lblNewLabel_1.setBounds(27, 63, 200, 65);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("¡ Bienvenido !");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(51, 12, 162, 45);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBounds(17, 213, 262, 147);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				login.main(args);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		btnNewButton_1.setBackground(new Color(41, 91, 200));
		btnNewButton_1.setBounds(83, 67, 102, 37);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(Color.WHITE);
		panel_2_1.setOpaque(false);
		panel_2_1.setBounds(312, 213, 262, 147);
		panel.add(panel_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Registrar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				userprofile.main(args);
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		btnNewButton_1_1.setBackground(new Color(163, 7, 228));
		btnNewButton_1_1.setBounds(83, 66, 112, 40);
		panel_2_1.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(515, 11, 59, 23);
		panel.add(btnNewButton);
		
		ImageIcon fondo = new ImageIcon("img/AutosFondo.jpeg");
        Image fondo1 = fondo.getImage();
        Image scaledfondo = fondo1.getScaledInstance(584, 360, Image.SCALE_SMOOTH);
        ImageIcon scaledFondoImage = new ImageIcon(scaledfondo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(scaledFondoImage);
		lblNewLabel_2.setBounds(0, 0, 584, 360);
		panel.add(lblNewLabel_2);


		
		frame.setVisible(true);
	}
}
