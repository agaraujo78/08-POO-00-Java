
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
