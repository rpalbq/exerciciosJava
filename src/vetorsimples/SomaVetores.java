package vetorsimples;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vao ter os dois vetores?");
		int qntNum = sc.nextInt();
		
		int[] vetorA = new int[qntNum];
		int[] vetorB = new int[qntNum];
		int[] vetorC = new int[qntNum];
		
		
		
		for(int i = 0; i < qntNum; i++) {
			System.out.println("Digite o valor do VETOR A: ");
			vetorA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < qntNum; i++) {
			System.out.println("Digite o valor do VETOR B: ");
			vetorB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < qntNum; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		
		sc.close();

	}

}
