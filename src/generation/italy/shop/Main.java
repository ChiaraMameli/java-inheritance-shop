package generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		Smartphone iphone = new Smartphone(800, 22, "iphone", "apple", 128);		
		System.out.println(iphone);
		
		System.out.println("------------");
		
		Televisore curve = new Televisore(1200, 22, "curve", "samsung", 800, true);
		System.out.println(curve);
		
		System.out.println("------------");
		
		Cuffie cuffie = new Cuffie(60, 22, "booz", "sony", true);
		System.out.println(cuffie);


	}
}
