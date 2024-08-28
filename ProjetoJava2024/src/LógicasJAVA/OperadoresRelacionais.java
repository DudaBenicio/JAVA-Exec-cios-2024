package LógicasJAVA;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		System.out.println(6 > 3);
	
		int num1 = 40;
		
		System.out.println(num1 != 14); // (40 != 14) true;
		System.out.println(num1 == 14); // (40 == 14) true;
		
		System.out.println(false);//APENAS PARA MOSTRAR QUE DA PARA EXIBIR
		
		boolean arLigado = false; 
		
		// SALVAR COMPARAÇÕES LOGICAS DENTRO DE UMA VARIAVEL
		
		boolean comparacao = num1 > 2;
		System.out.println("Comparacao: " + comparacao);
		
		// CONFERIR SE PODE SER UTILIZADO COM STRING 
		String nome1 = "Joana";
		String nome2 = "joana";
	
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
		
		
	
	
	
	
	}

}
