import java.util.Scanner;

public class MainPersonaBoletin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		System.out.println("Eres la primera persona, como te llamas?");
		String nombre1 = sc.nextLine();
		persona1.setNombre(nombre1);
		
		System.out.println("dime tus apellidos");
		String apellidos1 = sc.nextLine();
		persona1.setApellidos(apellidos1);
		
		System.out.println("dime tu edad");
		int edad1 = sc.nextInt();
		persona1.setEdad(edad1);
		
		System.out.println("Eres hombre o mujer?");
		char sexo1 = sc.next().charAt(0);
		persona1.setSexo(sexo1);
		
		
		System.out.println("Eres la segunda persona, como te llamas?");
		String nombre2 = sc2.nextLine();
		persona2.setNombre(nombre2);
		
		System.out.println("dime tus apellidos");
		String apellidos2 = sc2.nextLine();
		persona2.setApellidos(apellidos2);
		
		System.out.println("dime tu edad");
		int edad2 = sc2.nextInt();
		persona2.setEdad(edad2);
		
		System.out.println("Eres hombre o mujer?");
		char sexo2 = sc2.next().charAt(0);
		persona2.setSexo(sexo2);
		
		
		persona1.saludar();
		persona2.saludar();
	}

}
