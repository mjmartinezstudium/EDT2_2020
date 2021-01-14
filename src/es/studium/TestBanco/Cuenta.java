package es.studium.TestBanco;

public class Cuenta
{

	//Declaro Atributos. 
	private int codigoCuenta;
	private int saldoCuenta;
	private Cliente cliente;

	//Introduzco Constructores 
	//Constructor por defecto o vac�o 
	public Cuenta()
	{
		codigoCuenta = 0;
		saldoCuenta = 0;
		cliente= new Cliente();
	}
	//Constructor con par�metros
	public Cuenta(int codigo, int saldo, Cliente cliente)
	{
		codigoCuenta = codigo;
		saldoCuenta = saldo;
		this.cliente = cliente;
	}
	
	//M�todos Inspectores
	public int getCodigoCuenta()
	{
		return codigoCuenta;
	}
	public void setCodigoCuenta(int cod)
	{
		codigoCuenta = cod;
	}
	public int getSaldoCuenta()
	{
		return saldoCuenta;
	}
	public void setSaldoCuenta (int saldo)
	{
		saldoCuenta = saldo;
	}
	public Cliente getCliente()
	{
		return cliente;
	}
	public void setCliente(Cliente cliente)
	{
		cliente = cliente;
	}
}

