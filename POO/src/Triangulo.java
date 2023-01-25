
public class Triangulo {

		private double base;
		private double altura;
		
		
		public Triangulo(double base, double altura) {
			if(base<0) {
				this.base=1;
			}else {
				this.base = base;
			}
			if(altura<0) {
				this.altura=1;
			}else {
				this.altura = altura;

			}

		}


		public void setBase(double Base) {
			if(Base<0) {
			System.out.println("Numero no valido");
			}else {
				this.base = base;
			}
			
		}


		public void setAltura (double altura) {
			if (altura<0) {
				System.out.println("numero no valido");
			}else {
				this.altura = altura;
			}
		}


		public double getBase(double base) {
			return this.base = base;
		}


		public double getAltura(double altura) {
			return this.altura = altura;
		}
		
		
}
