package hilos;

public class Prueba2 implements Runnable {

	private String numeroDePedido;
	
	public Prueba2(String numeroDePedido) {
		this.numeroDePedido = numeroDePedido;
	}
	
	public void run(){
		System.out.println("Pedido " + numeroDePedido);
	}
	
	
	
	/*
	@Override
	public void run(){
		
		for (int b = 0; b<=5; b++) {
			System.out.println("Prueba 2");
		}
		
	}
	
	*/
}