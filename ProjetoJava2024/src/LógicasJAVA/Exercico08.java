package LógicasJAVA;
import java.util.Scanner;
public class Exercico08 {

	public static void main(String[] args) {
		Scanner mat = new Scanner (System.in);
		
		System.out.println("Digite seu valor em reais: ");
		double reais = mat.nextDouble();
		
		System.out.println("valor em real " + reais );
				
		double dolarAmericano =  reais / 5.64;
		double dolarAmericano2 =  reais * 0.18;
		System.out.println("valor em dolar = " + dolarAmericano);
		System.out.println("valor em dolar = " + dolarAmericano2);

	
	
	
	}

}
