package logg;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;
public class PanelUsuario {
	private static boolean visible=false;

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public PanelUsuario(int id_u) {	
		
		Color Gris = new Color(112, 128, 144);
		
		
		JFrame frame2 = new JFrame();
		frame2.setUndecorated(true);
		frame2.setBounds(100, 100, 512, 410);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JPanel Panel_Buscador = new JPanel();
		Panel_Buscador.setBackground(new Color(112, 128, 144));
		Panel_Buscador.setBounds(0, 0, 513, 49);
		frame2.getContentPane().add(Panel_Buscador);
		Panel_Buscador.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 513, 418);
		frame2.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 151, 81));
		panel_1.setBounds(0, 48, 513, 160);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		ImageIcon logo2 = new ImageIcon("img/userbig.png");
        Image logoOut2 = logo2.getImage();
        Image scaledlogo2 = logoOut2.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage2 = new ImageIcon(scaledlogo2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(219, 11, 80, 80);
		lblNewLabel.setIcon(scaledlogoImage2);
		panel_1.add(lblNewLabel);
		
		/*-------------------------------*/
		
		String nombreApellido = InsertarUsuarios.obtenerNombre(id_u);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(167, 102, 154, 18);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_1.setText("Nombre:"+nombreApellido);
		
		
		String gmail = InsertarUsuarios.obtenergmail(id_u);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(167, 131, 207, 18);
		panel_1.add(lblNewLabel_1_1);
		
		lblNewLabel_1_1.setText("Gmail:"+gmail);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 206, 513, 210);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		if(id_u==10) {
			panel_2.setVisible(false);
		}else {
			panel_2.setVisible(true);
		}
		
		JLabel lblNewLabel_2 = new JLabel("Tus Likes");
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(75, 11, 100, 29);
		panel_2.add(lblNewLabel_2);
		
		// Supongamos que tienes una lista de registros obtenida de la base de datos
		List<String> registros = InsertarUsuarios.obtenerRegistros(id_u);

		// Insertar los resultados en tu interfaz de usuario
		for (int i = 0; i < registros.size(); i++) {
		    String resultado = registros.get(i);
		    JLabel lblNewLabel1 = new JLabel(resultado);
		    lblNewLabel1.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 15));
		    lblNewLabel1.setBounds(40, 68 + i * 25, 200, 14);
		    panel_2.add(lblNewLabel1);
		}
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(0, 0, 254, 235);
		panel_2.add(panel_3);
		
		ImageIcon logo = new ImageIcon("img/AutosFondo.jpeg");
        Image logoOut = logo.getImage();
        Image scaledlogo = logoOut.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage = new ImageIcon(scaledlogo);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(179, -16, 392, 262);
		lblNewLabel_3.setIcon(scaledlogoImage);
		panel_2.add(lblNewLabel_3);
		
		/*------------------------------------------------------*/
		
		JButton Boton_LogoMini = new JButton("");
		Boton_LogoMini.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

	    		Pagina2.main(id_u);
	    		
	    		frame2.setVisible(false);
	    	}
	    });
		Boton_LogoMini.setBounds(50, 11, 86, 26);
		Boton_LogoMini.setOpaque(true);
		ImageIcon img3 = new ImageIcon("img/LogoChico.png");
		Image Scaledimg3 = img3.getImage().getScaledInstance(Boton_LogoMini.getWidth(), Boton_LogoMini.getHeight(), Image.SCALE_SMOOTH);  
		ImageIcon Scaledimg3ToIcon = new ImageIcon(Scaledimg3); 
		Boton_LogoMini.setIcon(Scaledimg3ToIcon);
		Panel_Buscador.add(Boton_LogoMini);
		
		JButton Boton_Modelos = new JButton("Modelos");
		Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 15));  //aca
		Boton_Modelos.setBounds(379,12, 89, 23);  //aca
		Boton_Modelos.setBorderPainted(false); // aca
		Boton_Modelos.setContentAreaFilled(false); //aca
		Boton_Modelos.setFocusPainted(false); //aca
		Panel_Buscador.add(Boton_Modelos);
		
		Boton_Modelos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame2.setVisible(false);
				
				PaginaPrincipal.main(id_u);
			}
		});
		
		JButton Boton_MenuBarras = new JButton("");
	    Boton_MenuBarras.setBounds(10, 11, 30, 30);
		Boton_MenuBarras.setOpaque(true);
		Boton_MenuBarras.setBorderPainted(false); //aca
		Boton_MenuBarras.setContentAreaFilled(false); //aca
		Boton_MenuBarras.setFocusPainted(false); //aca
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Menu1.png"));
		Boton_MenuBarras.setIcon(img);
		Panel_Buscador.add(Boton_MenuBarras);
		
		 JPopupMenu menuDesplegable = new JPopupMenu();
		 
	        JMenuItem menuItem1 = new JMenuItem("Modelos");
	        menuItem1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		PaginaPrincipal.main(id_u);
	        		frame2.setVisible(false);
	        	}
	        });
	        JMenuItem menuItem2 = new JMenuItem("Nuestros Autos");
	        menuItem2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Pagina3.main(id_u);
	        		frame2.setVisible(false);
	        	}
	        });
	        JMenuItem menuItem3 = new JMenuItem("Partners");
	        menuItem3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Partners.main(id_u);
	        		frame2.setVisible(false);
	        	}
	        });
	        menuDesplegable.setBackground(Gris); //aca
	        menuItem1.setBackground(Gris); //aca
	        menuItem1.setForeground(Color.WHITE); //aca
	        menuItem2.setBackground(Gris); //aca
	        menuItem2.setForeground(Color.WHITE); //aca
	        menuItem3.setBackground(Gris);   //aca
	        menuItem3.setForeground(Color.WHITE); //aca
	        menuDesplegable.add(menuItem1);
	        menuDesplegable.add(menuItem2);
	        menuDesplegable.add(menuItem3);
	        
	        Boton_MenuBarras.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                menuDesplegable.show(Boton_MenuBarras, 0, Boton_MenuBarras.getHeight());
	            }
	        });
		
		JPanel pane_user = new JPanel();
		pane_user.setBounds(408, 0, 105, 54);
		panel_1.add(pane_user);
		pane_user.setLayout(new GridLayout(2, 2, 0, 0));
		
		pane_user.setVisible(visible);
		
		JButton Boton_Usuario = new JButton("");
		Boton_Usuario.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

	    		if(visible) {
	    			pane_user.setVisible(false);
	    			visible=false;
	    		}else {
	    			pane_user.setVisible(true);
	    			visible=true;
	    		}
	    	}
	    });
		Boton_Usuario.setBounds(473, 11, 30, 30);
        Boton_Usuario.setBorderPainted(false);
        Boton_Usuario.setContentAreaFilled(false);
        Boton_Usuario.setFocusPainted(false);
        
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Usuario .png"));
		Boton_Usuario.setIcon(img5);
		Panel_Buscador.add(Boton_Usuario);
		
		ImageIcon logo_1 = new ImageIcon("img/logout.png");
        Image logo1_1 = logo_1.getImage();
        Image scaledlogo_1 = logo1_1.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage_1 = new ImageIcon(scaledlogo_1);
        
        ImageIcon logo_2 = new ImageIcon("img/engranaje.png");
        Image logoOut_2 = logo_2.getImage();
        Image scaledlogo_2 = logoOut_2.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage_2 = new ImageIcon(scaledlogo_2);
		
		JButton btnNewButton_1 = new JButton("Administrar");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setIcon(scaledlogoImage_2);
		pane_user.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		InsertarUsuarios insertarUsuarios = new InsertarUsuarios();
	    		String nombreApellido = insertarUsuarios.obtenerNombreApellido_id(id_u); 
	    		
	    		JOptionPane.showMessageDialog(null, "Muchas gracias " + nombreApellido + "!!");
	    		
	    		pane_user.setVisible(visible);
	    		visible=false;

	    		Principal.main(null);
	    		frame2.setVisible(false);
	    	}
	    });
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setIcon(scaledlogoImage_1);
		btnNewButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		pane_user.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(0, 206, 513, 210);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Estadísticas");
		lblNewLabel_4.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(188, 11, 144, 49);
		panel_4.add(lblNewLabel_4);
		
		ImageIcon logo_3 = new ImageIcon("img/chart.png");
        Image logo1_3 = logo_3.getImage();
        Image scaledlogo_3 = logo1_3.getScaledInstance(200, 170, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage_3 = new ImageIcon(scaledlogo_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(scaledlogoImage_3);
		lblNewLabel_5.setBounds(150, 60, 200, 170);
		panel_4.add(lblNewLabel_5);
		
		/*----------------------------------------------------------*/
		


		frame2.setVisible(true);
		
	}
	
	public static void main(int id_u) {
		javax.swing.SwingUtilities.invokeLater(() -> new PanelUsuario(id_u));
	}
}
