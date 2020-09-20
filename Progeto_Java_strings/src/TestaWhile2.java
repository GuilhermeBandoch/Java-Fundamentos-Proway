
public class TestaWhile2 {
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		while (contador <=10) {
			 
			 total = total + contador;
			 
			 /*
			  * qual será o resultado aqui?
			  * para que isso de certo é necessario
			  * fazer a inicializaçã exterma pois
			  * sempre que entrar no laço cria uma nova variavel
			  */
			 System.out.println(total);
			 
			 contador++;
		}
		
		System.out.println("Resultado da soma de 1- 10" + total);
	}

}
