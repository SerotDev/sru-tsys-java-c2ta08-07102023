package PT1;

public class Persona {
	private final char SEXO_DEFAULT = 'H';
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	//constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = SEXO_DEFAULT;
		this.peso = 0;
		this.altura = 0;
	}
	
	//constructor con nombre edad y sexo
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	//constructor con todos los atributos
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = SEXO_DEFAULT;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
