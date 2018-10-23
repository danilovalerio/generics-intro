package aplicacao;

import java.util.Scanner;

import services.ImprimirService;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ImprimirService imps = new ImprimirService(); antes do generics
		ImprimirService<String> imps = new ImprimirService<>();//com generics definimos o tipo
		
		System.out.println("Quantos itens terá na lista?");
		System.out.print(">");
		int n = sc.nextInt();
		
		
		for(int i =0; i < n; i++) {
			System.out.print((i+1)+"º >");
			//int valor = sc.nextInt();
			String valor = sc.next();
			imps.addValor(valor);
		}
		
		//System.out.println("Primeiro: "+imps.primeiro());
		imps.print();
		
		sc.close();

	}

}
