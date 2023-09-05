package logg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Partners {
	
    private JFrame frame8;
    
    private static boolean visible=false;
    /**
     * @wbp.parser.entryPoint
     */
    public Partners(int id_u) {

        
    	JFrame frame8 = new JFrame();
    	frame8.setUndecorated(true);
    	frame8.setBounds(300, 0, 513, 610);
    	frame8.setPreferredSize(new Dimension(513,610));
    	frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame8.getContentPane().setLayout(null);
    	
    	JPanel Panel_Buscador = new JPanel();
    	Panel_Buscador.setBackground(new Color(112, 128, 144));
    	Panel_Buscador.setBounds(0, 0, 513, 49);
    	frame8.getContentPane().add(Panel_Buscador);
    	Panel_Buscador.setLayout(null);
            
     
        Color Gris = new Color(112, 128, 144);

		
		JButton Boton_Modelos = new JButton("Modelos");
		
		Boton_Modelos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PaginaPrincipal.main(id_u);
				frame8.setVisible(false);
				
			}
			
		});
		
		Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 15));  //aca
		Boton_Modelos.setBounds(379,12, 89, 23);  //aca
		Boton_Modelos.setBorderPainted(false); // aca
		Boton_Modelos.setContentAreaFilled(false); //aca
		Boton_Modelos.setFocusPainted(false); //aca
		Panel_Buscador.add(Boton_Modelos);
		
		JButton Boton_MenuBarras = new JButton("");
	    Boton_MenuBarras.setBounds(10, 11, 30, 30);
		Boton_MenuBarras.setOpaque(true);
		Boton_MenuBarras.setBorderPainted(false); //aca
		Boton_MenuBarras.setContentAreaFilled(false); //aca
		Boton_MenuBarras.setFocusPainted(false); //aca
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Menu1.png"));
		Boton_MenuBarras.setIcon(img);
		Panel_Buscador.add(Boton_MenuBarras);
		
		
		
		
		
    	JPanel Panel_Fondo = new JPanel();
    	
	//	Panel_Fondo.setBackground(new Color(0, 0, 0));
    	Panel_Fondo.setPreferredSize(new Dimension(513, 870));
		Panel_Fondo.setBounds(0, 49, 513, 293);
		frame8.getContentPane().add(Panel_Fondo);
		Panel_Fondo.setLayout(null);
	
		/*-----------------------------------------------------*/
		
		JPanel panel = new JPanel();
		panel.setBounds(408, 0, 105, 54);
		Panel_Fondo.add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		panel.setVisible(visible);
		
		JButton Boton_Usuario1 = new JButton("");
		Boton_Usuario1.addActionListener(new ActionListener() {
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
		Boton_Usuario1.setBounds(473, 11, 30, 30);
	    Boton_Usuario1.setBorderPainted(false);
	    Boton_Usuario1.setContentAreaFilled(false);
	    Boton_Usuario1.setFocusPainted(false);
	    
		ImageIcon img51 = new ImageIcon(this.getClass().getResource("/Usuario .png"));
		Boton_Usuario1.setIcon(img51);
		Panel_Buscador.add(Boton_Usuario1);
		
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
	    		frame8.setVisible(false);
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
	    		frame8.setVisible(false);
	    	}
	    });
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setIcon(scaledlogoImage);
		btnNewButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.add(btnNewButton);
		
		/*
		JPanel Panel_Fondo = new JPanel();
	    Panel_Fondo.setBackground(Color.WHITE);
	    Panel_Fondo.setPreferredSize(new Dimension(513, 700)); // se necesita que la altura del fondo se mayor a la del jscrollpanel, para que aparezca la barra ( es decir, para que pueda mostrar algo)
	  */      
   
		JButton Boton_LogoMini = new JButton("");
		Boton_LogoMini.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

	    		Pagina2.main(id_u);
	    		
	    		frame8.setVisible(false);
	    	}
	    });
		Boton_LogoMini.setBounds(50, 11, 86, 26);
		Boton_LogoMini.setOpaque(true);
		ImageIcon img3 = new ImageIcon("img/LogoChico.png");
		Image Scaledimg3 = img3.getImage().getScaledInstance(Boton_LogoMini.getWidth(), Boton_LogoMini.getHeight(), Image.SCALE_SMOOTH);  
		ImageIcon Scaledimg3ToIcon = new ImageIcon(Scaledimg3); 
		Boton_LogoMini.setIcon(Scaledimg3ToIcon);
		Panel_Buscador.add(Boton_LogoMini);
		
		
		 JPopupMenu menuDesplegable = new JPopupMenu();
		 JMenuItem menuItem1 = new JMenuItem("Modelos");
	        menuItem1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		PaginaPrincipal.main(id_u);
	        		frame8.setVisible(false);
	        	}
	        });
	        JMenuItem menuItem2 = new JMenuItem("Nuestros Autos");
	        menuItem2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Pagina3.main(id_u);
	        		frame8.setVisible(false);
	        	}
	        });
	        JMenuItem menuItem3 = new JMenuItem("Partners");
	        menuItem3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Partners.main(id_u);
	        		frame8.setVisible(false);
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
	    /*    
	        Container s = frame8.getContentPane();
	        JScrollBar jsbHorizontal = new JScrollBar(JScrollBar.VERTICAL);
	        s.setLayout(new FlowLayout());
	        s.add(jsbHorizontal);
	        Panel_Fondo.setSize(400, 200);
	      */  
	        
	        
	        Boton_MenuBarras.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                menuDesplegable.show(Boton_MenuBarras, 0, Boton_MenuBarras.getHeight());
	            }
	        });
		
	        ModernScrollPane modernScrollPane = new ModernScrollPane(Panel_Fondo);
	        modernScrollPane.setForeground(new Color(240, 248, 255));
	        modernScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		    modernScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		    modernScrollPane.setBounds(0, 49, 513, 565);
		   
		   
		    frame8.getContentPane().add(modernScrollPane);
//Bugati.	
		//Logo de la marca	
			JLabel bugatti_logo = new JLabel();
			bugatti_logo.setHorizontalAlignment(SwingConstants.CENTER);
			bugatti_logo.setBounds(40,28, 116, 80);
			bugatti_logo.setOpaque(false);
			
			ImageIcon img2 = new ImageIcon("IMAGEN/bugatti logo.png");
			Image scaledImage2 = img2.getImage().getScaledInstance(bugatti_logo.getWidth(),bugatti_logo.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
			bugatti_logo.setIcon(scaledIcon2);
			Panel_Fondo.add(bugatti_logo);
		
		//Nombre de la marca
			JLabel label_bugatti = new JLabel("<html>Bugatti</html>"); 
			label_bugatti.setForeground(new Color(240, 248, 255));
			label_bugatti.setFont(new Font("Serif", Font.PLAIN, 50));
			label_bugatti.setHorizontalAlignment(SwingConstants.CENTER);
			label_bugatti.setBounds(145, -3, 250, 130);
			Panel_Fondo.add(label_bugatti);
		
		//Cuadro donde va el nombre de la marca
			JLabel bugatti_texto = new JLabel();
			bugatti_texto.setHorizontalAlignment(SwingConstants.CENTER);
			bugatti_texto.setBounds(20, 5, 480, 130);
			bugatti_texto.setOpaque(false);
			ImageIcon img4 = new ImageIcon("IMAGEN/rectangulo.png");
			Image scaledImage4 = img4.getImage().getScaledInstance(bugatti_texto.getWidth(),bugatti_texto.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
			bugatti_texto.setIcon(scaledIcon4);
			Panel_Fondo.add(bugatti_texto);
				        
		//Descipcion de la marca
	    	JLabel label_desc_bugatti = new JLabel("<html>Bugatti es una marca francesa de automóviles deportivos de alta gama. Sus vehículos son famosos por su velocidad extrema y diseño aerodinámico. El Bugatti Veyron y el Chiron son algunos de los superdeportivos más rápidos del mundo.</html>"); 
			label_desc_bugatti.setForeground(new Color(240, 248, 255));
			label_desc_bugatti.setFont(new Font("Serif", Font.PLAIN, 16));
			label_desc_bugatti.setHorizontalAlignment(SwingConstants.CENTER);
			label_desc_bugatti.setBounds(50, 109, 400, 130);
			Panel_Fondo.add(label_desc_bugatti);
		
		
		//Cuadro deonde va la descripcion de la marca
			JLabel bugatti_info = new JLabel();
			bugatti_info.setHorizontalAlignment(SwingConstants.CENTER);
			bugatti_info.setBounds(20, 110, 480, 130);
			bugatti_info.setOpaque(false);
			ImageIcon img31 = new ImageIcon("IMAGEN/rectangulo.png");
			Image scaledImage3 = img31.getImage().getScaledInstance(bugatti_info.getWidth(),bugatti_info.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);
			bugatti_info.setIcon(scaledIcon3);
			Panel_Fondo.add(bugatti_info);
		
		
		
		
		
//Farrari 
		//Logo de la marca
			JLabel ferrari_logo = new JLabel();
			ferrari_logo.setHorizontalAlignment(SwingConstants.CENTER);
			ferrari_logo.setBounds(27, 237, 116, 80);
			ferrari_logo.setOpaque(false);
			ImageIcon img5 = new ImageIcon("IMAGEN/ferrari logo.png");
			Image scaledImage5 = img5.getImage().getScaledInstance(ferrari_logo.getWidth(),ferrari_logo.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);
			ferrari_logo.setIcon(scaledIcon5);
			Panel_Fondo.add(ferrari_logo);
			
		
		//Nombre de la marca
				JLabel label_marcaferrari = new JLabel("<html>Ferrari</html>"); 
				label_marcaferrari.setForeground(new Color(240, 248, 255));
				label_marcaferrari.setFont(new Font("Serif", Font.PLAIN, 50));
				label_marcaferrari.setHorizontalAlignment(SwingConstants.CENTER);
				label_marcaferrari.setBounds(145, 207, 250, 130);
				Panel_Fondo.add(label_marcaferrari);
				
		

		//Cuadron donde va el nombre de la marca
			JLabel ferrari_info = new JLabel();
			ferrari_info.setHorizontalAlignment(SwingConstants.CENTER);
			ferrari_info.setBounds(25, 215, 480, 130);
			ferrari_info.setOpaque(false);
			String nombreMarca = "Ferrari";
			ferrari_info.setText(nombreMarca);
			ImageIcon img6 = new ImageIcon("IMAGEN/rectangulo.png");
			Image scaledImage6 = img6.getImage().getScaledInstance(ferrari_info.getWidth(),ferrari_info.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);
			ferrari_info.setIcon(scaledIcon6);
			Panel_Fondo.add(ferrari_info);
			
	
		//Descripcion del la marca
			JLabel label_desc_ferrari = new JLabel("<html>Ferrari es una icónica marca italiana de automóviles deportivos y de alto rendimiento, conocida por su elegante diseño y motores potentes. Fundada en 1947, es sinónimo de velocidad y exclusividad.</html>"); 
			label_desc_ferrari.setForeground(new Color(240, 248, 255));
			label_desc_ferrari.setFont(new Font("Serif", Font.PLAIN, 16));
			label_desc_ferrari.setHorizontalAlignment(SwingConstants.CENTER);
			label_desc_ferrari.setBounds(50, 319, 400, 130);
			Panel_Fondo.add(label_desc_ferrari);
			
		//Cuadro donde va la descripcion de la marca
			JLabel ferrari_texto = new JLabel();
			ferrari_texto.setHorizontalAlignment(SwingConstants.CENTER);
			ferrari_texto.setBounds(20, 320, 480, 130);
			ferrari_texto.setOpaque(false);
			String descripcionMarca = "<html>Ferrari es una marca de automóviles deportivos de lujo y alto rendimiento.</html>";
			ferrari_texto.setText(descripcionMarca);
			ImageIcon img7 = new ImageIcon("IMAGEN/rectangulo.png");
			Image scaledImage7 = img7.getImage().getScaledInstance(ferrari_texto.getWidth(),ferrari_texto.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon7 = new ImageIcon(scaledImage7);
			ferrari_texto.setIcon(scaledIcon7);
			Panel_Fondo.add(ferrari_texto);
			
		
	
		
//porsche
		//Logo
			JLabel porsche_logo = new JLabel();
			porsche_logo.setHorizontalAlignment(SwingConstants.CENTER);
			porsche_logo.setBounds(46, 449, 100, 80);
			porsche_logo.setOpaque(false);
			ImageIcon img8 = new ImageIcon("IMAGEN/porsche logo.png");
			Image scaledImage8 = img8.getImage().getScaledInstance(porsche_logo.getWidth(),porsche_logo.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon8 = new ImageIcon(scaledImage8);
			porsche_logo.setIcon(scaledIcon8);
			Panel_Fondo.add(porsche_logo);
			
		
		//Nombre de la marca
			JLabel label_marcaPorsche = new JLabel("<html>Porsche</html>");
			label_marcaPorsche.setForeground(new Color(240, 248, 255));
			label_marcaPorsche.setFont(new Font("Serif", Font.PLAIN, 50));
			label_marcaPorsche.setHorizontalAlignment(SwingConstants.CENTER);
			label_marcaPorsche.setBounds(145, 415, 250, 130);
			Panel_Fondo.add(label_marcaPorsche);
		
		
		//Cuadro donde va el nombre de la marca
			JLabel porsche_info = new JLabel();
			porsche_info.setHorizontalAlignment(SwingConstants.CENTER);
			porsche_info.setBounds(20, 425, 480, 130);
			porsche_info.setOpaque(false);
			ImageIcon img9 = new ImageIcon("IMAGEN/rectangulo.png");
			Image scaledImage9 = img9.getImage().getScaledInstance(porsche_info.getWidth(),porsche_info.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon9 = new ImageIcon(scaledImage9);
			porsche_info.setIcon(scaledIcon9);
			Panel_Fondo.add(porsche_info);
			
		//Descripcion de la marca
			JLabel label_desc_porsche = new JLabel("<html>Porsche es una marca alemana de automóviles deportivos y de alto rendimiento. Se destaca por su enfoque en la ingeniería de precisión y la experiencia de conducción emocionante. Los modelos icónicos como el Porsche 911.</html>"); 
			label_desc_porsche.setForeground(new Color(240, 248, 255));
			label_desc_porsche.setFont(new Font("Serif", Font.PLAIN, 16));
			label_desc_porsche.setHorizontalAlignment(SwingConstants.CENTER);
			label_desc_porsche.setBounds(50, 528, 400, 130);
			Panel_Fondo.add(label_desc_porsche);
		
		//Cuadreo donde va la descriopcion de la marca
			JLabel porsche_texto = new JLabel();
			porsche_texto.setHorizontalAlignment(SwingConstants.CENTER);
			porsche_texto.setBounds(20, 530, 480, 130);
			porsche_texto.setOpaque(false);        
			ImageIcon img10 = new ImageIcon("IMAGEN/rectangulo.png");
			Image scaledImage10 = img10.getImage().getScaledInstance(porsche_texto.getWidth(),porsche_texto.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon10 = new ImageIcon(scaledImage10);
			porsche_texto.setIcon(scaledIcon10);
			Panel_Fondo.add(porsche_texto);
	
	//Rolls Royce

		
			//logo
				JLabel rolls_logo = new JLabel();
				rolls_logo.setHorizontalAlignment(SwingConstants.CENTER);
				rolls_logo.setBounds(35, 658, 116, 80);
				rolls_logo.setOpaque(false);
				ImageIcon img11 = new ImageIcon("IMAGEN/RollsRoyce logo.png");
				Image scaledImage11 = img11.getImage().getScaledInstance(rolls_logo.getWidth(),rolls_logo.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon scaledIcon11 = new ImageIcon(scaledImage11);
				rolls_logo.setIcon(scaledIcon11);
				Panel_Fondo.add(rolls_logo);
				
			//Nombre de la marca.
				JLabel label_marcarolls = new JLabel("<html>Rolls Royce</html>"); 
				label_marcarolls.setForeground(new Color(240, 248, 255));
				label_marcarolls.setFont(new Font("Serif", Font.PLAIN, 50));
				label_marcarolls.setHorizontalAlignment(SwingConstants.CENTER);
				label_marcarolls.setBounds(157, 630, 250, 130); 
				Panel_Fondo.add(label_marcarolls);
				
			
			//cuadro donde va el nombre de la maraca
				JLabel rolls_info = new JLabel();
				rolls_info.setHorizontalAlignment(SwingConstants.CENTER);
				rolls_info.setBounds(20, 635, 480, 130);
				rolls_info.setOpaque(false);
				ImageIcon img12 = new ImageIcon("IMAGEN/rectangulo.png");
				Image scaledImage12 = img12.getImage().getScaledInstance(rolls_info.getWidth(),rolls_info.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon scaledIcon12 = new ImageIcon(scaledImage12);
				rolls_info.setIcon(scaledIcon12);
				Panel_Fondo.add(rolls_info);
	    
			//Descripcion de la marca
				JLabel label_desc_rolls = new JLabel("<html>Rolls-Royce es una marca británica de automóviles de lujo de renombre mundial. Sus vehículos son famosos por su artesanía excepcional, lujo interior y un nivel excepcional de confort y silencio en la conducción.</html>"); 
				label_desc_rolls.setForeground(new Color(240, 248, 255));
				label_desc_rolls.setFont(new Font("Serif", Font.PLAIN, 16));
				label_desc_rolls.setHorizontalAlignment(SwingConstants.CENTER);
				label_desc_rolls.setBounds(50, 740, 400, 130);
				Panel_Fondo.add(label_desc_rolls);
			
			//Rectangulo donde va a ir la informacion
				JLabel rolls_texto = new JLabel();
				rolls_texto.setHorizontalAlignment(SwingConstants.CENTER);
				rolls_texto.setBounds(20, 740, 480, 130);
				rolls_texto.setOpaque(false);     
				ImageIcon img13 = new ImageIcon("IMAGEN/rectangulo.png");
				Image scaledImage13 = img13.getImage().getScaledInstance(rolls_texto.getWidth(),rolls_texto.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon scaledIcon13 = new ImageIcon(scaledImage13);
				rolls_texto.setIcon(scaledIcon13);
				Panel_Fondo.add(rolls_texto);
				
	
		
				JLabel Label_Fondo = new JLabel();
				Label_Fondo.setHorizontalAlignment(SwingConstants.CENTER);
				Label_Fondo.setBounds(0, 0, 513, 870);
				Label_Fondo.setOpaque(true);
				ImageIcon img16 = new ImageIcon("IMAGEN/FondoT.png");
				Image scaledImage16 = img16.getImage().getScaledInstance(Label_Fondo.getWidth(),Label_Fondo.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon scaledIcon16 = new ImageIcon(scaledImage16);
				Label_Fondo.setIcon(scaledIcon16);
				Panel_Fondo.add(Label_Fondo);
			
			     
		frame8 .pack();
        frame8.setVisible(true);
    }


	public static void main(int id_u) {
	
		javax.swing.SwingUtilities.invokeLater(()->new Partners(id_u));
		
		
	}
	
}
    