package vetorsimples;

import java.util.Scanner;

public class AbaixodaMedia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores o vetor vai ter?");
		int qntNum = sc.nextInt();
		
		double[] vetor = new double[qntNum];
		
		double soma = 0;
		for(int i = 0; i < qntNum; i++) {
			System.out.println("Digite o número");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma/qntNum;
		
		System.out.println("A média dos elementos: "+String.format("%.3f", media));
		
		System.out.println("Elementos abaixo da média: ");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(String.format("%.1f", vetor[i]));
			}
		}
		
		sc.close();
	}

}
