
public class TestaWhile {
	
	public static void main (String[] args) {
		
		int incremento = 0;
		System.out.println("Crescente");
		while (incremento <= 10) {
			System.out.println("Contador -> " + incremento);
			//contador = contador + 1;
			//contador += 1;
			incremento++;
		}
		
		//System.out.println("Valor final do contador " + contador);
		
		System.out.println("Decrescente");
		
		int decremento= 2;
		
		while(decremento >= 0) {
			System.out.println("Contador -> " + decremento);
			decremento--;
		}
	}

}
