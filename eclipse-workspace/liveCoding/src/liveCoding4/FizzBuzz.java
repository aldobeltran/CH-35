//	Aldo Beltran 4/6
package liveCoding4;

public class FizzBuzz {
		
	public static void main(String[]args) {
	FizzBuzz fizzbuzz = new FizzBuzz();
	
	fizzbuzz.imprimir();
}
	
	public void imprimir() {
		for(int i = 1; i <=100; i++) {
			if(i%5 == 0 && i%3 == 0) {
				System.out.println("FizzBuzz");
			}else if(i%5 == 0){
				System.out.println("Buzz");
			}else if(i%3 == 0){
				System.out.println("Fizz"); 
		}else {
			System.out.println(i);
		}
}
}
}

