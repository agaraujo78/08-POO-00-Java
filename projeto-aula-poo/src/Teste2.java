
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
