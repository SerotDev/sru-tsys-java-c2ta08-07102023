package PT2;

public class MainApp {

	public static void main(String[] args) {
		Password pass_1 = new Password();
		System.out.println("longitud:" + pass_1.getLongitud() + "  contraseña:" + pass_1.getContrasena());
		
		Password pass_2 = new Password(20);
		System.out.println("longitud:" + pass_2.getLongitud() + "  contraseña:" + pass_2.getContrasena());

	}

}
