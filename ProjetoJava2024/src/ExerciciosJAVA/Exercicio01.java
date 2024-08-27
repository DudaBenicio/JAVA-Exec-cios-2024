package ExerciciosJAVA;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		System.out.println("ano do meu nascimento");
int ano;
ano = 2005;
System.out.println(ano);
Scanner dev = new Scanner (System.in);
System.out.println("digite sua idade, por favor:");
int idade = dev.nextInt();

System.out.printf("Olá, sua idade é:" + idade + "anos");
 

dev.close();


	}

}
