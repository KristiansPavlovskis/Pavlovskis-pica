package Package;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class beigt extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JButton beigt = new JButton("");
	JButton Turpinat = new JButton("");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	beigt(){

	    frame.setSize(800,830);
	    frame.setLocationRelativeTo(null);

	    ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/EndScreen.png"));
	    Image image = imageIcon.getImage();
	    Image scaledImage = image.getScaledInstance(800, 785, Image.SCALE_SMOOTH);
	    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    JLabel backgroundLabel = new JLabel(scaledImageIcon);
	    panel.add(backgroundLabel, BorderLayout.CENTER);

	    Turpinat.setBounds(70,670,230,80);
	    Turpinat.addActionListener(this);
	    Turpinat.setOpaque(false);
	    Turpinat.setContentAreaFilled(false);
	    Turpinat.setBorderPainted(false);
	    frame.add(Turpinat);
	    
	    beigt.setBounds(480,670,230,70);
	    beigt.addActionListener(this);
	    beigt.setOpaque(false);
	    beigt.setContentAreaFilled(false);
	    beigt.setBorderPainted(false);
	    frame.add(beigt);
	    
	    frame.add(panel);
	    frame.setVisible(true);
	    
	}	
		@Override

		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Turpinat) {
		frame.dispose();
		logi PicaPasutisana = new logi();

		}else if(e.getSource()==beigt) {
			frame.dispose();
			

			}
       
	}
		public static void main(String[] args) {
			beigt checkbock = new beigt();
			//File fails = new File("kopums.txt");
		      
			
		}

}
