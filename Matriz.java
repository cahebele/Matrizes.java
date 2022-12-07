package matriz;

public interface Matriz {
	// Método_que_retorna_a_matriz_transposta
	 public Matriz transposta();

	 // Método_que_verifica_se_a_matriz_é_quadrada_ou_não
	 public boolean quadrada();
	// Atribui_o_valor_a_um_elemento
	 public void setElemento(int i, int j, double valor);

	 // Retorna_o_valor_de_um_elemento
	 public double getElemento( int i, int j);

	 // Mostra_a_matriz
	 public void mostrar_matriz();
}