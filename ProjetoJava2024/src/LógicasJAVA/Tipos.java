package LógicasJAVA;
import java.util.Scanner; 
public class Tipos {

	public static void main(String[] args) {
		float preco = 10.99f;
		float preco2 = (float)12.90;
		System.out.println("Float 1:" + preco);
		System.out.println("Float 2:" + preco);
		
		int precoInteiro = (int) 2.5;
		System.out.println("Inteiro" + precoInteiro);
		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println(numeroX);
		System.out.println(numeroXDouble);
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("");
		System.out.println("Digite um numero:");
		int numeroInteiro = (int) scanner.nextDouble();
		
		Integer numeroInteiroClass = numeroInteiro;
		
		System.out.println(numeroInteiro);
		System.out.println(numeroInteiro);
		
		
	}
}
