#EXEMPLO 02

### No exemplo 02 temos as classes Data2 (onde digitada uma data) e Pessoa2( onde nele já vem armazenado o nome e o cpf do mesmo) e a classe Teste2 (onde o mesmo instancia os classes data e pessoa e retorna  o nome, doc, e a data de nasc)  



## class Data2 

​	

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
	


	
## class Pessoa

​	
	
	public class Pessoa2 {
		String nome;
		String documento;
		Data2 dataNascimento;
		
		void preencherDados(String n, String d) {
			nome = n;
			documento = d;
		}
		
		
		void imprimir() {
			System.out.printf("NOME: %s\n", nome);
			System.out.printf("DOC: %s\n", documento);
			System.out.printf("DATA NASC.: ");
			dataNascimento.imprimirData();
		}
	}
	
## class Teste

	public class Teste2 {
	
		public static void main(String[] args) {
			
			 Data2 dtNasc3 = new Data2();
					 
			 
			 dtNasc3.digitarData(0, 0, 0);
	
			 Pessoa2 joao = new Pessoa2();
		
			 joao.preencherDados("João das Neves", "123456789-01");
			 
			 joao.dataNascimento= dtNasc3;
			 
			 joao.imprimir();
		}
	}
	


##RETORNO

digitar o dia: 07
digitar o mês: 05
digitar o ano: 2022



NOME: João das Neves
DOC: 123456789-01
DATA NASC.: 07/05/2022