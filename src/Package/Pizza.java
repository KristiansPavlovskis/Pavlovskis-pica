package Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Pizza implements Comparable<Pizza>{
	public static String merce;
	public String perVards;
	public String Talr;
	public String adress;
	static String piedevas;
	static String piedevas2;
	static String piedevas3;
	public static int lielums;
	
	//perVards,Talr, adress, Talr, Talr, picLielums
	public Pizza(String perVards,String Talr,String adress, String merce, String piedevas,String piedevas2,String piedevas3,int lielums) {
		this.merce = merce;
		this.piedevas = piedevas;
		this.piedevas2 = piedevas;
		this.piedevas3 = piedevas;
		this.lielums=lielums;
		this.perVards=perVards;
		this.Talr=Talr;
		this.adress=adress;
	}
//	public void Pizza1(String perVards,String Talr,int adress) {
//		this.perVards=perVards;
//		this.Talr=Talr;
//		this.adress=adress;
//	}
	public String getPiedevas() {
		return piedevas;
	}
	public String getPiedevas2() {
		return piedevas2;
	}
	public String getPiedevas3() {
		return piedevas3;
	}
	public int getLielums() {
		return lielums;
	}
	public String getMerce() {
		return merce;
	}
	public String getperVards() {
		return perVards;
	}
	public String getTalr() {
		return Talr;
	}
	public String getAdress() {
		return adress;
	}
	public String setPiedevas(String piedevas) {
		return piedevas;
	}
	public int setLielums(int lielums) {
		return lielums;
	}
	public String setMerce(String merce) {
		return merce;
	}
	public String setperVards(String perVards) {
		return perVards;
	}
	public String setTalr(String Talr) {
		return Talr;
	}
	public String setAdress(String adress) {
		return adress;
	}
	static void kopums(String fNosaukums){
		try{
//			File fails = new File("kopums.txt");
			FileWriter fw= new FileWriter(fNosaukums,false);
			PrintWriter pw= new PrintWriter(fw);


			pw.println("šīs picas mērce ir: "+merce+"\nšīs picas piedevas ir: "+piedevas+" + "+piedevas2+" + "+piedevas2+"\nŠīs picas lielums ir: "+lielums);
			pw.close();
			
			
			
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Radas kluda","Kluda",JOptionPane.ERROR_MESSAGE);
			}
	}
	static void Apskatit(String fNosaukums){
		try{
			String teksts,str="";
			
				FileReader fr = new FileReader(fNosaukums);
				BufferedReader br = new BufferedReader(fr);
				while((teksts=br.readLine())!=null){
					str += teksts+"\n";
				}
					br.close();
				
				JOptionPane.showMessageDialog(null, str,"Pasaka",JOptionPane.INFORMATION_MESSAGE);
				
				
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Radas kluda","Kluda",JOptionPane.ERROR_MESSAGE);
			}
	}
	
public static void izvadit(String adress,String Talr,String perVards,String merce,String piedevas,int lielums) {
		
		 JOptionPane.showMessageDialog(null, "šī pica tiks atvesta drīz uz vārdu: "+perVards+" ar telefona nummuru: "+Talr+" Un adresi: "+adress);
		 JOptionPane.showMessageDialog(null, "šīs picas mērce ir: "+merce+"\nšīs picas piedevas ir: "+piedevas+" + "+piedevas2+" + "+piedevas2+"\nŠīs picas lielums ir: "+lielums);
	}
@Override
public int compareTo(Pizza o) {
	// TODO Auto-generated method stub
	return 0;
}
public static void fill() {
	JFrame f;
    JProgressBar b;
     
     f = new JFrame("Picērija");
      JPanel p = new JPanel();
      b = new JProgressBar();
      b.setValue(0);
      b.setStringPainted(true);
      p.add(b);
      f.add(p);
      f.setSize(200, 200);
      f.setVisible(true);
        int i = 0;
        try {
            while (i <= 100) {
                // set text according to the level to which the bar is filled
                if (i > 30 && i < 70)
                    b.setString("Tika ielikta cepenē");
                else if (i > 70)
                    b.setString("Piegāde ir ceļā");
                else
                    b.setString("Tiek taisīta pica");
 
                // fill the menu bar
                b.setValue(i + 10);
 
                // delay the thread
                Thread.sleep(3000);
                i += 20;
            }
            f.setVisible(false);
        }
        catch (Exception e) {
        }
    }


	
	
}
