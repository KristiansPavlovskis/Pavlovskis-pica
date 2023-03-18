package Package;


public class Pizza{
	public String merce,toppings,perVards;
	public int lielums,Talr,adress;
	
	public Pizza(String merce, String toppings, String perVards,int lielums,int Talr,int adress) {
		this.merce = merce;
		this.toppings = toppings;
		this.lielums=lielums;
		this.perVards=perVards;
		this.Talr=Talr;
		this.adress=adress;
	}
	public String getToppings() {
		return toppings;
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
	public int getTalr() {
		return Talr;
	}
	public int getAdress() {
		return adress;
	}
	public String setToppings(String toppings) {
		return toppings;
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
	public int setTalr(int Talr) {
		return Talr;
	}
	public int setAdress(int adress) {
		return adress;
	}
	
	
	
	
	
	

}
