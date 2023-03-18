package Package;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class pica {

	public static void main(String[] args) {
		boolean uzVietas;
		String perVards,izvele;
		int Talr,adress,picLielums;
		JFrame frame = new JFrame();
		String[] darbibas = {"Pasūtīt picu","Ēst uz vietas","Nolikt klausuli"};
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(800,600);
	    frame.setLocation(200,200);

	        JLabel label = new JLabel();
	        label.setIcon(new ImageIcon("C:\\Users\\Kristians\\eclipse-workspace\\Pavlovskis_pica\\src\\Package\\pizzerija.png"));
	        JOptionPane.showMessageDialog(null,frame.getContentPane().add(label));
		do {
		izvele= (String) JOptionPane.showInputDialog(null," Picērijas veikaliņš","Info",JOptionPane.INFORMATION_MESSAGE,null,darbibas,darbibas[0]);
		
		switch(izvele) {
		case "Pasūtīt picu":
		 perVards=(String)JOptionPane.showInputDialog(null,"Ievadi savu vārdu");
		 Talr=Integer.parseInt(JOptionPane.showInputDialog(null,"Ievadi savu nummuru"));
		 adress=Integer.parseInt(JOptionPane.showInputDialog(null,"Ievadi savu nummuru"));
		 
		 
		break;
		case "Ēst uz vietas":
		
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
