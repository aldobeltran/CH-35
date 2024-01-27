package org.generation.banco;

/*
 * En cjero se instancia el objetos de y¿tipo CuentaBancaria y se invocan los metodos definidos
 * Aqui si se puede establecer los try catch de la excepcion que se definio en el metodo retirar
 * Los resultados se muestran en consola
 * */
public class CajeroMain {
	public static void main(String[] args) {
		CuentaBancaria cuentaBancaria = new CuentaBancaria(6989); //cuenta bancaria con su id cuenta
		//simulamos que tenemos un scanner y el cliente introduce dinero
		System.out.println("Depositando $500");
		cuentaBancaria.depositar(500);
		
		//Revisar si se actualiza el saldo
		cuentaBancaria.getSaldo();
		System.out.println("El nuevo saldo es de " + cuentaBancaria.getSaldo());
		
		//Retirando dinero
		try {
			//Simulamos nuevamente el scanner para retirar
			System.out.println("Retirando $ 300");
			cuentaBancaria.retirar(300);
			System.out.println("El nuevo saldo es de $ " + cuentaBancaria.getSaldo()); //consola 200
			
			System.out.println("Retirando $ 200");
			cuentaBancaria.retirar(200);
			System.out.println("El nuevo saldo es de $ " + cuentaBancaria.getSaldo()); //consola 0
			
			System.out.println("Retirando $ 300");
			cuentaBancaria.retirar(300);
			System.out.println("El nuevo saldo es de $ " + cuentaBancaria.getSaldo()); //output exception
			
		}catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mLo siento te faltan $ " + e.getMonto());
			e.printStackTrace(); //Metodo de excepciones que imprime el seguimiento del flujo de la excepcion
			//syso ctrl + espacio + intro
		}
	}
}
