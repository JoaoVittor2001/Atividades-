package ATIVIDADE2;

import java.util.Scanner;

public class QUEST�O6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma numero : ");
		int numI= entrada.nextInt();
				if ((numI % 2) == 0) {
			System.out.println ("O numero digitado � par");
		}
		else{
			System.out.println("O numero digitado � impar");
		}
		entrada.close();
	}
}
