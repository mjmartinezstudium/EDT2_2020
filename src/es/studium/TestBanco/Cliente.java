package es.studium.TestBanco;

public class Cliente
{
	
	//Declaro Atributos. 
	private String codigoCliente;
	private String nombre;
	private String direccionCliente;

	//Introduzco Constructores 
	//Constructor por defecto o vac�o 
	public Cliente()
	{
		codigoCliente = "";
		nombre = nombre;
		direccionCliente= "";
	}
	//Constructor con par�metros
	public Cliente(String cod, String nombre, String direccion)
	{
		codigoCliente = cod;
		nombre = nombre;
		direccionCliente = direccion;
	}
	//M�todos Inspectores
	public String getCodigoCliente()
	{
		return codigoCliente;
	}
	public void setCodigoCentro(String cod)
	{
		codigoCliente = cod;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		nombre = nombre;
	}
	public String getDireccionCliente()
	{
		return direccionCliente;
	}
	public void setDireccionCliente(String direccion)
	{
		direccionCliente = direccion;
	}
}
