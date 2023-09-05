/*
 panel Buscador --> Barra horizontal gris arriba
 panel Fondo --> fondo negro debajo de la barra
 
 Botones --> se llaman igual que el texto que contienen
 Labels --> se llaman igual que la imagen que contienen, o aunque no se llamen exactamente igual hacen referencia al icono 
 
 imagePanel y imageLabel, son los que estan en el carrusel

Arrays de textos e images tambien son para el carrusel
 */
package logg;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




	public class PaginaPrincipal {

		private JFrame frame;
			
	    private JPanel imagePanel;
	    private JLabel imageLabel;
	    private JLabel Label_Auto_Parrafo1;
	    private JLabel Label_Auto_Parrafo2;
	    private JLabel Label_Auto_Parrafo3;

	    private int IndiceDeImagen = 0;
	    private int IndiceDeTexto = 0;
	    
	    private static boolean visible=false;
	  
	  
	  private String[] textos = {"El nombre 488 GTB marca el retorno a la denominación de los modelos Ferrari clásicos: el 488 indica el cubicaje unitario de cada cilindro, mientras las siglas GTB hacen referencia a Gran Turismo Berlinetta. "
			    ,"Su carrocería ha sido diseñada para aumentar la carga aerodinámica en un 50% sobre los 458 mientras que reduce la resistencia aerodinámica."
			    ,"El 488 GTB está propulsado por el nuevo motor V8 de 3902 centímetros cúbicos que entrega 670CV a 8.000 vueltas y que ofrece un par máximo de 760 Nm. Acelera de 0 a 200 km/h en 8,3 segundos."
				,"El Panamera nace como un sedán deportivo de lujo diseñado por Porsche para combinar la elegancia de un sedán con la dinámica de conducción y el estilo deportivo característico de la marca."
			  	,"El Panamera fusiona líneas aerodinámicas con elementos de lujo y deportividad. Presenta una parrilla frontal distintiva y un perfil que equilibra el estilo de un sedán con toques deportivos."
			  	,"El porsche Panamera ofrece un rendimiento destacado con un motor V6. El mismo puede acelerar de 0 a 100 km/h en alrededor de 4 segundos, proporcionando una experiencia de conducción emocionante y ágil."
				,"El lujo puede asumir muchas personalidades, muchos formatos y muchos tamaños, pero pocos tan espléndidos como los del Rolls-Royce Phantom. La excelsa berlina inglesa es la más representativa de lo que un automóvil de lujo tiene que ser."
			  	,"El Rolls-Royce Phantom tiene una parrilla frontal única, líneas elegantes, luces distintivas, interior lujoso, comodidad, personalización y tecnología discreta para una experiencia lujosa y equilibrada."
			  	, "Es un motor de aluminio con 12 cilindros en forma de \"uve\" y doble turbocompresor,generando 571 caballos de potencia, 900 Nm de torque desde 1.700 revoluciones por minuto."
			    ,"El poderoso Bugatti Chiron es uno que tiene técnicamente la punta de lanza cuando de poder, lujo y exclusividad se habla."
			    ,"El bugatti chiron un coche muy bajo con unas ópticas LED de un aspecto más agresivo y maduro que el Veyron. Presenta unas curvas musculosas con un perfil lateral que hace recordar al Type 57 Atlantic, con formas clásicas."
			  	,"Cuenta con un impresionante motor W16 de 8 litros en posición central, con 1500 CV, que le permite hacer el 0-100 km/h en 2,5 segundos."
			 
			  	};
	  
		

	  
	    private Image[] images = {
	    	new ImageIcon("img/car1.png").getImage(),
	    	new ImageIcon("img/car2.png").getImage(),
	    	new ImageIcon("img/car3.png").getImage(),
	    	new ImageIcon("img/car4.png").getImage()
	   
	    };
	    
	    
	  
	 
		public PaginaPrincipal(int id_u) {
			Color Gris = new Color(112, 128, 144);
		

			
			frame = new JFrame();
			frame.setUndecorated(true);
			frame.setBounds(100, 100, 529, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			JPanel Panel_Buscador = new JPanel();
			Panel_Buscador.setBackground(Gris);
			Panel_Buscador.setBounds(0, 0, 513, 49);
			frame.getContentPane().add(Panel_Buscador);
			Panel_Buscador.setLayout(null);
			

			
			JButton Boton_Modelos = new JButton("Modelos");
			Boton_Modelos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					PaginaPrincipal.main(id_u);
					frame.setVisible(false);
					
				}
				
			});
			Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 15));  
			Boton_Modelos.setBounds(379,12, 89, 23);  
			Boton_Modelos.setBorderPainted(false); 
			Boton_Modelos.setContentAreaFilled(false); 
			Boton_Modelos.setFocusPainted(false); 
			Panel_Buscador.add(Boton_Modelos);
			
			
			JButton Boton_MenuBarras = new JButton("");
			Boton_MenuBarras.setBounds(10, 11, 30, 30);
			Boton_MenuBarras.setOpaque(true);
			Boton_MenuBarras.setBorderPainted(false); 
			Boton_MenuBarras.setContentAreaFilled(false); 
			Boton_MenuBarras.setFocusPainted(false); 
			ImageIcon img2 = new ImageIcon("img/Menu1.png");
			Image Scaledimg2 = img2.getImage().getScaledInstance(Boton_MenuBarras.getWidth(), Boton_MenuBarras.getHeight(), Image.SCALE_SMOOTH); 
			ImageIcon Scaledimg2ToIcon = new ImageIcon(Scaledimg2); 
			Boton_MenuBarras.setIcon(Scaledimg2ToIcon);
			Panel_Buscador.add(Boton_MenuBarras);
			
			
			JPopupMenu menuDesplegable = new JPopupMenu();
			JMenuItem menuItem1 = new JMenuItem("Modelos");
	        menuItem1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		PaginaPrincipal.main(id_u);
	        		frame.setVisible(false);
	        	}
	        });
	        JMenuItem menuItem2 = new JMenuItem("Nuestros Autos");
	        menuItem2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Pagina3.main(id_u);
	        		frame.setVisible(false);
	        	}
	        });
	        JMenuItem menuItem3 = new JMenuItem("Partners");
	        menuItem3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Partners.main(id_u);
	        		frame.setVisible(false);
	        	}
	        });
	        menuDesplegable.setBackground(Gris); 
	        menuItem1.setBackground(Gris); 
	        menuItem1.setForeground(Color.WHITE); 
	        menuItem2.setBackground(Gris); 
	        menuItem2.setForeground(Color.WHITE);
	        menuItem3.setBackground(Gris);   
	        menuItem3.setForeground(Color.WHITE); 
	        menuDesplegable.add(menuItem1);
	        menuDesplegable.add(menuItem2);
	        menuDesplegable.add(menuItem3);
	        
	        Boton_MenuBarras.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                menuDesplegable.show(Boton_MenuBarras, 0, Boton_MenuBarras.getHeight());
	            }
	        });
			
			
			
	        JButton Boton_LogoMini = new JButton("");
	    	Boton_LogoMini.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {

	        		Pagina2.main(id_u);
	        		
	        		frame.setVisible(false);
	        	}
	        });
	    	Boton_LogoMini.setBounds(50, 11, 86, 26);
	    	Boton_LogoMini.setOpaque(true);
	    	ImageIcon img3 = new ImageIcon("img/LogoChico.png");
	    	Image Scaledimg3 = img3.getImage().getScaledInstance(Boton_LogoMini.getWidth(), Boton_LogoMini.getHeight(), Image.SCALE_SMOOTH);  
	    	ImageIcon Scaledimg3ToIcon = new ImageIcon(Scaledimg3); 
	    	Boton_LogoMini.setIcon(Scaledimg3ToIcon);
	    	Panel_Buscador.add(Boton_LogoMini);
			
			
			
			JPanel Panel_Fondo = new JPanel();
			Panel_Fondo.setBackground(new Color(0, 0, 0));
			Panel_Fondo.setBounds(0, 49, 513, 500);
			frame.getContentPane().add(Panel_Fondo);
			Panel_Fondo.setLayout(null);
	         
			
			/*--------------------------------------------------*/
			
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
		    		frame.setVisible(false);
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
		    		frame.setVisible(false);
		    	}
		    });
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
			btnNewButton.setIcon(scaledlogoImage);
			btnNewButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			panel.add(btnNewButton);
		    
		    /*------------------------------------*/
			

			imagePanel = new JPanel();
	        imagePanel.setLayout(null);
	        Panel_Fondo.add(imagePanel);
	        imagePanel.setOpaque(false);
	        imagePanel.setBounds(147, 11, 202, 112);	                
	                imageLabel = new JLabel();
	                imageLabel.setBounds(0, 0, 202, 112);
	                imagePanel.add(imageLabel);
			 
	                
	        Image Imagen_AutoEscalado1 =  images[0].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
	        images[0] = Imagen_AutoEscalado1;
	        
	        Image Imagen_AutoEscalado2 =  images[1].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
	        images[1] = Imagen_AutoEscalado2;
	        
	        Image Imagen_AutoEscalado3 =  images[2].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
	        images[2] = Imagen_AutoEscalado3;
	        
	        Image Imagen_AutoEscalado4 =  images[3].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
	        images[3] = Imagen_AutoEscalado4;
	        
	         
		                
		        JButton previousButton = new JButton("");
		        previousButton.setBounds(117, 54, 31, 33);
		        previousButton.setBorderPainted(false);
		        previousButton.setContentAreaFilled(false);
		        previousButton.setFocusPainted(false);
		        Panel_Fondo.add(previousButton);
		        
		        
		                JButton nextButton = new JButton("");
		                nextButton.setBounds(349, 48, 31, 33);
		                Panel_Fondo.add(nextButton);
		               
		                nextButton.setBorderPainted(false);
		                nextButton.setContentAreaFilled(false);
		                nextButton.setFocusPainted(false);
		                
		                
		                
		                ImageIcon img4 = new ImageIcon("img/FlechaI.png");
		        		Image Scaledimg4 = img4.getImage().getScaledInstance(previousButton.getWidth(), previousButton.getHeight(), Image.SCALE_SMOOTH);  
		        		ImageIcon Scaledimg4ToIcon = new ImageIcon(Scaledimg4); 
		        		previousButton.setIcon(Scaledimg4ToIcon);
		        		ImageIcon img5 = new ImageIcon("img/FlechaD.png");
		     			Image Scaledimg5 = img5.getImage().getScaledInstance(nextButton.getWidth(), nextButton.getHeight(), Image.SCALE_SMOOTH);  
		     			ImageIcon Scaledimg5ToIcon = new ImageIcon(Scaledimg5); 
		     			nextButton.setIcon(Scaledimg5ToIcon);
		     		
		     		// ...
		     			JLabel Label_Autos_Titulo1 = new JLabel("CONCEPTO");
		     			Label_Autos_Titulo1.setVerticalAlignment(SwingConstants.TOP);
		     			Label_Autos_Titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		     			Label_Autos_Titulo1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		     			Label_Autos_Titulo1.setBounds(34, 149, 125, 250);
		     			Label_Autos_Titulo1.setForeground(Color.WHITE);
		     			Label_Autos_Titulo1.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
		     			Label_Autos_Titulo1.setOpaque(false); // Desactivar opacidad
		     			Label_Autos_Titulo1.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4)); // Padding
		     			Panel_Fondo.add(Label_Autos_Titulo1);

		     			// Nueva etiqueta 1
		     			Label_Auto_Parrafo1 = new JLabel("");
		     			Label_Auto_Parrafo1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		     			Label_Auto_Parrafo1.setBounds(44, 124, 125, 300); // Ajusta las coordenadas según tu diseño
		     			Label_Auto_Parrafo1.setForeground(Color.WHITE);
		     			Label_Auto_Parrafo1.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
		     			Label_Auto_Parrafo1.setOpaque(false); // Desactivar opacidad
		     			Panel_Fondo.add(Label_Auto_Parrafo1);

		     			// ...
		     			JLabel Label_Autos_Titulo2 = new JLabel("DISEÑO");	     		
		     			Label_Autos_Titulo2.setVerticalAlignment(SwingConstants.TOP);
		     			Label_Autos_Titulo2.setHorizontalAlignment(SwingConstants.CENTER);
		     			Label_Autos_Titulo2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		     			Label_Autos_Titulo2.setBounds(186, 149, 125, 250);
		     			Label_Autos_Titulo2.setForeground(Color.WHITE); // Mantener el color original
		     			Label_Autos_Titulo2.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
		     			Label_Autos_Titulo2.setOpaque(false); // Desactivar opacidad
		     			Label_Autos_Titulo2.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4)); // Padding
		     			Panel_Fondo.add(Label_Autos_Titulo2);

		     			// Nueva etiqueta 2
		     			Label_Auto_Parrafo2 = new JLabel("");
		     			Label_Auto_Parrafo2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		     			Label_Auto_Parrafo2.setBounds(196, 124, 125, 300); // Ajusta las coordenadas según tu diseño
		     			Label_Auto_Parrafo2.setForeground(Color.WHITE);
		     			Label_Auto_Parrafo2.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
		     			Label_Auto_Parrafo2.setOpaque(false); // Desactivar opacidad
		     			Panel_Fondo.add(Label_Auto_Parrafo2);

		     			// ...

		     		JLabel Label_Autos_Titulo3 = new JLabel("RENDIMIENTO"); 
		     		Label_Autos_Titulo3.setVerticalAlignment(SwingConstants.TOP);
		     		Label_Autos_Titulo3.setHorizontalAlignment(JLabel.CENTER);
		     		Label_Autos_Titulo3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		     		Label_Autos_Titulo3.setBounds(349, 149, 125, 250);
		     		Label_Autos_Titulo3.setForeground(Color.WHITE); // Mantener el color original
		     		Label_Autos_Titulo3.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
		     		Label_Autos_Titulo3.setOpaque(false); // Desactivar opacidad
		     		Label_Autos_Titulo3.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4)); // Padding
		     			Panel_Fondo.add(Label_Autos_Titulo3);
		     			
		     			
		     			

		     			// Nueva etiqueta 3
		     			Label_Auto_Parrafo3 = new JLabel("");
		     			Label_Auto_Parrafo3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		     			Label_Auto_Parrafo3.setBounds(359, 124, 125, 300); // Ajusta las coordenadas según tu diseño
		     			Label_Auto_Parrafo3.setForeground(Color.WHITE);
		     			Label_Auto_Parrafo3.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
		     			Label_Auto_Parrafo3.setOpaque(false); // Desactivar opacidad
		     			Panel_Fondo.add(Label_Auto_Parrafo3);




		                JLabel Label_FondoNegro = new JLabel("");
		                Label_FondoNegro.setBounds(0, 49, 513, 500);
		                frame.getContentPane().add(Label_FondoNegro);               
		                ImageIcon img6 = new ImageIcon("img/Fondo2.jpg");
		        		Image Scaledimg6 = img6.getImage().getScaledInstance(Label_FondoNegro.getWidth(), Label_FondoNegro.getHeight(), Image.SCALE_SMOOTH); // Convierto ese ImageIcon en Image y lo escalo
		        		ImageIcon Scaledimg6ToIcon = new ImageIcon(Scaledimg6); //Hago que esa Image escalada vuelva a ser ImageIcon          
		        		Label_FondoNegro.setIcon(Scaledimg6ToIcon);
		                Panel_Fondo.setOpaque(false);
		                
		                
		                
		                
		                nextButton.addActionListener(new ActionListener() {
		                    @Override
		                    public void actionPerformed(ActionEvent e) {
		                        nextImage();
		                    }
		                });
		        previousButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                previousImage();
		            }
		        });

		        

	        frame.setVisible(true);
		
		
		}
		

		
		 private void previousImage() {
		        if (IndiceDeImagen > 0) {
		        	IndiceDeImagen--;
		        	IndiceDeTexto= IndiceDeTexto -3;
		            
		        } else {
		        	IndiceDeImagen = images.length - 1;
		        	IndiceDeTexto= IndiceDeImagen+6;
		           
		        }
		        updateImage();
		    }

		    private void nextImage() {
		        if (IndiceDeImagen < images.length - 1) {
		        	IndiceDeImagen++;
		        	IndiceDeTexto=IndiceDeTexto + 3;
		           
		        } else {
		        	IndiceDeImagen = 0;
		        	IndiceDeTexto=0;
		        }
		        updateImage();
		    }

		    private void updateImage() {
		        imageLabel.setIcon(new ImageIcon(images[IndiceDeImagen]));
		       
		        Label_Auto_Parrafo1.setText(textos[IndiceDeTexto]);
		        Label_Auto_Parrafo1.setText("<html>" +Label_Auto_Parrafo1.getText()+"</html>");
		        Label_Auto_Parrafo2.setText(textos[IndiceDeTexto+1]);
		        Label_Auto_Parrafo2.setText("<html>" + Label_Auto_Parrafo2.getText()+"</html>");
		        Label_Auto_Parrafo3.setText(textos[IndiceDeTexto+2]);
		        Label_Auto_Parrafo3.setText("<html>" + Label_Auto_Parrafo3.getText()+"</html>");
		        

		        }

		    

		    public static void main(int id_u) {
		        EventQueue.invokeLater(new Runnable() {
		            @Override
		            public void run() {
		            	new PaginaPrincipal(id_u).updateImage();
		              
		            }
		        });
		    }
	}


   