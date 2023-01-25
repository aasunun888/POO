
public class Cuenta {


	//atributos
	private String iban;
	private int numeroCuenta;
	private double saldo;
	private double interesMensual;
	private boolean descubierta=false;

	//metodos

	public Cuenta(String iban,int numeroCuenta, boolean interesMensual) {


	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo<0) {
			descubierta=true;
			this.saldo=saldo;
		}else {
			this.saldo=saldo;
		}
		
	}

	public double isInteresMensual() {
		return interesMensual;
	}

	public void setInteresMensual(double interesMensual) {
		this.interesMensual = interesMensual;
	}
	
	
	
	public void ingresar(double dinero) {
		if(dinero<0) {
			System.out.println("cantidad no valida");
		}else {
			System.out.println("transaccion exitosa");
			saldo=saldo+dinero;
		}
		
	}
	
	public boolean retirar(double dinero) {
		boolean retirar = true;
		
		if(saldo<0) {
			retirar=false;
			System.out.println("no se ha podido realizar la operacion");
		}else {
			System.out.println("se ha realizado de forma correcta");
			saldo=saldo-dinero;
			
		}
		
		
		return retirar;
		
	}
	
	public boolean hacerTransferenciaA(int cuenta ,double cantidad) {
		boolean transferencia= true;
		if(cantidad>saldo) {
			transferencia=false;
			System.out.println("No se puede realizar la operacion");
		}else {
			System.out.println("transferencia realizada a la cuenta "+cuenta);
			saldo=saldo-cantidad;
		}
		
		return transferencia;
		
		
	}
	
	public double beneficiosFuturo(int numMeses) {
		double resultado=0;
		if(numMeses<0) {
			resultado=0;
		}else if(descubierta=true){
			resultado=0;
		}else {
			resultado=numMeses*interesMensual;
		}
		
		return resultado;
		
	}
	
	public String paraImprimir() {
		String resultado="";
		if()
		
		
		return resultado;
		
	}
}
