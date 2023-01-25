
public class Bicicleta {
	//atributo
		private int marchaActual;
		private double rpm;
		private double velocidadActual;
		String modelo;
		
		//constructor
		public Bicicleta() {
			this.marchaActual=marchaActual;
			this.rpm=rpm;
			this.velocidadActual=0;
			this.modelo="BMX";
		}
		
		//getters u setters
		
		public int getMarchaActual() {
			return this.marchaActual;
		}
		
		public void setMarchaActual(int marcha) {
			
			if(marcha<=6 && marcha>=1) 
				this.marchaActual=marcha;
		}
		
		
		public double getRpm() {
			return rpm;
		}

		public void setRpm(double rpm) {
			this.rpm = rpm;
		}

		public double getVelocidadActual() {
			return velocidadActual;
		}

		public void setVelocidadActual(double velocidadActual) {
			this.velocidadActual = velocidadActual;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public void mostrarBici() {
			System.out.println("la marcha actual es de "+ marchaActual);
			System.out.println("el rpm actual es de "+rpm);
			System.out.println("la velocidad actual es de "+velocidadActual);
			System.out.println("el modelo es "+modelo);
		}
		
		public void subirMarcha (int marcha) {
			if(marchaActual+marcha<=6)
			marchaActual+=marcha;
		}
}
