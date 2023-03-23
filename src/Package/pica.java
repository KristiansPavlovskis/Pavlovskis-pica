package Package;
import java.io.File;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class pica extends JFrame{

	public static void main(String[] args) {
		String gatavs;
		String perVards = null,izvele,merce = null,gatavasPicas;
		String Talr="",adress = null;
		int picLielums = 0,vel=0;
		String piedevas = null,piedevas2 = null,piedevas3 = null;
		JFrame frame = new JFrame();
		String[] darbibas = {"Pasūtīt picu","Ēst uz vietas","Nolikt klausuli"};
		String[] gatavie = {"grieķu","Gamberetto","Četru gadalaiku","ferara","Mafija"};
		Pizza persona=null;
		
		File fails = new File("kopums.txt");
	        JLabel label = new JLabel();
	        label.setIcon(new ImageIcon(pica.class.getResource("/bildes/pizzerija.png")));
	        JOptionPane.showMessageDialog(null,frame.getContentPane().add(label));
//S:\Eclipse\darbs\Pavlovskis_pica\src\Package
		do {
		izvele= (String) JOptionPane.showInputDialog(null," Picērijas veikaliņš","Info",JOptionPane.INFORMATION_MESSAGE,null,darbibas,darbibas[0]);

		switch(izvele) {
		case "Pasūtīt picu":
			
			if(vel==0){
			vel++;
		 label.setIcon(new ImageIcon(pica.class.getResource("/bildes/vards.jfif")));
	       perVards= JOptionPane.showInputDialog(null,label,"Ievadi savu vārdu",JOptionPane.INFORMATION_MESSAGE);
         
	       do{
				 label.setIcon(new ImageIcon(pica.class.getResource("/bildes/phone.jfif")));
			       Talr= JOptionPane.showInputDialog(null,label,"Ievadi savu Telefona nummuru",JOptionPane.INFORMATION_MESSAGE);
			     
			}while(!Pattern.matches("^[2]{1}[0-9]{7}$",Talr));

		 label.setIcon(new ImageIcon(pica.class.getResource("/bildes/address.jfif")));
	       adress= (String)JOptionPane.showInputDialog(null,label,"Ievadi savu adresi",JOptionPane.INFORMATION_MESSAGE);
			}
	       
	       gatavs=(String)JOptionPane.showInputDialog("Vai tu pats vēlies uzstaisīt savu picu?");
	      
	       if(gatavs.equalsIgnoreCase("ne") || gatavs.equalsIgnoreCase("nē")) {
	    	  gatavasPicas=(String) JOptionPane.showInputDialog(null,"Gatavās picas","Info",JOptionPane.INFORMATION_MESSAGE,null,gatavie,gatavie[0]);
	       }else {
	    	   label.setIcon(new ImageIcon(pica.class.getResource("/bildes/merces.jpg")));
	    	   merce=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādu mērci likt uz picu",JOptionPane.INFORMATION_MESSAGE);
	    	   
	    	   
	    	   label.setIcon(new ImageIcon(pica.class.getResource("/bildes/piedevas.jpg")));
	    	   piedevas=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādas piedeva likt uz picu",JOptionPane.INFORMATION_MESSAGE);
	    	   
	    	   label.setIcon(new ImageIcon(pica.class.getResource("/bildes/piedevas.jpg")));
	    	   piedevas2=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādas piedeva likt uz picu",JOptionPane.INFORMATION_MESSAGE);

	    	   label.setIcon(new ImageIcon(pica.class.getResource("/bildes/piedevas.jpg")));
	    	   piedevas3=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādas piedeva likt uz picu",JOptionPane.INFORMATION_MESSAGE);

	    	  
	    	   label.setIcon(new ImageIcon(pica.class.getResource("/bildes/pizza.jfif")));
	    	   picLielums=Integer.parseInt(JOptionPane.showInputDialog(null,label,"Ievadi cik lielu picu tu vēlies",JOptionPane.INFORMATION_MESSAGE));

	       }
	       
		 
	       persona = new Pizza(perVards,Talr, adress,merce, piedevas, piedevas2, piedevas3, picLielums);
		
	       //Pizza.fill();
	       
	        
	    
			
			
		break;
		case "Ēst uz vietas":
			Pizza.kopums("kopums.txt");
			//Pizza.Apskatit("kopums.txt"); //Pagaidām vēl nevajag
			
			break;
		case "Nolikt klausuli":
			JOptionPane.showMessageDialog(null,"Klausulis tika nolikts");
			break;
		default: JOptionPane.showMessageDialog(null,"Tādas opcijas nepastāv!");
			break;
			
		
		}
		
		}while(!izvele.equalsIgnoreCase("Nolikt klausuli"));
		
		
	}

}
