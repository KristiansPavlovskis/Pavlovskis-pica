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

public class logi extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JButton Klatiene = new JButton("a");
	JButton Pasutit = new JButton("");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	logi(){

	    frame.setSize(800,800);
	    frame.setLocationRelativeTo(null);

	    ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/PicasWebsite.png"));
	    Image image = imageIcon.getImage();
	    Image scaledImage = image.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
	    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    JLabel backgroundLabel = new JLabel(scaledImageIcon);
	    panel.add(backgroundLabel, BorderLayout.CENTER);

	    Pasutit.setBounds(8,530,270,60);
	    Pasutit.addActionListener(this);
	    Pasutit.setOpaque(false);
	    Pasutit.setContentAreaFilled(false);
	    Pasutit.setBorderPainted(false);
	    frame.add(Pasutit);
	    
	    Klatiene.setBounds(430,530,270,60);
	    Klatiene.addActionListener(this);
	    Klatiene.setOpaque(false);
	    Klatiene.setContentAreaFilled(false);
	    Klatiene.setBorderPainted(false);
	    frame.add(Klatiene);
	    
	    frame.add(panel);
	    frame.setVisible(true);
	    
	}	
		@Override

		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Pasutit) {
		frame.dispose();
		pasutit PicaPasutisana = new pasutit();

		}else if(e.getSource()==Klatiene) {
			frame.dispose();
			Klatiene PicaKlatiene = new Klatiene();

			}
       
	}
		public static void main(String[] args) {
			logi checkbock = new logi();
			//File fails = new File("kopums.txt");
		      
			
		}

}
