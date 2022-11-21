package generation.italy.shop;

public class Cuffie extends Prodotto {
	private boolean wireless;	
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public Cuffie(double prezzo, int iva, String nome, String marca, boolean wireless) {
		super(prezzo, iva, nome, marca);
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		
		return super.toString() 
				+ "\nWireless: " + wireless;

	}
}
