package CursoOnline;
public class Aluno {
	double notas[][] = new double[2][2];
	int linha = 0;
	int coluna = 0;
	int numeroDeEntradas = 0;

	public void adicionarNotas(double nota) {
		if (linha < notas.length) {
			notas[linha][coluna] = nota;
		}
		if (coluna < notas[0].length) {
			coluna++;
		}
		if (coluna == notas[0].length) {
			linha++;
			coluna = 0;
		}
	}
	
	public void limparNotas(){
		for (int i = 0; i < notas.length; i++){
			for (int j = 0; j < notas[0].length;j++){
				notas[i][j]=-1;
			}
		}
	}

	public double buscarNota(int pos) {
		int qtdColunas = notas[0].length;
	 	int qtdLinhas = notas.length;
	 	int tamanho = qtdLinhas * qtdColunas;
	
		if (pos <= tamanho) {
			int linha = pos / qtdColunas;
			if (pos % qtdColunas == 0) {
				linha--;

			}
			int coluna = pos - (qtdColunas * linha) -1;
			return notas[linha][coluna];
		} else {
			return -1;
		}

	}
}
