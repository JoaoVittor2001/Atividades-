package ATIVIDADE2;

import java.util.Scanner;

public class QUEST�O7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma numero : ");
		int numI = entrada.nextInt();
		if ((numI % 2) == 0) {
			System.out.println ("O numero digitado � par");
			System.out.println ("Numero convertido em impar" + (numI+(1)));
		}
		
		else{
			System.out.println("O n�mero digitado � impar");
			System.out.println("n�mero convertido em par � : " + (numI+(1)));
		}
		
		
		entrada.close();
	}
}