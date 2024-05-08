package estruturaPosCondicionada;

public class Atividade02 {

	public static void main(String[] args) {
		int i = 1;
		int som = 0,valor;

		while(i < 16) {
			System.out.println(i);

		valor = i++;
		som += valor;
		}
		System.out.println("A soma dos numeros é: " + som);
	}
}