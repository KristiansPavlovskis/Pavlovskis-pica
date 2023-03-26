package Package;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class check extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JButton Klatiene = new JButton("");
	JButton Pasutit = new JButton("");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JLabel area1, area2, area3,area4, area5, area6,area7,linija,ietaupijumi;
	private int lielums,maksa=0;
    private double cena;

    private String merce,piedevas,mikla,adress,Talr,perVards;
	check(int lielums, String merce, String mikla, String piedevas,String adress,String Talr,String perVards,double cena, int maksa){
		this.lielums = lielums;
        this.merce = merce;
        this.mikla = mikla;
        this.piedevas=piedevas;
        this.lielums = lielums;
        this.merce = merce;
        this.mikla = mikla;
        this.piedevas=piedevas;
        this.cena=cena;
        this.maksa=maksa;
	    frame.setSize(400,900);
	    frame.setLocationRelativeTo(null);

	    ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/check.png"));
	    Image image = imageIcon.getImage();
	    Image scaledImage = image.getScaledInstance(400, 900, Image.SCALE_SMOOTH);
	    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
	    JLabel backgroundLabel = new JLabel(scaledImageIcon);
	    panel.add(backgroundLabel, BorderLayout.CENTER);


	    area1 = new JLabel();
	    area1.setText("PICAS MĒRCE: "+merce+"                   ");
	    area1.setBounds(90, 310, 520, 70);
	   
        
        area2 = new JLabel();
        area2.setText("PICAS MĪKLA: "+mikla+"                     ");
        area2.setBounds(90, 330, 520, 70);
        
        String str;
        str= Integer.toString(lielums);
        area3 = new JLabel();
        area3.setText("PICAS LIELUMS: "+str+"cm                   ");
        area3.setBounds(90, 350, 520, 70);
        
        area4 = new JLabel();
        String piedevasText = "PICAS PIEDEVAS: " + piedevas.replaceAll("(.{30})", "$1<br>");
        area4.setText("<html>" + piedevasText + "</html>");
        area4.setBounds(90, 390, 520, 70);
        
        area5 = new JLabel();
        area5.setText("KOPĀ MAKSĀ:               "+String.format("%.1f", cena)+" EUR");
        area5.setBounds(90, 480, 520, 70);
        
        area6 = new JLabel();
        area6.setText("AR PVN:                          "+String.format("%.1f", cena*0.21)+" EUR");
        area6.setBounds(90, 500, 520, 70);
        
        area7 = new JLabel();
        area7.setText("GALĒJĀ CENA:                "+String.format("%.1f", cena*1.21)+" EUR");
        area7.setBounds(90, 520, 520, 70);
        
        linija = new JLabel();
        linija.setText("===============================");
        linija.setBounds(90, 425, 520, 70);
        
        ietaupijumi = new JLabel();
        ietaupijumi.setText("KOPĒJIE IETAUPĪJUMI = "+maksa+"EUR");
        ietaupijumi.setBounds(50, 605, 520, 70);
       // area3.setOpaque(false);
       // area3.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(ietaupijumi);
        frame.add(linija);
        frame.add(area1);
        frame.add(area2);
        frame.add(area3);
        frame.add(area4);
        frame.add(area5);
        frame.add(area6);
        frame.add(area7);
        frame.add(panel);
        frame.setVisible(true);
	    
//	    frame.add(panel);
//	    frame.setVisible(true);
	    
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
		//	check checkbock = new check(lielums, merce, mikla, piedevas, adress, Talr, perVards,cena);
			//File fails = new File("kopums.txt");
		      logi asd= new logi();
			
		}

}
