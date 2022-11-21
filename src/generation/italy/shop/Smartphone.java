package generation.italy.shop;

import java.util.Random;

public class Smartphone extends Prodotto {
	private int imei;
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}

	private int ram;	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public Smartphone(double prezzo, int iva, String nome, String marca, int ram) {
		super(prezzo, iva, nome, marca);
		Random rnd = new Random();
		this.imei = rnd.nextInt(100000000, 1000000000);
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		
		return super.toString() 
				+ "\nImei: " + imei
				+ "\nRam: " + ram;
	}
}
