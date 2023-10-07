package PT4;

public class MainApp {

	public static void main(String[] args) {
		Serie serie_1 = new Serie();
		System.out.println("Serie 1 => " + serie_1.toString());
		
		Serie serie_2 = new Serie("Stranger Things", "Matt y Ross Duffer");
		System.out.println("Serie 2 => " + serie_2.toString());
		
		Serie serie_3 = new Serie("Chainsaw Man", 1, "Anime", "Tatsuki Fujimoto y Hiroshi Seko");
		System.out.println("Serie 3 => " + serie_3.toString());

	}

}
