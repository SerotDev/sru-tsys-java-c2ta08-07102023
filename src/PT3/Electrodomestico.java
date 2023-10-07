package PT3;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class Electrodomestico {
	protected final String COLORES[] = {"blanco", "negro", "rojo", "azul", "gris"};
	protected final double PRECIO_DEFAULT = 100;
	protected final String COLOR_DEFAULT = COLORES[0];
	protected final char CONSUMO_DEFAULT = 'F';
	protected final double PESO_DEFAULT = 5;
	
	protected double precio;
	protected String color;
	protected char consumo;
	protected double peso;
	
	public Electrodomestico() {
		this.precio = PRECIO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
		this.peso = peso;
	}
	
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		this.color = validarColor(color);
		this.consumo = validarConsumo(String.valueOf(consumo).toUpperCase().charAt(0));
		this.peso = peso;
	}
	
	//si no existe el color se devuelve el color por defecto
	public String validarColor(String color) {
		boolean coincidencia = false;
		for (int i = 0; i < COLORES.length; i++) {
			if (COLORES[i].equals(color.toLowerCase())) {
				coincidencia = true;
			}
		}
		if (!coincidencia) {
			color = COLOR_DEFAULT;
		}
		return color.toLowerCase();
	}
	
	//si no existe el consumo se devuelve el valor de consumo por defecto
	public char validarConsumo(char consumo) {
		//65='A' a 70='F' del valor ASCII
		if (consumo < 'A' || consumo > 'F') {
			consumo = CONSUMO_DEFAULT;
		}
		return consumo;
	}

	@Override
	public String toString() {
		return "precio:" + precio + " color:" + color + " consumo:" + consumo + " peso:" + peso;
	}
	
	
	
}
