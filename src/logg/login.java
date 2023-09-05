package logg;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class login {
	private static JTextField textField;
	private static JPasswordField passwordField;
	private static boolean visible=false;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 584, 360);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 204, 361);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon logo = new ImageIcon("img/Logo1.png");
        Image logo1 = logo.getImage();
        Image scaledlogo = logo1.getScaledInstance(100, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage = new ImageIcon(scaledlogo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(scaledlogoImage);
		lblNewLabel_1.setBounds(50, 11, 100, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Log");
		lblNewLabel_2.setBorder(new MatteBorder(0, 0, 5, 0, (Color) new Color(255, 255, 0)));
		lblNewLabel_2.setFont(new Font("Haettenschweiler", Font.PLAIN, 35));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(69, 52, 41, 45);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("In");
		lblNewLabel_2_1.setBorder(new MatteBorder(0, 0, 5, 0, (Color) new Color(255, 255, 0)));
		lblNewLabel_2_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1.setFont(new Font("Haettenschweiler", Font.PLAIN, 35));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(106, 52, 26, 45);
		panel.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(35, 159, 127, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(35, 222, 127, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Email: ");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(35, 143, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña:");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(35, 205, 75, 14);
		panel.add(lblNewLabel_4);
		
		
		ImageIcon eyeIcon = new ImageIcon("img/ojo.png");
        Image image = eyeIcon.getImage();
        Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon = new ImageIcon(scaledImage);
        
        
        JButton btnNewButton_1 = new JButton("Ingresar");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gmail = textField.getText();
                char[] contrasena = passwordField.getPassword();
                String contrasenaStr = new String(contrasena);
                
                if (gmail.isEmpty() || contrasenaStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
                } else {
                    InsertarUsuarios insertarUsuarios = new InsertarUsuarios(); // Crear una instancia de la clase
                    boolean credencialesValidas = insertarUsuarios.verificarCredenciales(gmail, contrasenaStr);

                    if (credencialesValidas) {
                        String nombreApellido = insertarUsuarios.obtenerNombreApellido(gmail); 
                        if (nombreApellido != null) {
                        	
                        	int id_u = insertarUsuarios.obtenerID(gmail);
                        	
                            JOptionPane.showMessageDialog(null, "Bienvenido " + nombreApellido);
                            
                            
                           Pagina2.main(id_u);
                            
                            /***********/
                            
                            
                            frame.setVisible(false);
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Credenciales válidas. Registro exitoso.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Credenciales inválidas o correo no encontrado. Por favor verifique el correo y la contraseña.");
                    }
                }
            }

			private void Pagina2(int id_u) {
				// TODO Auto-generated method stub
				
			}
        });

        
        
        
        btnNewButton_1.setBounds(50, 263, 100, 25);
        panel.add(btnNewButton_1);

        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_1.setBackground(new Color(41, 91, 200));
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15)); // Espacios internos
        
        ImageIcon eyeIcon2 = new ImageIcon("E:\\\\5TO 2DA\\\\LPOO\\\\08-09-2023 Página Web HTML\\\\imágenes\\\\1077063.png");
        Image image2 = eyeIcon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon2 = new ImageIcon(scaledImage2);

        JLabel lblNewLabel_5_1 = new JLabel("");
        lblNewLabel_5_1.setIcon(scaledEyeIcon2);
        lblNewLabel_5_1.setBounds(5, 150, 30, 30);
        panel.add(lblNewLabel_5_1);
        
        
        ImageIcon eyeIcon3 = new ImageIcon("img/candado.png");
        Image image3 = eyeIcon3.getImage();
        Image scaledImage3 = image3.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon3 = new ImageIcon(scaledImage3);

        JLabel lblNewLabel_5_1_1 = new JLabel("");
        lblNewLabel_5_1_1.setIcon(scaledEyeIcon3);
        lblNewLabel_5_1_1.setBounds(5, 213, 30, 30);
        panel.add(lblNewLabel_5_1_1);
        
        ImageIcon userIcon = new ImageIcon("img/ojo.png");
        Image imageUser = userIcon.getImage();
        Image scaleUser = imageUser.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaleUIcon = new ImageIcon(scaleUser);
        
        ImageIcon userIcon2= new ImageIcon("img/eye_closed.png");
        Image imageUser2 = userIcon2.getImage();
        Image scaleUser2 = imageUser2.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaleUIcon2 = new ImageIcon(scaleUser2);
        
        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		if(visible){
        			btnNewButton_2.setIcon(scaleUIcon2);
        			passwordField.setEchoChar('•');
        			  visible=false;
        			   
        			 }else{
        			   
        			btnNewButton_2.setIcon(scaleUIcon);
        			passwordField.setEchoChar((char)0);
        			  visible=true;
        			 }
        	}
        });
        btnNewButton_2.setBorder(null);
        btnNewButton_2.setIcon(scaleUIcon2);
        btnNewButton_2.setBounds(168, 216, 30, 30);
        panel.add(btnNewButton_2);
        
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.setOpaque(true);

        
        
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(201, 0, 383, 361);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/AutosFondo.jpeg"));
		lblNewLabel.setBounds(-177, 0, 560, 361);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				Principal.main(args);
			}
		});
		btnNewButton.setBounds(284, 11, 89, 23);
		panel_1.add(btnNewButton);
		
		
		frame.setVisible(true);
		
	}
}

