package LogicasJAVa06;

public class CondicionaisAula06 {

	public static void main(String[] args) {
		
		
		
   // ESTRUTURA CONDICIONAL SIMPLES //
		//UTILIZANDO IF MENOR QUE = FALSE//
	 /*
		float nota = 7;
		// A PERGUNTA: 7 É MENOR QUE 6? FALSO//
		 if (nota < 6) {
		System.out.println("Sua nota e: " + nota);
		
		 }
		 System.out.println("FIM");
		 // EXIBE APENAS O FIM //
		*/
		
		 // ESTRUTURA CONDICIONAL SIMPLES //
		//UTILIZANDO IF MEIOR QUE = VERDADEIRO//
		/*
		 float nota2 = 7;
			// A PERGUNTA: 7 É MAIOR QUE 6? VEDADEIRO//
			 if (nota > 6) {
			System.out.println("Sua nota e: " + nota2);
			
			 }
			 System.out.println("FIM");
			 // EXIBE A NOTA 7 E O FIM //
		*/  
	
		/*
		
		//CONDICIONAL COMPOSTA//
			 float notaFinal = 5;
			 if (notaFinal < 6) {
				 System.out.println("Reprovado");
			 } else {
				 System.out.println("Aprovado");
			 }
			 System.out.println("FIM");
			*/ 
			 
			 // EXTRUTURA CONDICIONAL ENCADEADA //
		/*
		float notaFinal = 10;
		System.out.println("Sua nota é: " + notaFinal);
		
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else {
			System.out.println( "Verificando...");
		
			if (notaFinal < 6) {
				System.out.println("Recuperação");
			} else {
				System.out.println("Aprovado");
			}
		*/
		
		
		// ESTRUTURA CONDICIONAL COMPOSTA V2 //
		float notaFinal = 2;
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else if (notaFinal < 6) {
			// SE TIRAR O "ELSE" ELE VAI VERIFICAR DUAS VEZES E VAI FICAR "REPROVADO" E "RECUPERAÇÃO" //
		System.out.println("Recuperação");
		} else { 
		System.out.println("Aprovado");
		
		}
			 
		 
	}

}
