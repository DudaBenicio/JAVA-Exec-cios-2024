package LogicasJAVa06;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		// NOTAS PARCIAIS
	 
		Scanner luc = new Scanner (System.in);
		System.out.println("Digite sua nota do Primeiro Bimestre: ");
		float primeiroBi = luc.nextFloat();
		
		System.out.println("Digite sua nota do Segundo Bimestre: ");
		float segundoBi = luc.nextFloat();
		
		System.out.println("Digite sua nota do Terceiro Bimestre: ");
		float terceiroBi = luc.nextFloat();
		
		System.out.println("Digite sua nota do Quarto Bimestre: ");
		float quartoBi = luc.nextFloat();
		
		float soma = (primeiroBi + segundoBi + terceiroBi + quartoBi);
		float media = (soma / 4 );
		System.out.println(" Media alcancada: " + media);
		
		if (media < 4) {
			System.out.println("Reprovado");
		} else if (media < 6) {
			// SE TIRAR O "ELSE" ELE VAI VERIFICAR DUAS VEZES E VAI FICAR "REPROVADO" E "RECUPERAÇÃO" //
		System.out.println("Recuperação");
		} else { 
		System.out.println("Aprovado");
		}
	}
		}
}
