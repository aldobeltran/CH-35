package org.generation.banco;

/*
 * En esta clase se definen los metodos para disparar las escepciones, es decir, el try catch, sin embargo aca no se ejecuta el try catch
 * Se define otros metodos como depositar dinerp, retirar objeto.
 * Requerimientos:
 * 		Trabajar con POO
 * 		Encapsular (modificadores getters y setters)
 * 		Crear variables y metodos para instanciar objetos
 * */

public class CuentaBancaria {
		//Atributos privados se hacen visibles con getters y setters que son publicos
		private double saldo;
		//Nombre del cliente rfc, etc.
		private int idCuenta;
		
		//Constructor que recibe solamente el atributo numero
		public CuentaBancaria(int idCuenta) {
			this.idCuenta = idCuenta;
		}
		
		//Metodo para depositar dineros
		public void depositar (double monto){
			saldo += monto; //saldo = saldo + monto
		}
		
		// Metodo para retirar dinero
		//Verificar si el monto a retirar es menor o igual al saldo actual
		//true Se puede retirar y calculamos cuanr¿to dinero falta para completar la operacion
		//false no se puede retirar y calculamos cuanto dinero falta para completar la operacion
		
		public void retirar (double monto) throws FondosInsuficientesException  {
			if (monto <= saldo) {
				saldo -= monto; //Esto es lo mismo que saldo = saldo - monto
			}else {
				double faltante = monto - saldo;
				//Crear la instancia de la clase FondosInsuficientesException con las palabras reservadas trhow new e y le pasamos el parametro correpondiente a la variable que dispara la excepcion
				throw new FondosInsuficientesException(faltante);//Esto nos marca error porque queremos insatanciar de manera local y no lo encuentra para ello necesitamos "heredarlo" como parte del encabezado del metodo con la palabra reservada throws y el nombre de la excepcion
			} 
		}
		
		//Getters y Setters
		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public int getIdCuenta() {
			return idCuenta;
		}

		public void setIdCuenta(int idCuenta) {
			this.idCuenta = idCuenta;
		}
		
}
