package PT1;

public class MainApp {

	public static void main(String[] args) {
		Persona persona_1 = new Persona();
		System.out.println("nombre=" + persona_1.getNombre() + " edad=" + persona_1.getEdad() + " dni=" + persona_1.getDni()
		+ " sexo=" + persona_1.getSexo() + " peso=" + persona_1.getPeso() + " altura=" + persona_1.getAltura());
		
		Persona persona_2 = new Persona("Pepa", 12, 'M');
		System.out.println("nombre=" + persona_2.getNombre() + " edad=" + persona_2.getEdad() + " dni=" + persona_2.getDni()
		+ " sexo=" + persona_2.getSexo() + " peso=" + persona_2.getPeso() + " altura=" + persona_2.getAltura());
		
		Persona persona_3 = new Persona("Antonio", 70, "40136951X", 'M', 103.44, 1.79);
		System.out.println("nombre=" + persona_3.getNombre() + " edad=" + persona_3.getEdad() + " dni=" + persona_3.getDni()
		+ " sexo=" + persona_3.getSexo() + " peso=" + persona_3.getPeso() + " altura=" + persona_3.getAltura());

	}

}
