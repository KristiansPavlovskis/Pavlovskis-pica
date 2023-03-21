package Package;

import javax.swing.JOptionPane;

public class Pizza implements Comparable<Pizza>{
	public String merce,perVards,Talr,adress;
	String piedevas,piedevas2,piedevas3;
	public int lielums;
	
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
public void izvadit(String adress,String Talr,String perVards,String merce,String piedevas,int Lielums) {
		
		 JOptionPane.showMessageDialog(null, "šī pica tiks atvesta drīz uz vārdu: "+perVards+" ar telefona nummuru: "+Talr+" Un adresi: "+adress);
		 JOptionPane.showMessageDialog(null, "+"+merce+"+"+piedevas+"+"+Lielums);
	}
@Override
public int compareTo(Pizza o) {
	// TODO Auto-generated method stub
	return 0;
}
	
	
	
	
	
	

}
