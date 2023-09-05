package logg;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.JOptionPane;

public class Pagina2 {
	
	private JFrame frame2;
	private static boolean visible=false;
	/**
	 * @wbp.parser.entryPoint
	 */
	public Pagina2(int id_u) {
		Color Gris = new Color(112, 128, 144);
		
		frame2 = new JFrame();
		frame2.setUndecorated(true);
		frame2.setBounds(100, 100, 513, 343);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JPanel Panel_Buscador = new JPanel();
		Panel_Buscador.setBackground(new Color(112, 128, 144));
		Panel_Buscador.setBounds(0, 0, 513, 49);
		frame2.getContentPane().add(Panel_Buscador);
		Panel_Buscador.setLayout(null);
		
	
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
		
		JPanel Panel_Fondo = new JPanel();
		Panel_Fondo.setBackground(new Color(0, 0, 0));
		Panel_Fondo.setBounds(0, 49, 513, 293);
		frame2.getContentPane().add(Panel_Fondo);
		Panel_Fondo.setLayout(null);
		
		/*------------------------------------------------------*/
		JPanel panel = new JPanel();
		panel.setBounds(408, 0, 105, 54);
		Panel_Fondo.add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		panel.setVisible(visible);
		
		JButton Boton_Usuario = new JButton("");
		Boton_Usuario.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

	    		if(visible) {
	    			panel.setVisible(false);
	    			visible=false;
	    		}else {
	    			panel.setVisible(true);
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
		
		ImageIcon logo = new ImageIcon("img/logout.png");
        Image logo1 = logo.getImage();
        Image scaledlogo = logo1.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage = new ImageIcon(scaledlogo);
        
        ImageIcon logo2 = new ImageIcon("img/engranaje.png");
        Image logoOut2 = logo2.getImage();
        Image scaledlogo2 = logoOut2.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledlogoImage2 = new ImageIcon(scaledlogo2);
		
		JButton btnNewButton_1 = new JButton("Administrar");
		btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		InsertarUsuarios insertarUsuarios = new InsertarUsuarios();
	    		String nombreApellido = insertarUsuarios.obtenerNombreApellido_id(id_u); 
	    		
	    		panel.setVisible(visible);
	    		visible=false;

	    		PanelUsuario.main(id_u);
	    		frame2.setVisible(false);
	    	}
	    });
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setIcon(scaledlogoImage2);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		InsertarUsuarios insertarUsuarios = new InsertarUsuarios();
	    		String nombreApellido = insertarUsuarios.obtenerNombreApellido_id(id_u); 
	    		
	    		JOptionPane.showMessageDialog(null, "Muchas gracias " + nombreApellido + "!!");
	    		
	    		panel.setVisible(visible);
	    		visible=false;

	    		Principal.main(null);
	    		frame2.setVisible(false);
	    	}
	    });
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setIcon(scaledlogoImage);
		btnNewButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.add(btnNewButton);
		
		/*----------------------------------------------------------*/
		
		JLabel Label_Fondo = new JLabel();
		Label_Fondo.setHorizontalAlignment(SwingConstants.CENTER);
		Label_Fondo.setBounds(0, 0, 513, 300);
		Label_Fondo.setOpaque(true);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Fondo2.png"));
		Label_Fondo.setIcon(img4);
		Panel_Fondo.add(Label_Fondo);
		
		
		JLabel Label_LogoMax = new JLabel("New label");
		Label_LogoMax.setBounds(136, 40, 240, 72);
		Label_LogoMax.setOpaque(true);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/LogoGrande.png"));
		Label_LogoMax.setIcon(img2);
		Label_Fondo.add(Label_LogoMax);
		
		JButton Boton_Explorar = new JButton("Encontra el auto que queres");
		Boton_Explorar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame2.setVisible(false);
				
				Pagina3.main(id_u);
			}
		});
		Boton_Explorar.setBackground(new Color(255, 255, 255));
		Boton_Explorar.setForeground(new Color(0, 0, 0));
		Label_Fondo.add(Boton_Explorar);
		Boton_Explorar .setFont(new Font("Tahoma", Font.PLAIN, 10));
		Boton_Explorar .setBounds(180, 120, 170, 23); 
	
			JLabel lblNewLabel = new JLabel("Merlo Molina Rolon Salgueiro");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(164, 248, 194, 19);
			lblNewLabel.setForeground(new Color(240, 248, 255));
			Label_Fondo.add(lblNewLabel);
			
			
			

        
        frame2.setVisible(true);
	
			
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(int id_u) {
		
		javax.swing.SwingUtilities.invokeLater(() -> new Pagina2(id_u));

	}
}
