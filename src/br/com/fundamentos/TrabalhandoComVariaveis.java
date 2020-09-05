package src.br.com.fundamentos;

public class TrabalhandoComVariaveis {
	public static void main(String[] args) {
		int quantidade; // Declarando variavel interio
		quantidade = 10; // atribuindo o valor 10
		
		System.out.println(quantidade);
		
		quantidade = 15;
		
		System.out.println(quantidade);
		
		double numeroComVirgula = 1.3;
		
		System.out.println("Numero descimal ->" + numeroComVirgula);
		
		float numeroComVirgulaPontoFlutuante = 1.5f;
		System.out.println("Numero decimal com float ->" + numeroComVirgulaPontoFlutuante);
		
		//https://medium.com/@mauriciogeneroso/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5
		
		long numeroInteiroGrande = 25l;
		
		System.out.println("Numero interios com long ->" + numeroInteiroGrande);
	}
	
}
