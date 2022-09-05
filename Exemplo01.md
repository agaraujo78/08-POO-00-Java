#EXEMPLO 01

### No exemplo 01 temos as classes Data (onde aleatoreamente  é gerada uma data) e Pessoa( onde nele já vem armazenado o nome e o cpf do mesmo) e a classe Teste (onde o mesmo instancia os classes data e pessoa e retorna  o nome, doc, e a data de nasc)  



## class Data 

​	

	public class Data {
	//PROPRIEDADES
	int dia;
	int mes;
	int ano;
	
	boolean dataValida = true;
	
	void preencherData(int d, int m, int a) {
		
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
		
		if(dataValida == true) {
		
			System.out.printf("%02d/%02d/%d\n", dia, mes, ano);
		} else {
			System.out.println("Data Inválida ");
	}
	  }
	
	}




## class Pessoa

​	
​	
	public class Pessoa {
		String nome;
		String documento;
		Data dataNascimento;
		
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

	 public class Teste {

		public static void main(String[] args) {

			 Data dtNasc = new Data();

			 dtNasc. preencherData(10, 7, 1982);

			 //dtNasc.imprimirData();

			 Pessoa joao = new Pessoa();

			 joao.preencherDados("João das Neves", "123456789-01");

			 joao.dataNascimento = dtNasc;

			 joao.imprimir();
		}
	}


## RETORNO

NOME: João das Neves
DOC: 123456789-01
DATA NASC.: 10/07/1982