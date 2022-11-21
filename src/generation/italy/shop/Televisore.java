package generation.italy.shop;

public class Televisore extends Prodotto {
	private int dimensioni;
	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	boolean smart;	
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	public Televisore(double prezzo, int iva, String nome, String marca, int dimensioni, boolean smart) {
		super(prezzo, iva, nome, marca);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		
		return super.toString() 
				+ "\nDimensioni: " + dimensioni
				+ "\nSmart: " + smart;
	}
}
