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

public class Piedevas1 extends JFrame implements ActionListener{
	private ButtonGroup checkBoxGroup;
	JButton next= new JButton("iet maksāt");
	JFrame frame = new JFrame();
	JButton ietTalak = new JButton("Turpināt");
	JButton Pasutit = new JButton("");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	
	private Pizza persona;
	 private String perVards, Talr, adress,mikla;
	 String merce;
	private String piedevas;
	private String piedevas2;
	private String piedevas3;
	 private  int lielums;
	private  double cena,cena1;
	  
	Piedevas1(int lielums,double cena){
		this.lielums=lielums;
		this.cena=cena;
		 cena1=cena1+cena;
		processEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	    frame.setSize(800,800);
	    frame.setLocationRelativeTo(null);

	    ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/Merces.png"));
	    Image image = imageIcon.getImage();
	    Image scaledImage = image.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
	    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    JLabel backgroundLabel = new JLabel(scaledImageIcon);
	    panel.add(backgroundLabel, BorderLayout.CENTER);

	    JCheckBox checkbox1 = new JCheckBox("");   
	    JCheckBox checkbox2 = new JCheckBox("");
	    JCheckBox checkbox3 = new JCheckBox("");
	    JCheckBox checkbox4 = new JCheckBox("");
	    JCheckBox checkbox5 = new JCheckBox("");   
	    JCheckBox checkbox6 = new JCheckBox("");
	    JCheckBox checkbox7 = new JCheckBox("");
	    JCheckBox checkbox8 = new JCheckBox("");
	    JCheckBox checkbox9 = new JCheckBox("");
	    checkbox1.setBounds(25,225, 150,140); 
	    checkbox1.addActionListener(this);
	    checkbox1.setOpaque(false);
	    checkbox1.setContentAreaFilled(false);
	    
	    
	    checkbox2.setBounds(25,420, 150,140); 
	    checkbox2.addActionListener(this);
	    checkbox2.setOpaque(false);
	    checkbox2.setContentAreaFilled(false);
	    
	    checkbox3.setBounds(25,628, 150,140); 
	    checkbox3.addActionListener(this);
	    checkbox3.setOpaque(false);
	    checkbox3.setContentAreaFilled(false);
	    
	    
	    checkbox4.setBounds(280,225, 150,140); 
	    checkbox4.addActionListener(this);
	    checkbox4.setOpaque(false);
	    checkbox4.setContentAreaFilled(false);
	    
	    checkbox5.setBounds(280,420, 150,140); 
	    checkbox5.addActionListener(this);
	    checkbox5.setOpaque(false);
	    checkbox5.setContentAreaFilled(false);
	    
	    checkbox6.setBounds(280,628, 150,140); 
	    checkbox6.addActionListener(this);
	    checkbox6.setOpaque(false);
	    checkbox6.setContentAreaFilled(false);
	    
	    checkbox7.setBounds(550,225, 150,140); 
	    checkbox7.addActionListener(this);
	    checkbox7.setOpaque(false);
	    checkbox7.setContentAreaFilled(false);
	    
	    checkbox8.setBounds(550,420, 150,140); 
	    checkbox8.addActionListener(this);
	    checkbox8.setOpaque(false);
	    checkbox8.setContentAreaFilled(false);
	    
	    checkbox9.setBounds(550,628, 150,140); 
	    checkbox9.addActionListener(this);
	    checkbox9.setOpaque(false);
	    checkbox9.setContentAreaFilled(false);
	    
	    
	    checkBoxGroup = new ButtonGroup();
	      //add CheckBoxes to ButtonGroup
	    
	      checkBoxGroup.add(checkbox1);
	      checkBoxGroup.add(checkbox2);
	      checkBoxGroup.add(checkbox3);
	      checkBoxGroup.add(checkbox4);
	      checkBoxGroup.add(checkbox5);
	      checkBoxGroup.add(checkbox6);
	      checkBoxGroup.add(checkbox7);
	      checkBoxGroup.add(checkbox8);
	      checkBoxGroup.add(checkbox9);
	      
	    frame.add(checkbox1);frame.add(checkbox2);frame.add(checkbox3);frame.add(checkbox4);
	    frame.add(checkbox5);frame.add(checkbox6);frame.add(checkbox7);frame.add(checkbox8);frame.add(checkbox9);
	    checkbox1.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	              merce="Majonēze ar papriku";   
	              cena1=0.80;
	          }    
	       });  
	    checkbox2.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  merce="Karija majonēze";
	        	  cena1=0.80;
	          }    
	       });
	    checkbox3.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  merce="Saldskābā mērce";   
	        	  cena1=0.80;
	          }    
	       });
	    checkbox4.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  merce="Majonēze ar gurķiem";  
	        	  cena1=0.80;
	          }    
	       }); 
	    checkbox5.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	              merce="Ķiploku majonēze";   
	              cena1=0.80;
	          }    
	       });  
	    checkbox6.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  merce="Kečups";
	        	  cena1=0.40;
	          }    
	       });
	    checkbox7.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  merce="Čili majonēze";   
	        	  cena1=0.80;
	          }    
	       });
	    checkbox8.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  merce="Barbekjū mērce";  
	        	  cena1=0.80;
	          }    
	       }); 
	    checkbox9.addItemListener(new ItemListener() {    
	          public void itemStateChanged(ItemEvent e) {                 
	        	  merce="Vieglā mājas salātu mērce";  
	        	  cena1=0.80;
	          }    
	       }); 
	    ietTalak.setBounds(250,100,250,30);
	    ietTalak.addActionListener(this);
	    frame.add(ietTalak);
	    
	    frame.add(panel);
	    frame.setVisible(true);
	   // cena=cena+cena1;
		//
	    persona = new Pizza(perVards, Talr, adress, merce, piedevas,mikla,lielums,cena);
		
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
			        	cena=cena+cena1;
			            
			        	frame.dispose();
			            
			        	persona = new Pizza(perVards, Talr, adress, merce, piedevas,mikla,lielums,cena);  
				       
			           // Pizza.izvadit(perVards, Talr, adress, merce, piedevas, lielums);
			            Merces1 PiedevasUNmerce = new Merces1(lielums, merce,cena);
			        } else {
			            JOptionPane.showMessageDialog(frame, "Lūdzu izvēlies kādu picas mērci!");
			        }
			    }
       
	}
		public static void main(String args[])  
	    {  
			
//	       Pizza s = new Pizza(null, null, null, merce, null, null, null,lielums);  
//	        s.setMerce(merce);  
	        //Piedevas PiedevasUNmerces = new Piedevas(lielums,cena);
	    }  
		

}
