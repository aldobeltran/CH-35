package org.generation.banco;

//En esta clase se definen los metodos que arrojan excepciones, siempre que en la clase cajero se dispone dicha e


	/*
	 * Requerimientos:
	 * 1. Trabajr bajo el paradigma POO
	 * 2. Indicar que la clase es una exception mediante herencia (extends)
	 * 3. Crear variables y metodos para instanciar objetos
	 * 4. Encapsulamiento
	 */
	public class FondosInsuficientesException extends Exception{
		
		private static final long serialVersionUID = 1L; //NO ES NECESARIO PERO ES UNA BUENA PRACTICA ASIGNARLA
		
		//Atributos
		private double monto;
		
		//constructor
		public FondosInsuficientesException(double monto) {
			this.monto = monto;
		}
		//Getter y setter

		public double getMonto() {
			return monto;
		}

		public void setMonto(double monto) {
			this.monto = monto;
		}
		
		
}
