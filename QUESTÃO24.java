package ATIVIDADE2;

import java.util.Scanner;

public class QUEST�O24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeira Nota: ");
		int n1 = entrada.nextInt();
		System.out.print("Segunda Nota: ");
		int n2 = entrada.nextInt();
		System.out.print("Terceira Nota: ");
		int n3 = entrada.nextInt();
		float media = (float) ((n1 + n2+ n3) / 3);
		if (media == 10) {
		System.out.println("M�dia: " + media + " - Aprovado");
		}
        else if (media >=7)  {
		System.out.println("M�dia: " + media + " - M�dia alcan�ada - Aprovado");
		}
		else {
		System.out.println("M�dia: " + media + " - Reprovado");
		}
		entrada.close();
	}
}