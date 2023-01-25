import java.util.Random;

public class Piratagochi {
	
	//atributos
	private String nombre;
	private int energia;
	private boolean estaHambriento;
	private int nivelFelicidad;
	
	public Piratagochi(String nombre) {
		this.nombre = nombre;
		
		energia = (int) (Math.random()*10+1);
		
		Random random =new Random();
		estaHambriento = random.nextBoolean();
		
		nivelFelicidad = (int) (Math.random()*10+1);
		}
	
	public void comer() {
		if(estaHambriento=true) {
			estaHambriento=false;
			
		}else {
			nivelFelicidad--;
		}
	}
	
	}


