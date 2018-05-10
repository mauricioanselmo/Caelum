package CursoOnline;

public class Fatorial {

	public int calculaFatorial(int n){
		if (n == 0){
			return 1;
		}
		return n*calculaFatorial(n-1);
	}
}

