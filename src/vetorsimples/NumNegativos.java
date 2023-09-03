package vetorsimples;

import java.util.Scanner;

public class NumNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Digite um valor, ele precisa ser maior que 0 e menor que 10");
			 num = sc.nextInt();
		} while (num <= 0 || num > 10);
		
		int[] vetornumeros = new int[num];

		for(int i = 0; i < vetornumeros.length; i++) {
			vetornumeros[i] = sc.nextInt();
		}
		
		int qntd = 0;
		for(int i = 0; i < vetornumeros.length; i++) {
			if (vetornumeros[i] < 0) {
				qntd += 1;
				System.out.println(vetornumeros[i]);
			}
		}
		
		System.out.println("O número de negativos: "+qntd);
		sc.close();
	}
}
