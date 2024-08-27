package JAVA2024;

import java.util.Scanner;

public class SegundoPrograma2 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
	Scanner dev = new Scanner (System.in);
			
			System.out.println ("Digite seu nome:");
			String nome = sc.nextLine();
			System.out.println("Olá" + nome);
			System.out.println ("Digite sua idade:");
			int idade = dev.nextInt();
			System.out.println("Sua idade é:" + idade) ; 
			System.out.println( "Olá, seu nome é:" + nome + "sua idade é" + idade);
			
			dev.close();
			sc.close();
			
			
			
			
			}
	}
