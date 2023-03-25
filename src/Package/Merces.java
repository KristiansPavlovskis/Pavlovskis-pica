package Package;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Merces extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JButton ietTalak = new JButton("Turpināt");
	private ButtonGroup checkBoxGroup;
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JCheckBox checkbox4 = new JCheckBox();
	JCheckBox checkbox5 = new JCheckBox();
	JCheckBox checkbox6 = new JCheckBox();
	JCheckBox checkbox7 = new JCheckBox();
	JCheckBox checkbox8 = new JCheckBox();
	JCheckBox checkbox9 = new JCheckBox();
	JCheckBox checkbox10 = new JCheckBox();
	JCheckBox checkbox11 = new JCheckBox();
	static String mikla,merce,piedevas;
	static int lielums;
	Merces(int lielums, String merce){
		this.lielums=lielums;
		this.merce=merce;
		checkBoxGroup = new ButtonGroup();
	    frame.setSize(700,950);
	    frame.setLocationRelativeTo(null);
	    processEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	    ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/PizzaMenu.png"));
	    Image image = imageIcon.getImage();
	    Image scaledImage = image.getScaledInstance(700, 900, Image.SCALE_SMOOTH);
	    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    JLabel backgroundLabel = new JLabel(scaledImageIcon);
	    panel.add(backgroundLabel, BorderLayout.CENTER);

	    JCheckBox checkbox1 = new JCheckBox("");   
	    JCheckBox checkbox2 = new JCheckBox("");
	    JCheckBox checkbox3 = new JCheckBox("");																													
	    checkbox1.setBounds(65,340, 400,30); 
	    checkbox1.addActionListener(this);
	    checkbox1.setOpaque(false);
	    checkbox1.setContentAreaFilled(false);
	    checkbox1.setBorderPainted(false);
	    
	    checkbox2.setBounds(65,375, 400,30); 
	    checkbox2.addActionListener(this);
	    checkbox2.setOpaque(false);
	    checkbox2.setContentAreaFilled(false);
	    checkbox2.setBorderPainted(false);
	    
	    checkbox3.setBounds(65,410, 400,30); 
	    checkbox3.addActionListener(this);
	    checkbox3.setOpaque(false);
	    checkbox3.setContentAreaFilled(false);
	    checkbox3.setBorderPainted(false);
	 
	    
	      checkBoxGroup.add(checkbox1);
	      checkBoxGroup.add(checkbox2);
	      checkBoxGroup.add(checkbox3);
	      
	        checkbox4.setBounds(65,495, 400,30); 
		    checkbox4.addActionListener(this);
		    checkbox4.setOpaque(false);
		    checkbox4.setContentAreaFilled(false);
		    checkbox4.setBorderPainted(false);
		    
		    checkbox5.setBounds(65,530, 400,30); 
		    checkbox5.addActionListener(this);
		    checkbox5.setOpaque(false);
		    checkbox5.setContentAreaFilled(false);
		    checkbox5.setBorderPainted(false);
		    
		    checkbox6.setBounds(65,567, 400,30); 
		    checkbox6.addActionListener(this);
		    checkbox6.setOpaque(false);
		    checkbox6.setContentAreaFilled(false);
		    checkbox6.setBorderPainted(false);
		    
		    checkbox7.setBounds(65,603, 400,30); 
		    checkbox7.addActionListener(this);
		    checkbox7.setOpaque(false);
		    checkbox7.setContentAreaFilled(false);
		    checkbox7.setBorderPainted(false);
		    
		    checkbox8.setBounds(65,639, 400,30); 
		    checkbox8.addActionListener(this);
		    checkbox8.setOpaque(false);
		    checkbox8.setContentAreaFilled(false);
		    checkbox8.setBorderPainted(false);
		    
		    checkbox9.setBounds(65,675, 400,30); 
		    checkbox9.addActionListener(this);
		    checkbox9.setOpaque(false);
		    checkbox9.setContentAreaFilled(false);
		    checkbox9.setBorderPainted(false);
		    
		    checkbox10.setBounds(65,710, 400,30); 
		    checkbox10.addActionListener(this);
		    checkbox10.setOpaque(false);
		    checkbox10.setContentAreaFilled(false);
		    checkbox10.setBorderPainted(false);
		    
		    checkbox11.setBounds(65,745, 400,30); 
		    checkbox11.addActionListener(this);
		    checkbox11.setOpaque(false);
		    checkbox11.setContentAreaFilled(false);
		    checkbox11.setBorderPainted(false);
		    
		    
		    frame.add(checkbox1);frame.add(checkbox2);
		    frame.add(checkbox3);frame.add(checkbox4);
		    frame.add(checkbox5);frame.add(checkbox6);
		    frame.add(checkbox7);frame.add(checkbox8);
		    frame.add(checkbox9);frame.add(checkbox10);
		    frame.add(checkbox11);
		    checkbox1.addItemListener(new ItemListener() {    
		          public void itemStateChanged(ItemEvent e) {                 
		        	  mikla = "Plāna un kraukšķīga";
		          }    
		       });  
		    checkbox2.addItemListener(new ItemListener() {    
		          public void itemStateChanged(ItemEvent e) {                 
		        	  mikla ="Bieza";
		          }    
		       });
		    checkbox3.addItemListener(new ItemListener() {    
		          public void itemStateChanged(ItemEvent e) {                 
		        	  mikla ="Bez glutēna";
		          }    
		       });	  
		   
		   
	      ietTalak.setBounds(200,790,270,40);
		    ietTalak.addActionListener(this);

		    frame.add(ietTalak);
	      
	    frame.add(panel);
	    frame.setVisible(true);
	    
	}	
		@Override

		public void actionPerformed(ActionEvent e) {
			 if (e.getSource() == ietTalak) {
			        boolean Uzspiests = false;
			        for (Enumeration<AbstractButton> buttons = 
			   checkBoxGroup.getElements(); buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	Uzspiests = true;
			                break;
			            }
			        }
			        if (Uzspiests) {
			        	if (checkbox4.isSelected()) {
			        		piedevas += "Mozzarella siers, ";
			        		}
			        		if (checkbox5.isSelected()) {
			        		piedevas += "Parmasan siers, ";
			        		}if (checkbox6.isSelected()) {
			        			piedevas += "Sēnes, ";
			        		}
			        		if (checkbox7.isSelected()) {
			        		piedevas += "Tomāti, ";
			        		}if (checkbox8.isSelected()) {
			        			piedevas += "Sīpoli, ";
			        		}
			        		if (checkbox9.isSelected()) {
			        		piedevas += "Ananāsi, ";
			        		}if (checkbox10.isSelected()) {
			        			piedevas += "Pepperoni, ";
			        		}
			        		if (checkbox11.isSelected()) {
			        		 piedevas += "Paprika, ";
			        		}
//			        	Pizza s = new Pizza(null, null, null, null, null, null, null,lielums);  
//				        s.setLielums(lielums); 
//				     
//				        lielums= Pizza.setLielums(lielums);
//				        
//				        frame.dispose();
//				        //Piedevas piedevas = new Piedevas(lielums);
			            Pizza.izvadit(null, null, null, merce, piedevas,lielums, mikla);
			            PersonaInfo PiedevasUNmerces = new PersonaInfo(lielums,merce,mikla,piedevas);
			        } else {
JOptionPane.showMessageDialog(frame, "Lūdzu izvēlies kādu picas izmēru!");
			        }
			    }
       
	}
		public static void main(String[] args) {
			Merces checkbock123 = new Merces(lielums, merce);
			//File fails = new File("kopums.txt");
		      
			
		}

}
