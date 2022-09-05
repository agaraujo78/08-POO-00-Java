
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
