
public class Perro {

	static int numeroDePerrosCreados=0;
	
		//atributos
	private String raza;
	private String color;
	private String nombre;
	private int edad;
	private boolean hambre;
	private boolean cansancio;
	
	
	public Perro(String raza,String color,String nombre,int edad,boolean hambre,boolean cansancio


) {
		this.raza=raza;
		this.color=color;
		this.nombre=nombre;
		this.edad=edad;
		this.hambre=hambre;
		this.cansancio=cansancio;
	}
	
	public void comer() {
		hambre=true;
	
	}
	
	public void correr() {
		cansancio=true;
		hambre=true;
	}
	
	public void ladrar() {
		System.out.println(this.nombre+"GUAU GUAU");
	}
}
