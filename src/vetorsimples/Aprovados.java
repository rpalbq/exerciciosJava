package vetorsimples;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("QUANTAS PESSOAS VOCÊ QUER CADASTRAR?");
		int qntPessoas = sc.nextInt();
		
		String[] nomes = new String[qntPessoas];
		double[] primeiranota= new double[qntPessoas];
		double[] segundanota= new double[qntPessoas];
		
		for(int i = 0; i < qntPessoas; i++) {
			System.out.println("DIGITE O NOME:");
			nomes[i] = sc.next();
			System.out.println("DIGITE A PRIMEIRA NOTA:");
			primeiranota[i] = sc.nextDouble();
			System.out.println("DIGITE A SEGUNDA NOTA:");
			segundanota[i] = sc.nextDouble();
		}
		
		double[] vetorResultado = new double[qntPessoas];
		
		for(int i = 0; i < vetorResultado.length; i++) {
			vetorResultado[i] = (primeiranota[i] + segundanota[i])/2;	
		}
		
		System.out.println("\nALUNOS APROVADOS:");
		for(int i = 0; i < vetorResultado.length; i++) {
			if(vetorResultado[i] >= 6) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
