package PT2;

import java.util.Iterator;

public class Password {
	private final int LONG_DEFAULT = 8;
	private int longitud;
	private String contrasena;
	
	public Password() {
		this.longitud = LONG_DEFAULT;
		this.contrasena = generarPass(longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPass(longitud);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public static String generarPass(int longitud){
		String generated_pass = "";
		for (int i = 0; i < longitud; i++) {
			char character = (char) (int) (Math.random()*(122-(48-1))+48);
			generated_pass += character;
		}
		return generated_pass;
	}
	
}
