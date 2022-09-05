
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
