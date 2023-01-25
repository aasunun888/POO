
public class Cuadrado {

	int lado;
	
	public Cuadrado() {
		if(lado<0) {
			this.lado=1;
		}else {
			this.lado = lado;
		}

	}
	
	public void setLado(int lado) {
		if(lado<0) {
			this.lado=1;
		}else {
			this.lado = lado;
		}
	
	}
	
	public int getLado(int lado) {
		return this.lado=lado;
		
	}
	
	public int getArea(int lado) {
		int resultado=0;
		resultado=lado*lado;
		
		return resultado;
		
	}
	
	public void printCuadrado() {
		
		for(int i=0;i<lado;i++ ) {
			System.out.println();
			for(int j=0;j<lado;j++) {
				System.out.print("*");
			}
		
		}
	}
}
