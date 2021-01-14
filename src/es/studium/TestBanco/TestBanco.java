package es.studium.TestBanco;

public class TestBanco {
	
	public static void main(String[] args) {
		
		//Creo las instancias de "Cliente"
		/* Antonio y Beatriz se hacen clientes del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

		//Creo las instancias de "Cuenta"
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		//Mostrar por pantalla el saldo de las cuentas de los clientes
		/* Antonio y Beatriz consultan el saldo */
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldoCuenta() + " euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldoCuenta() + " euros.");

		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldoCuenta(cuentaBeatriz.getSaldoCuenta() - 50);
		cuentaAntonio.setSaldoCuenta(cuentaAntonio.getSaldoCuenta() + 50);

		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldoCuenta() + " euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldoCuenta() + " euros.");

		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cuentaAntonio.setSaldoCuenta(cuentaAntonio.getSaldoCuenta() + 100);

		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldoCuenta(cuentaBeatriz.getSaldoCuenta() - 30);

		/* Antonio transfiere 50€ a Beatriz */
		cuentaAntonio.setSaldoCuenta(cuentaAntonio.getSaldoCuenta() - 50);
		cuentaBeatriz.setSaldoCuenta(cuentaBeatriz.getSaldoCuenta() + 50);
	}
}