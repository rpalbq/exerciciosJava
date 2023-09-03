package vetorsimples;

import java.util.Scanner;

public class NumPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você quer adicionar?");
		int qntNum = sc.nextInt();
		
		int[] vetorNum = new int[qntNum];
		
		for (int i = 0; i < qntNum; i++) {
			System.out.print("Digite um número: ");
			vetorNum[i] = sc.nextInt();
		}
		
		System.out.print("\nNUMEROS PARES: \n");
		
		int qntPares = 0;
		for (int i = 0; i < vetorNum.length; i++) {
			if(vetorNum[i] % 2 == 0) {
				qntPares += 1;
				System.out.print(vetorNum[i]+" ");
			}
		}
		
		System.out.print(" \n \nQUANTIDADE DE PARES: "+qntPares);
		
		sc.close();

	}

}
