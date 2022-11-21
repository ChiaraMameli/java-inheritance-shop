package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
		public int getCodice() {
			return codice;
		}

	private double prezzo;	
		public double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(double prezzo) {
			if (prezzo > 0)
			  this.prezzo = prezzo;
		}
		public double getPrezzoIva() {
			double ivaArticolo = (prezzo / 100d) * iva;
			return prezzo + ivaArticolo;
		}

	private int iva;
		public int getIva() {
			return iva;
		}
		public void setIva(int iva) {
			this.iva = iva;
		}

	private String nome;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

	private String marca;
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}

	
	public Prodotto(double prezzo, int iva, String nome, String marca) {
		Random rnd = new Random();
		this.codice = rnd.nextInt(10000, 100000);
		this.prezzo = prezzo;
		this.iva = iva;
		this.nome = nome;
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome 
				+ "\nMarca: " + marca
				+ "\nCodice: " + codice
				+ "\nPrezzo: " + prezzo + "€"
				+ "\nIva: " + iva;
	}
}
