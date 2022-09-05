
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
