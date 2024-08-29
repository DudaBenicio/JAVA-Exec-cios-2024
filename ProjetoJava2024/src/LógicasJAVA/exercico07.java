package LógicasJAVA;

import java.util.Scanner;

public class exercico07 {
	 
	public static void main(String[] args) {
		Scanner pagamento = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto a ser pago?: ");
		String produto = pagamento.nextLine();
		
		System.out.println("Valor pago pelo produto: ");
		String pago = pagamento.nextLine();
		
		// CONVERTER VALORES
		Float produtostr = Float.parseFloat(produto);
		Float pagostr = Float.parseFloat(pago);
		
		float troco = produtostr - pagostr; 
		System.out.println("Quantidade de troco a ser recebida " + troco);
		
		
		
	}

	}