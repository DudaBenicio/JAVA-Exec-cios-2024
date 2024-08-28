package LógicasJAVA;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		
		// LOGICA E (&&) 
		// TODOS DEVEM SER VERDADEIROS PARA SER VERDADEIRO 
		// SIMULAR A VERIFICAÇÃO DE UM E-MAIL
		boolean verificarEmail = true;
		boolean verificaSenha = true;
		
		boolean logicaE = verificarEmail && verificaSenha;
		System.out.println(logicaE);
		
		
		// LOGICA OU (||)
		// TEM QUE TER PELO MENOS UMA VERDADE PARA SER VERDADEIRO 
		
		boolean logicaOU = false || false;
		System.out.println(logicaOU);
		
		
		// LOGICA OPERADOR DE NEGAÇÃO 
		boolean negacao = !false;
		System.out.println(negacao);
		
		
		
		
	
	}

}
