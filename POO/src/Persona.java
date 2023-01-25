
public class Persona {

	//Atributos
	String nombre;
	String apellidos;
	int edad;
	char sexo;
	
	//Metodos
	public Persona() {
		nombre = "";
		apellidos = "";
		edad = 0;
		sexo = 'f';
	}
	
	public Persona(String nombre,String apellidos,int edad,char sexo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.sexo=sexo;
	}
	

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void saludar() {
		String saludo="";
		if(sexo=='m') {
		saludo = "Hola guapa";
		
		}else {
			saludo = "Hola guapo";
		}
		
		System.out.println(saludo+" eres "+nombre+" "+apellidos+" tienes "+edad+" y eres "+sexo);
		
		}


	
	
}
