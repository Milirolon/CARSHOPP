package logg;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
public class Pagina3{
	
	private static boolean visible=false;
	
	public Pagina3(int id_u) {
	
	Color Gris = new Color(112, 128, 144);
	
	JFrame frame3 = new JFrame();
	frame3.setBounds(300, 100, 513, 385);
	frame3.setUndecorated(true);
	frame3.setPreferredSize(new Dimension(513,385));
	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame3.getContentPane().setLayout(null);
	
	JPanel Panel_Buscador = new JPanel();
	Panel_Buscador.setBackground(new Color(112, 128, 144));
	Panel_Buscador.setBounds(0, 0, 513, 49);
	frame3.getContentPane().add(Panel_Buscador);
	Panel_Buscador.setLayout(null);
    
    ImageIcon img5 = new ImageIcon("img/Usuario .png");
	Image img5_1 = img5.getImage();
    Image scaledimg5 = img5_1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    ImageIcon scaled5= new ImageIcon(scaledimg5);
	
	
	JButton Boton_Modelos = new JButton("Modelos");
	Boton_Modelos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			PaginaPrincipal.main(id_u);
			frame3.setVisible(false);
			
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
	
	ImageIcon img = new ImageIcon("img/Menu1.png");
	Image img_1 = img.getImage();
    Image scaledimg = img_1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    ImageIcon scaled1= new ImageIcon(scaledimg);
	
	Boton_MenuBarras.setIcon(scaled1);
	Panel_Buscador.add(Boton_MenuBarras);
	
	JButton Boton_LogoMini = new JButton("");
	Boton_LogoMini.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {

    		Pagina2.main(id_u);
    		
    		frame3.setVisible(false);
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
     		frame3.setVisible(false);
     	}
     });
     JMenuItem menuItem2 = new JMenuItem("Nuestros Autos");
     menuItem2.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		Pagina3.main(id_u);
     		frame3.setVisible(false);
     	}
     });
     JMenuItem menuItem3 = new JMenuItem("Partners");
     menuItem3.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		Partners.main(id_u);
     		frame3.setVisible(false);
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
    Panel_Fondo.setBackground(Color.WHITE);
    Panel_Fondo.setPreferredSize(new Dimension(513, 630)); // se necesita que la altura del fondo se mayor a la del jscrollpanel, para que aparezca la barra ( es decir, para que pueda mostrar algo)
        
    /*------------------------------------*/
    
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
    		frame3.setVisible(false);
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
    		frame3.setVisible(false);
    	}
    });
	btnNewButton.setBackground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
	btnNewButton.setIcon(scaledlogoImage);
	btnNewButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
	panel.add(btnNewButton);
    
    /*------------------------------------*/
    
    ImageIcon eyeIcon3 = new ImageIcon("img/Porsch.png");
    Image image3 = eyeIcon3.getImage();
    Image scaledImage3 = image3.getScaledInstance(220, 150, Image.SCALE_SMOOTH);
    ImageIcon scaledEyeIcon3 = new ImageIcon(scaledImage3);
    Panel_Fondo.setLayout(null);
	
    JLabel label_porsche = new JLabel();
    label_porsche.setHorizontalAlignment(SwingConstants.CENTER);
    label_porsche.setBounds(50, 100, 200, 100);
    label_porsche.setIcon(scaledEyeIcon3);
	Panel_Fondo.add(label_porsche);
	
	//descripcion de porsche
	JLabel label_marcaPorsche = new JLabel("<html>Sedán deportivo de lujo de Porsche</html>");
	label_marcaPorsche.setBackground(new Color(255, 255, 255));
	label_marcaPorsche.setForeground(new Color(240, 248, 255));
	label_marcaPorsche.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
	label_marcaPorsche.setBounds(60, 209, 156, 50); 
	Panel_Fondo.add(label_marcaPorsche);

	ImageIcon eyeIcon4 = new ImageIcon("img/ferrari.png");
    Image image4 = eyeIcon4.getImage();
    Image scaledImage4 = image4.getScaledInstance(190, 95, Image.SCALE_SMOOTH);
    ImageIcon scaledEyeIcon4 = new ImageIcon(scaledImage4);
	
	//Imagen del Ferrari
	JLabel label_ferrari = new JLabel();
	label_ferrari.setHorizontalAlignment(SwingConstants.CENTER);
	label_ferrari.setBounds(259, 100, 200, 100);
	label_ferrari.setIcon(scaledEyeIcon4);
	Panel_Fondo.add(label_ferrari);
	
	
	 
	//descripcion de ferrari
	JLabel label_marcaferrari = new JLabel("<html>Superdeportivo turboalimentado de Ferrari</html>"); // Agrega el nombre de la marca
	label_marcaferrari.setBackground(new Color(255, 255, 255));
	label_marcaferrari.setForeground(new Color(240, 248, 255));
	label_marcaferrari.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
	label_marcaferrari.setHorizontalAlignment(SwingConstants.CENTER);
	label_marcaferrari.setBounds(269, 209, 170, 63); // Ajusta la posición y el tamaño según tu necesidad
	Panel_Fondo.add(label_marcaferrari);
	
	
	
	JLabel blNewLabel_4 = new JLabel("TU AUTO ENTRE 4 MARCAS LIDERES");
	blNewLabel_4.setBackground(new Color(255, 255, 255));
	blNewLabel_4.setForeground(new Color(240, 248, 255));
	blNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
	blNewLabel_4.setBounds(100, 23, 500, 30);
	Panel_Fondo.add(blNewLabel_4);


	
	
	ImageIcon eyeIcon7 = new ImageIcon("img/FondoT.jpg");
    Image image7 = eyeIcon7.getImage();
    ImageIcon scaledEyeIcon7 = new ImageIcon(image7);
    
    ImageIcon eyeIcon8 = new ImageIcon("img/like.png");
    Image image8 = eyeIcon8.getImage();
    Image scaledImage8 = image8.getScaledInstance(35, 30, Image.SCALE_SMOOTH);
    ImageIcon scaledEyeIcon8 = new ImageIcon(scaledImage8);
    
    int cantidadLikes3 = InsertarUsuarios.obtenerCantidadLikes(3);
	
	JLabel labelLikes3 = new JLabel("" + cantidadLikes3);
	labelLikes3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
	labelLikes3.setForeground(new Color(255, 255, 255));
	labelLikes3.setBounds(87, 86, 100, 30);
	Panel_Fondo.add(labelLikes3);
    
    JButton btnNewButton1 = new JButton("");
    btnNewButton1.setIcon(scaledEyeIcon8);
    btnNewButton1.setBorderPainted(false);
    btnNewButton1.setContentAreaFilled(false);
    btnNewButton1.setFocusPainted(false);
    btnNewButton1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {

    		InsertarUsuarios.insertarRegistro(id_u,3);
    		
    		int cantidad = InsertarUsuarios.obtenerCantidadLikes(3);
    		
    		labelLikes3.setText(""+cantidad);
    	}
    });
	btnNewButton1.setBounds(44, 86, 50, 50);
	Panel_Fondo.add(btnNewButton1);
	
	int cantidadLikes4 = InsertarUsuarios.obtenerCantidadLikes(4);
	
	JLabel labelLikes4 = new JLabel("" + cantidadLikes4);
	labelLikes4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
	labelLikes4.setForeground(new Color(255, 255, 255));
	labelLikes4.setBounds(308, 86, 100, 30);
	Panel_Fondo.add(labelLikes4);
	
	JButton btnNewButton_11 = new JButton("");
	btnNewButton_11.setIcon(scaledEyeIcon8);
	btnNewButton_11.setFocusPainted(false);
	btnNewButton_11.setContentAreaFilled(false);
	btnNewButton_11.setBorderPainted(false);
	btnNewButton_11.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		InsertarUsuarios.insertarRegistro(id_u,4);
    		
    		int cantidad = InsertarUsuarios.obtenerCantidadLikes(4);
    		
    		labelLikes4.setText(""+cantidad);
    		
    	}
    });
	btnNewButton_11.setBounds(260, 86, 50, 50);
	Panel_Fondo.add(btnNewButton_11);
	
	
	int cantidadLikes2 = InsertarUsuarios.obtenerCantidadLikes(2);
	
	JLabel labelLikes2 = new JLabel(""+cantidadLikes2);
	labelLikes2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
	labelLikes2.setForeground(new Color(255, 255, 255));
	labelLikes2.setBounds(83, 370, 70, 23);
	Panel_Fondo.add(labelLikes2);
	
	JButton btnNewButton_4 = new JButton("");
	btnNewButton_4.setIcon(scaledEyeIcon8);
	btnNewButton_4.setFocusPainted(false);
	btnNewButton_4.setContentAreaFilled(false);
	btnNewButton_4.setBorderPainted(false);
	btnNewButton_4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		InsertarUsuarios.insertarRegistro(id_u,2);
    		
    		int cantidad = InsertarUsuarios.obtenerCantidadLikes(2);
    		
    		labelLikes2.setText(""+cantidad);
    		
    	}
    });
	btnNewButton_4.setBounds(35, 363, 50, 50);
	Panel_Fondo.add(btnNewButton_4);
	
	int cantidadLikes1 = InsertarUsuarios.obtenerCantidadLikes(1);
	
	JLabel labelLikes1 = new JLabel(""+cantidadLikes1);
	labelLikes1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
	labelLikes1.setForeground(new Color(255, 255, 255));
	labelLikes1.setBounds(308, 363, 75, 30);
	Panel_Fondo.add(labelLikes1);
    
	
	JButton btnNewButton_1_1 = new JButton("");
	btnNewButton_1_1.setIcon(scaledEyeIcon8);
	btnNewButton_1_1.setFocusPainted(false);
	btnNewButton_1_1.setContentAreaFilled(false);
	btnNewButton_1_1.setBorderPainted(false);
	btnNewButton_1_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
    		InsertarUsuarios.insertarRegistro(id_u,1);
    		
    		int cantidad = InsertarUsuarios.obtenerCantidadLikes(1);
    		
    		labelLikes1.setText(""+cantidad);
    	}
    });
	btnNewButton_1_1.setBounds(260, 363, 50, 50);
	Panel_Fondo.add(btnNewButton_1_1);
	
	
	
	
	

	//descripcion de bugatti.
	JLabel label_marcabugatti = new JLabel("<html>Hipercoche de alta velocidad y lujo de Bugatti</html>"); 
	label_marcabugatti.setBounds(50, 473, 144, 63);
	Panel_Fondo.add(label_marcabugatti);
	label_marcabugatti.setBackground(new Color(255, 255, 255));
	label_marcabugatti.setForeground(new Color(240, 248, 255));
	label_marcabugatti.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
	label_marcabugatti.setHorizontalAlignment(SwingConstants.CENTER);
	
			//descripcion de rolls
			JLabel label_marcarolls = new JLabel("<html>Sedán de ultra lujo de Rolls-Royce</html>"); 
			label_marcarolls.setBounds(267, 467, 144, 55);
			Panel_Fondo.add(label_marcarolls);
			label_marcarolls.setBackground(new Color(255, 255, 255));
			label_marcarolls.setForeground(new Color(240, 248, 255));
			label_marcarolls.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
			label_marcarolls.setHorizontalAlignment(SwingConstants.CENTER);
			
			//bugatti
			
			ImageIcon bugattiIcon = new ImageIcon("img/bugatti.png");
	        Image bugatti = bugattiIcon.getImage();
	        Image scaledbugatti = bugatti.getScaledInstance(220, 140, Image.SCALE_SMOOTH);
	        ImageIcon scaledbugattiIcon = new ImageIcon(scaledbugatti);
			
			JLabel label_bugatti = new JLabel();
			label_bugatti.setHorizontalAlignment(SwingConstants.CENTER);
			label_bugatti.setBounds(50, 341, 200, 150);
			label_bugatti.setIcon(scaledbugattiIcon);
			Panel_Fondo.add(label_bugatti);
			
			//rolls
			
			ImageIcon rollsIcon = new ImageIcon("img/rolls.png");
	        Image rolls = rollsIcon.getImage();
	        Image scaledrolls = rolls.getScaledInstance(180, 100, Image.SCALE_SMOOTH);
	        ImageIcon scaledrollsIcon = new ImageIcon(scaledrolls);
			
			JLabel label_ferrari_3 = new JLabel();
			label_ferrari_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_ferrari_3.setBounds(257, 353, 200, 150);
			label_ferrari_3.setIcon(scaledrollsIcon);
			Panel_Fondo.add(label_ferrari_3);
			
			
    
			JLabel Label_Fondo = new JLabel();
			Label_Fondo.setHorizontalAlignment(SwingConstants.CENTER);
			Label_Fondo.setBounds(0, 0, 513, 286);
			Label_Fondo.setOpaque(true);
			
			JLabel Label_Fondo_1 = new JLabel();
			Label_Fondo_1.setOpaque(true);
			Label_Fondo_1.setHorizontalAlignment(SwingConstants.CENTER);
			Label_Fondo_1.setBounds(0, 284, 513, 281);
			
			Label_Fondo_1.setIcon(scaledEyeIcon7);
			Panel_Fondo.add(Label_Fondo_1);
			
			Label_Fondo.setIcon(scaledEyeIcon7);
			Panel_Fondo.add(Label_Fondo);
   
      
    ModernScrollPane modernScrollPane = new ModernScrollPane(Panel_Fondo);
    modernScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    modernScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    modernScrollPane.setBounds(0, 49, 513, 400);
   
   
    frame3.getContentPane().add(modernScrollPane);
        
 
        
        frame3.pack();
        frame3.setVisible(true);
    }
	
	public static void main(int id_u) {
		
		javax.swing.SwingUtilities.invokeLater(() -> new Pagina3(id_u));
		
	}
}
