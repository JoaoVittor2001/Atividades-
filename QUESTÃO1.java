package ATIVIDADE2;

import java.util.Scanner;

public class QUEST�O1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
		System.out.print("Informe o Primeiro Numero : ");
		int numA = entrada.nextInt();
		System.out.print("Informe o Primeiro Numero : ");
		int numB = entrada.nextInt();
			
		if (numA > numB) {
		System.out.print("O Numero Maior � "+ numA);
		}
		else {
		System.out.print("O Numero Maior � "+ numB);
			}
		}
	}
}