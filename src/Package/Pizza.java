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
	//Atribūti
	 int lielums;
	 String merce;
	 String perVards;
	 String Talr;
	 String adress;
	 String  piedevas;
	 double cena;
	 String setMerce,mikla;
	int setLielums;
	static int currentLielums;
	
	//Konstruktors
	public Pizza(String perVards, String Talr, String adress, String merce, String piedevas, String mikla, int lielums, double cena) {
	    this.perVards = perVards;
	    this.Talr = Talr;
	    this.adress = adress;
	    this.merce = merce;
	    this.piedevas = piedevas;
	    this.mikla = mikla;
	    this.lielums = lielums;
	    this.cena = cena;
	}
//	public void Pizza1(String perVards,String Talr,int adress) {
//		this.perVards=perVards;
//		this.Talr=Talr;
//		this.adress=adress;
//	}
	public String getPiedevas() {
		return piedevas;
	}
	public double getCena() {
		return cena;
	}
	public String getMikla() {
		return mikla;
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
	public double setCena(double cena) {
		return cena;
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


	
	
}
