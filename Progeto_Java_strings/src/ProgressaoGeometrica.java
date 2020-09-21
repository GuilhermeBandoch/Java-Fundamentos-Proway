
public class ProgressaoGeometrica {
	public static void main(String[] args) {
		int inicial = 1;
		int quociente = 2;
		int gn = inicial;
		int valor_Max = 32;
		
		System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n",inicial,quociente,valor_Max);
		
		while(gn <= valor_Max) {
			System.out.println(gn);
			gn*= quociente;
		}
	}

}
