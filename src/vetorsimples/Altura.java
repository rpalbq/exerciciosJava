package vetorsimples;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas?");
		int qntdPessoas = sc.nextInt();
		String[] nome = new String[qntdPessoas];
		int[] idade = new int[qntdPessoas];
		double[] altura = new double [qntdPessoas];
		
		for(int i = 0; i < qntdPessoas; i++) {
			System.out.println("Dados da "+ (i+1)+" pessoa");
			System.out.println("Nome:");
			nome[i] = sc.next();
			System.out.println("Idade:");
			idade[i] = sc.nextInt();
			System.out.println("Altura:");
			altura[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		for(int i= 0; i <altura.length ; i++) {
			soma += altura[i];
		}
		
		double alturaMedia = soma/altura.length;
		
		System.out.println("ALTURA MÉDIA:" + String.format("%.2f", alturaMedia));
		
		int qntdMenor16 = 0;
		for(int i= 0; i <idade.length ; i++) {
			if(idade[i]<16) {
				qntdMenor16 += 1;
			}
	}
		
		double porcentagem =  (qntdMenor16/(double)qntdPessoas) * 100;
		System.out.println("Pessoas com menos de 16 anos:" + porcentagem+"%");
		
		for(int i= 0; i < qntdPessoas; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}
}
