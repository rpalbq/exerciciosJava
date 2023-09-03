package vetorsimples;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("QUANTAS PESSOAS VOCÊ QUER CADASTRAR?");
		int qntPessoas = sc.nextInt();
		String[] nomes = new String[qntPessoas];
		int[] idades = new int[qntPessoas];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("INSIRA O NOME DA PESSOA:");
			nomes[i] = sc.next();
			System.out.println("INSIRA A IDADE:");
			idades[i] = sc.nextInt();
		}
		
		int maiorIdade = Integer.MIN_VALUE;
		String pessoaMVelha = "";
		for( int i = 0; i < idades.length; i++ ) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				pessoaMVelha = nomes[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: "+ pessoaMVelha);
		
		sc.close();
		
		
	}

}
