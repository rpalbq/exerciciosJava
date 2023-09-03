package vetorsimples;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("QUANTAS PESSOAS SERÃO DIGITADAS?");
		int qntPessoas = sc.nextInt();
		
		double[] altura = new double[qntPessoas];
		String[] genero = new String[qntPessoas];
		
		for (int i = 0; i < qntPessoas; i++) {
	    	System.out.printf("Altura da %da pessoa: ", i + 1);
	        altura[i] = sc.nextDouble();
	        System.out.printf("Genero da %da pessoa: ", i + 1);
	        genero[i] = sc.next();
	    }
		
		double maiorAltura = Double.MIN_VALUE;
		double menorAltura = Double.MAX_VALUE;
		
		for(int i = 0; i < qntPessoas; i++) {
			if(altura[i]> maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		double soma = 0;
		double quantidadeM = 0;
		double quantidadeF = 0;
		
		for(int i = 0; i < genero.length; i++) {
			if(genero[i].equalsIgnoreCase("F")) {
				soma+= altura[i];
				quantidadeF += 1;
			} else {
				quantidadeM += 1;
			}
		}
		double media =  soma/quantidadeF;
		
		System.out.println("MAIOR ALTURA = "+maiorAltura);
		System.out.println("MENOR ALTURA = "+ menorAltura);
		System.out.println("MÉDIA ALTURA FEMININA = "+String.format("%.2f", media));
		System.out.println("QUANTIDADE DE HOMENS = "+(int) quantidadeM);
		
		sc.close();

	}

}
