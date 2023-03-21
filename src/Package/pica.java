package Package;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class pica {

	public static void main(String[] args) {
		String gatavs;
		String perVards = null,izvele,merce = null,gatavasPicas;
		String Talr="",adress = null;
		int picLielums = 0;
		String piedevas = null,piedevas2 = null,piedevas3 = null;
		JFrame frame = new JFrame();
		String[] darbibas = {"Pasūtīt picu","Ēst uz vietas","Nolikt klausuli"};
		String[] gatavie = {"grieķu","Gamberetto","Četru gadalaiku","ferara","Mafija"};
		Pizza persona=null;
		
	        JLabel label = new JLabel();
	        label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\pizzerija.png"));
	        JOptionPane.showMessageDialog(null,frame.getContentPane().add(label));
		do {
		izvele= (String) JOptionPane.showInputDialog(null," Picērijas veikaliņš","Info",JOptionPane.INFORMATION_MESSAGE,null,darbibas,darbibas[0]);

		switch(izvele) {
		case "Pasūtīt picu":

		 label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\vards.jfif"));
	       perVards= JOptionPane.showInputDialog(null,label,"Ievadi savu vārdu",JOptionPane.INFORMATION_MESSAGE);
         
	       do{
				 label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\phone.jfif"));
			       Talr= JOptionPane.showInputDialog(null,label,"Ievadi savu Telefona nummuru",JOptionPane.INFORMATION_MESSAGE);
			     
			}while(!Pattern.matches("^[2]{1}[0-9]{7}$",Talr));

		 label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\address.jfif"));
	       adress= (String)JOptionPane.showInputDialog(null,label,"Ievadi savu adresi",JOptionPane.INFORMATION_MESSAGE);
	       
	       
	       gatavs=(String)JOptionPane.showInputDialog("Vai tu pats vēlies uzstaisīt savu picu?");
	     
	       if(gatavs=="ne"|| gatavs=="nē") {
	    	  gatavasPicas=(String) JOptionPane.showInputDialog(null,"Gatavās picas","Info",JOptionPane.INFORMATION_MESSAGE,null,gatavie,gatavie[0]);
	       }else {
	    	   label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\merces.jpg"));
	    	   merce=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādu mērci likt uz picu",JOptionPane.INFORMATION_MESSAGE);
	    	   
	    	   
	    	   label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\piedevas.jpg"));
	    	   piedevas=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādas piedeva likt uz picu",JOptionPane.INFORMATION_MESSAGE);
	    	   
	    	   label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\piedevas.jpg"));
	    	   piedevas2=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādas piedeva likt uz picu",JOptionPane.INFORMATION_MESSAGE);

	    	   label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\piedevas.jpg"));
	    	   piedevas3=(String)JOptionPane.showInputDialog(null,label,"Izvēlies kādas piedeva likt uz picu",JOptionPane.INFORMATION_MESSAGE);

	    	  
	    	   label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\pizza.jfif"));
	    	   picLielums=Integer.parseInt(JOptionPane.showInputDialog(null,label,"Ievadi cik lielu picu tu vēlies",JOptionPane.INFORMATION_MESSAGE));

	       }
	       
		 
	       persona = new Pizza(perVards,Talr, adress,merce, piedevas, piedevas2, piedevas3, picLielums);
		
			
			
		break;
		case "Ēst uz vietas":
			persona.izvadit(adress, Talr, perVards, merce, piedevas, picLielums);	
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
