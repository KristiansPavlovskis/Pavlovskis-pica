package Package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ceptuve extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JButton Piegade = new JButton("");
	JButton uzVietas = new JButton("");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	 JTextArea lieta;
	 static int lielums;
	    static String merce;

	    static String piedevas;

	    static String mikla;
	    static String adress;
		static String Talr;
		static String perVards;
	Ceptuve(int lielums, String merce, String mikla, String piedevas,String adress,String Talr,String perVards){
		 this.lielums = lielums;
	        this.merce = merce;
	        this.mikla = mikla;
	        this.piedevas=piedevas;
	        this.lielums = lielums;
	        this.merce = merce;
	        this.mikla = mikla;
	        this.piedevas=piedevas;

		
	    frame.setSize(800,800);
	    frame.setLocationRelativeTo(null);

	    ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/Piegade.png"));
	    Image image = imageIcon.getImage();
	    Image scaledImage = image.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
	    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    JLabel backgroundLabel = new JLabel(scaledImageIcon);
	    panel.add(backgroundLabel, BorderLayout.CENTER);

	    uzVietas.setBounds(26,453,350,80);
	    uzVietas.addActionListener(this);
	    uzVietas.setOpaque(false);
	    uzVietas.setContentAreaFilled(false);
	    uzVietas.setBorderPainted(false);
	     frame.add(uzVietas);
	    
	     Piegade.setBounds(390,453,365,80);
	     Piegade.addActionListener(this);
	     Piegade.setOpaque(false);
	     Piegade.setContentAreaFilled(false);
	     Piegade.setBorderPainted(false);
	    frame.add(Piegade);

        frame.add(label);
	    frame.add(panel);
	    frame.setVisible(true);
	    
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}	
		@Override

		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==uzVietas) {
		frame.dispose();
		
		Gaidisana PicaPasutisanas = new Gaidisana(lielums, merce, mikla, piedevas, adress, Talr, perVards);

		}else if(e.getSource()==Piegade) {
			frame.dispose();

			Gaidisana1 PicaPasutisana = new Gaidisana1(lielums, merce, mikla, piedevas, adress, Talr, perVards);

			//Klatiene PicaKlatiene = new Klatiene();

			}
       
	}
		public static void main(String[] args) {
			Ceptuve checkbock = new Ceptuve(lielums, merce, mikla, piedevas, adress, Talr, perVards);
			//File fails = new File("kopums.txt");
		      
			
		}

}
