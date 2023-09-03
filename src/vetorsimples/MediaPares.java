package vetorsimples;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos você quer no vetor?");
		int qntd = sc.nextInt();
		
		int[] vetor = new int[qntd];
		int soma = 0;
		int qntdPares = 0;
		
		for(int i = 0; i < qntd; i++) {
			System.out.println("Digite um elemento:");
			vetor[i] = sc.nextInt();
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				qntdPares += 1;
			}
		}
		
		double media = (double) soma / qntdPares;
		
		if(media > 0) {
			System.out.println("A MEDIA É DE: "+ String.format("%.1f", media));
		} else {
			System.out.println("NAO HÁ ELEMENTOS PARES");
		}
		
		
		sc.close();
	}

}
