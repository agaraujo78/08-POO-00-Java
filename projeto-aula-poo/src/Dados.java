import java.util.Scanner;

public class Dados {
	Scanner leitor = new Scanner(System.in);
	
	//PROPRIEDADES
	int dia;
	int mes;
	int ano;
	String nome;
	String documento;
	
	void digitarDados(int d, int m, int a) {
	
		dia = d;
		mes = m;
		ano = a;
//		nome = n0;
//		documento = doc0;
		
		 System.out.print("digitar o dia: ");
		 d = leitor.nextInt();
		 System.out.print("digitar o mês: ");
		 m = leitor.nextInt();
		 System.out.print("digitar o ano: ");
		 a = leitor.nextInt();		 
		 System.out.print("digitar o nome: ");
//		 n0 = leitor.nextLine();		 
//		 System.out.print("digitar o documento: ");
//		 doc0 = leitor.nextLine();
		 	
		 leitor.close();
	}
}