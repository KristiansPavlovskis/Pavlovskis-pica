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


public class pasutit extends JFrame implements ActionListener{
	private ButtonGroup checkBoxGroup;
	JButton next= new JButton("iet maksāt");
	JFrame frame = new JFrame();
	JButton ietTalak = new JButton("Turpināt");
	JButton Pasutit = new JButton("");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	 static int lielums;
	Pizza persona;
	  String perVards, Talr, adress,merce,piedevas,piedevas2,piedevas3,mikla;
	pasutit(){
		processEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	    frame.setSize(800,800);
	    frame.setLocationRelativeTo(null);

	    ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/PicasIzmers1.png"));
	    Image image = imageIcon.getImage();
	    Image scaledImage = image.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
	    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    JLabel backgroundLabel = new JLabel(scaledImageIcon);
	    panel.add(backgroundLabel, BorderLayout.CENTER);

	    JCheckBox checkbox1 = new JCheckBox("");   
	    JCheckBox checkbox2 = new JCheckBox("");
	    JCheckBox checkbox3 = new JCheckBox("");
	    JCheckBox checkbox4 = new JCheckBox("");																														
	    checkbox1.setBounds(50,210, 270,80); 
	    checkbox1.addActionListener(this);

	    checkbox1.setOpaque(false);
	    checkbox1.setContentAreaFilled(false);
	    checkbox1.setBorderPainted(false);
	    
	    checkbox2.setBounds(50,490, 270,80); 
	    checkbox2.addActionListener(this);
	    checkbox2.setOpaque(false);
	    checkbox2.setContentAreaFilled(false);
	    checkbox2.setBorderPainted(false);
	    
	    checkbox3.setBounds(470,210, 270,80); 
	    checkbox3.addActionListener(this);
	    checkbox3.setOpaque(false);
	    checkbox3.setContentAreaFilled(false);
	    checkbox3.setBorderPainted(false);
	    
	    checkbox4.setBounds(470,490, 270,80); 
	    checkbox4.addActionListener(this);
	    checkbox4.setOpaque(false);
	    checkbox4.setContentAreaFilled(false);
	    checkbox4.setBorderPainted(false);
	    
	    checkBoxGroup = new ButtonGroup();
	      //add CheckBoxes to ButtonGroup
	    
	      checkBoxGroup.add(checkbox1);
	      checkBoxGroup.add(checkbox2);
	      checkBoxGroup.add(checkbox3);
	      checkBoxGroup.add(checkbox4);
	      
	    frame.add(checkbox1);frame.add(checkbox2);frame.add(checkbox3);frame.add(checkbox4);
	    checkbox1.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  lielums=20;    
	          }    
	       });  
	    checkbox2.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	              lielums=30;   
	          }    
	       });
	    checkbox3.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	              lielums=25;   
	          }    
	       });
	    checkbox4.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	              lielums=40;   
	              
	          }    
	       }); 
	    ietTalak.setBounds(250,650,270,60);
	    ietTalak.addActionListener(this);
	    frame.add(ietTalak);
	    
	    frame.add(panel);
	    frame.setVisible(true);
		persona = new Pizza(perVards, Talr, adress, merce, piedevas, piedevas2, piedevas3,mikla,lielums);

}
		@Override

		public void actionPerformed(ActionEvent e) {
			 if (e.getSource() == ietTalak) {
			        boolean Uzspiests = false;
			        for (Enumeration<AbstractButton> buttons = checkBoxGroup.getElements(); buttons.hasMoreElements();) {
			            AbstractButton button = buttons.nextElement();
			            if (button.isSelected()) {
			            	Uzspiests = true;
			                break;
			            }
			        }
			        if (Uzspiests) {
			        	
			        	Pizza s = new Pizza(null, null, null, null, null, null, null,null,lielums);  
//				        s.setLielums(lielums); 
//				     
//				        lielums= Pizza.setLielums(lielums);
				        
				        frame.dispose();
				        //Piedevas piedevas = new Piedevas(lielums);
			            //Pizza.izvadit(perVards, Talr, adress, merce, piedevas, lielums);
			            Piedevas PiedevasUNmerces = new Piedevas(lielums);
			        } else {
			            JOptionPane.showMessageDialog(frame, "Lūdzu izvēlies kādu picas izmēru!");
			        }
			    }
       
	}
		 public static void main(String args[])  
		    {  
			 pasutit PiedevasUNmerces = new pasutit();
//			 int lielums = Pizza.getCurrentLielums();
//		       Pizza s = new Pizza(null, null, null, null, null, null, null,lielums);  
//		        s.setLielums(lielums);  
		        
		    }  
}
