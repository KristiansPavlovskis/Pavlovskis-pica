package Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Pizza implements Comparable<Pizza>{
	 int lielums;
	 String merce;
	 String perVards;
	 String Talr;
	 String adress;
	String  piedevas;
	 static String piedevas2;
	 static String piedevas3;
	//public static int lielums;
	 String setMerce,mikla;
	// int lielums;
	int setLielums;
	static int currentLielums;
	
	//perVards,Talr, adress, Talr, Talr, picLielums
	public Pizza(String perVards,String Talr,String adress, String merce, String piedevas,String piedevas2,String piedevas3,String mikla,int lielums) {
		this.merce = merce;
		this.mikla=mikla;
		this.piedevas = piedevas;
		this.piedevas2 = piedevas2;
		this.piedevas3 = piedevas3;
		this.lielums=lielums;
		this.perVards=perVards;
		this.Talr=Talr;
		this.adress=adress;
		currentLielums = lielums;
	}
//	public void Pizza1(String perVards,String Talr,int adress) {
//		this.perVards=perVards;
//		this.Talr=Talr;
//		this.adress=adress;
//	}
	public String getPiedevas() {
		return piedevas;
	}
	public String getMikla() {
		return mikla;
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
	public String setMikla(String mikla) {
		return mikla;
	}
	public static int getCurrentLielums() {
        return currentLielums;
    }
	public String setPiedevas(String piedevas) {
		return piedevas;
	}
	public static int setLielums(int lielums) {
		lielums=+lielums;
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
	static void kopums(String fNosaukums,String merce,String piedevas,String piedevas2,String Piedevas3,int lielums){
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
	
public static void izvadit(String adress,String Talr,String perVards,String merce,String piedevas,int lielums,String mikla) {
		
		 JOptionPane.showMessageDialog(null, "šī pica tiks atvesta drīz uz vārdu: "+perVards+" ar telefona nummuru: "+Talr+" Un adresi: "+adress);
		 JOptionPane.showMessageDialog(null, "Šis picas mīkla ir: "+mikla+"\nšīs picas mērce ir: "+merce+"\nšīs picas piedevas ir: "+piedevas+"\nŠīs picas lielums ir: "+lielums);
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
