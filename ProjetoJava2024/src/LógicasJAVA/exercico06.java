package LógicasJAVA;
import java.util.Scanner;
public class exercico06 {

	public static void main(String[] args) {
		Scanner dev = new Scanner(System.in);
		Scanner inl = new Scanner(System.in);
		
		System.out.println("Qual ferramenta escolhida?: ");
		String peca1 = dev.nextLine();
		System.out.println("Quantos " + peca1 +  " você quer? ");
		float peca2 = dev.nextFloat();
		System.out.println("Você solicitou: " + peca2 + " unidades " + peca1);
		float multiplicacao1 = peca2 *10f;
		System.out.println("\nO valor de cada " + peca1 + "é 10 reias, portanto o valor da sua compra = \n" + multiplicacao1 + "reais");
		
		System.out.println("\nQual a proxima peca escolhida?: ");
		String peca3 = inl.nextLine();
		System.out.println("\nSolicitado: " + peca3);
		System.out.println("Quanto(s) " + peca3 +  " você quer? ");
		float peca4 = dev.nextFloat();
		float multiplicacao = peca4 *4;
		System.out.println("\nO valor de cada " + peca3 + " é de 5 reais, portanto o valor da sua compra é de " + multiplicacao);
		
		float somatoria = multiplicacao1 + multiplicacao;
		System.out.println("\nO valor total da sua compra: " + somatoria);
		
		
		
		
		
		

	    
		

		
	}

}
