
public class Persona {

	//Atributos
		String nombre;
		String apellidos;
		int edad;
		char sexo;
		Cuenta cuentaCorriente;
		static int numeroCuentas=0;
		
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

		
		
		
		public void crearCuentaCorriente(String IBAN,int numeroCuenta, double interesMensual) {
				if(numeroCuentas==1) {
					boolean creada=true;
				}else {Cuenta cuenta1=new Cuenta("",00000,0);
				cuenta1.setIban(IBAN);
				cuenta1.setNumeroCuenta(numeroCuenta);
				cuenta1.setInteresMensual(interesMensual);
				numeroCuentas++;
				
			}
					
				}
			
			
		
		public boolean sacarDinero(double dinero) {
			boolean retirado;
			if(dinero<=0) {
			 retirado=false;	
			}else {
				retirado=true;
				
			}
			
			
			
			
			return false;
			
		}
		
		public boolean ingresarDinero(double Dinero) {
			
			
			return false;
			
		}
		
		public boolean hacerTransferencia(Persona persona2,double cantidad) {
		
			
			
			return false;
			
		}
		
		public void cerrarCuenta() {
			
		}
		
	
}
