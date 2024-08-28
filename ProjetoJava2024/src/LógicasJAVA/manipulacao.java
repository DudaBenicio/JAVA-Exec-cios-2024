package LógicasJAVA;

import java.util.Scanner;

public class manipulacao {

	public static void main(String[] args) {
	double salario = 1452.54;
	String salarioStr = Double.toString(salario);
	
	System.out.println(salario+salario);
	System.out.println(salarioStr+salarioStr);
	
	System.out.println("");
	String idade = "25";
	int indadeInteiro = Integer.parseInt(idade);
	
	System.out.println(indadeInteiro);
	
	//INSTANCIAR O SCANNER
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Digite o preco do produto: ");
	String preco = scanner.nextLine();
	float precoFloat = Float.parseFloat(preco);
	
	
	

	}

}
