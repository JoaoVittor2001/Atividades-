package ATIVIDADE2;

import java.util.Scanner;

public class QUEST�O2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
		System.out.print("Escolha um n�mero: ");
		int numA = entrada.nextInt();

		if (numA > 0 ) {
		System.out.print("O Numero Desejado � Positivo");
			}
		else {
		if (numA < 0 ) {
		System.out.print("O Numero Desejado � Negativo");
			}
		else {
		System.out.print("O Numero Desejado � Zero");
				}
			}
		}
	}
}
		
