import java.util.Scanner;

public class Data2 {
	
	//PROPRIEDADES
	int dia;
	int mes;
	int ano;
	
	boolean dataValida = true;
	
	void  digitarData(int d, int m, int a) {
		Scanner leitor = new Scanner(System.in);
		
		dia = d;
		mes = m;
		ano = a;
		
		 System.out.print("digitar o dia: ");
		 dia = leitor.nextInt();
		 System.out.print("digitar o mês: ");
		 mes = leitor.nextInt();
		 System.out.print("digitar o ano: ");
		 ano = leitor.nextInt();
		 leitor.close();
	
	
	
	
	
		if ((d >= 1 && d <= 31) && (m >= 1 && m <= 12)) {
				dia = d;
				mes = m;
				ano = a;
		} else {
			dataValida = false;
		}
	}
	
	
	//COMPORTAMENTOS
	void imprimirData() {
		
		if(dataValida = true) {
		
			System.out.printf("%02d/%02d/%d\n", dia, mes, ano);
		} else {
			System.out.println("Data Inválida ");
	}
  }
}
