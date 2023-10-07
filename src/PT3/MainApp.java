package PT3;

public class MainApp {

	public static void main(String[] args) {
		Electrodomestico nevera = new Electrodomestico();
		System.out.println("Nevera: " + nevera.toString());
		
		Electrodomestico lavadora = new Electrodomestico(500.45, 40.80);
		System.out.println("Lavadora: " + lavadora.toString());
		
		Electrodomestico microondas = new Electrodomestico(180, "gRiS", 'c', 15.5);
		System.out.println("Microondas: " + microondas.toString());

	}

}
