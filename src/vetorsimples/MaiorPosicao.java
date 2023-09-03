package vetorsimples;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você quer adicionar no vetor?");
		int qntNum = sc.nextInt();
		
		int[] vetorNum = new int[qntNum];
		
		for(int i = 0; i < qntNum; i++) {
			System.out.print("Digite um número: ");
			vetorNum[i] = sc.nextInt();
		}
		
		int posicao = -1;
		int maiorNum = Integer.MIN_VALUE;;
		for(int i = 0; i < vetorNum.length; i++) {
			if (vetorNum[i] > maiorNum) {
				maiorNum = vetorNum[i];
				posicao = i;
			}
		}
		
		System.out.println("MAIOR VALOR: "+maiorNum);
		System.out.println("POSIÇÃO: "+ posicao);
		
		sc.close();

	}
}
