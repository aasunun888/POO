
public class Cubo {
	
	private String material;
	private boolean asa;
	private String color;
	private int capacidadMax;
	private int capacidadActual;
	
	
	public Cubo() {
		this.material="plastico";
		this.asa=false;
		this.color="negro";
		this.capacidadMax=10;
		this.capacidadActual=0;
	}
	
	public Cubo(String material,boolean asa,String color,int capacidadMax,int capacidadActual) {
		this.material=material;
		this.asa=asa;
		this.color=color;
		this.capacidadMax=capacidadMax;
		this.capacidadActual=capacidadActual;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isAsa() {
		return asa;
	}

	public void setAsa(boolean asa) {
		this.asa = asa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	
	public void llenar(int litros) {
		int resultado = 0;
		
		if(litros>0 && litros<capacidadMax) {
			litros=this.capacidadActual;
		}else
			System.out.println("cantidad no valida");
		
	}
	
	public void vaciar (int vacio) {
		int resultado=0;
		
		if(vacio>0 && vacio<capacidadMax)
			vacio=this.capacidadActual;
		else
			System.out.println("cantidad no valida");
	
		
	}
	
	public void mostrarCubo(int capacidadActual, int capacidadMax) {
		int capLibre;
		
		capLibre=capacidadMax-capacidadActual;
		
		for(int i=capLibre;i>=capacidadActual;i--) {
			System.out.println("*"+" "+" "+" "+" "+" "+" "+" "+" "+"*");
			
			
		}
		for(int e=capacidadActual;e>0;e--) {
			System.out.println("*"+"~"+"~"+"~"+"~"+"~"+"~"+"~"+"~"+"*");
			}
		
		System.out.print("**********");
	}
	
	public void llenarCubo(){
		
	}
}
