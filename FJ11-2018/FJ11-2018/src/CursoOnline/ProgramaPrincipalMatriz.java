package CursoOnline;
public class ProgramaPrincipalMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.limparNotas();
		aluno.adicionarNotas(10);  // 0,0
		aluno.adicionarNotas(8.5); // 0,1
		aluno.adicionarNotas(7);   // 1,0
		aluno.adicionarNotas(5);   // 1,1
		double notaBuscada = aluno.buscarNota(4);
		System.out.println(notaBuscada);
	}

}