package hilos;

public class Prueba1 extends Thread {
	
	public String numeroDepedido;
	
	
	public Prueba1(String numeroDepedido) {
		this.numeroDepedido = numeroDepedido;
		
	}
	
	public void run(){
		System.out.println("Pedido " + numeroDepedido);
	}

	/*
	@Override
	public void run(){
		
		for (int b = 0; b<=5; b++) {
			System.out.println("Prueba 1");
		}
		
	}
	*/
}


