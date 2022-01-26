import java.util.Scanner;

public class PrimerApp {

	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int edad = 0;
		double nota1 = 0.0;
		String nombre ="";
	
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(s.nextLine());
		System.out.println("Ingrese su nota");
		nota1 = Double.valueOf(s.nextLine());
		System.out.println("Ingrese su nombre");
		nombre = s.nextLine();
		
		System.out.println("Su edad es" + edad + "y su nota es" + nota1 + "y su nombre es" + nombre);
		
		}

}
