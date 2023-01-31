
public class Cuenta {

	static int numeroCuentas=0;

	//atributos
	private String iban;
	private int numeroCuenta;
	private double saldo;
	private double interesMensual;
	private boolean descubierta=false;

	//metodos

	public Cuenta(String iban,int numeroCuenta, double interesMensual) {
		this.iban=iban;
		this.numeroCuenta=numeroCuenta;
		this.interesMensual=interesMensual;

		numeroCuentas++;
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
		if(saldo<=0) {
			descubierta=true;
			this.saldo=saldo;
		}else {
			this.saldo=saldo;
		}

	}

	public double InteresMensual() {
		return interesMensual;
	}

	public void setInteresMensual(double interesMensual) {
		this.interesMensual = interesMensual;
	}



	public void ingresar(double dinero) {
		if(dinero<0) {
			System.out.println("cantidad no valida");
		}else {
			System.out.println("Se ha realizado el ingreso de: "+dinero+"€");
			saldo=saldo+dinero;
		}

	}

	public boolean retirar(double dinero) {
		boolean retirar = true;

		if(saldo<=0) {
			retirar=false;

		}else {
			saldo=saldo-dinero;

		}


		return retirar;

	}

	public boolean hacerTransferenciaA (Cuenta c,double cantidad) {
		boolean transferencia= true;
		this.numeroCuenta=numeroCuenta;
		if(c.iban.equals(iban) || cantidad>saldo) {
			transferencia=false;
		
		}else {
			saldo-=cantidad;
			c.saldo+=cantidad;
		}
		return transferencia;

	}


	



public double beneficiosFuturo(int numMeses) {
	double resultado=0;
	if(numMeses<=0 || descubierta==true) {
		resultado=0;
	}else {
		resultado=numMeses*interesMensual;
	}

	return resultado;

}

public String ToString() {
	String resultado="";

	resultado="Bienvenido!, esta es tu nueva cuenta segun tus datos introducidos \n"
			+"Este es tu IBAN: "+this.iban+ "\n"
			+"Este es tu numero de cuenta: "+this.numeroCuenta+"\n"
			+"Este es tu interes Mensual: "+this.interesMensual;


	return resultado;

}
}


