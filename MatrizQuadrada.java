package matriz;

public class MatrizQuadrada implements Matriz {
	private final int tam;
	double m[][];
	
	// CONTRUTORA DA CLASSE
	public MatrizQuadrada (int t) {
		tam = t;
		m = new double[tam][tam];
	}
	
	// MÉTODO PARA DETERMINAR O TRAÇO DA MATRIZ
	public double traco() {
		double res = 0;
		for(int i = 0; i < tam; i ++ )res+= m[i][i];
		return res;
	}
	// MÉTODO QUE RETORNA A MATRIZ TRANSPOSTA
	@Override
	public MatrizQuadrada transposta() {
		MatrizQuadrada res = new MatrizQuadrada(tam);
	for(int i = 0; i < tam; i ++) {
		for(int j = 0; j < tam; j ++) {
			res.setElemento(j, i, m[i][j]);
		}
	}
	return res;
	}

	
	// MÉTODO QUE VERIFICA SE A MATRIZ É QUADRADA OU NÃO
	 @Override
	 public boolean quadrada(){
	 return true;
	 }

	 //ATRIBUI O VALOR A UM ELEMENTO
	 @Override
	 public void setElemento( int i, int j, double valor ){
	 m[i][j] = valor;
	 }
	 
	 // RETORNA O VALOR DE UM ELEMENTO
	 @Override
	 public double getElemento( int i, int j ){
	 return m[i][j];
	 }

	 // MOSTRA A MATRIZ
	 @Override
	 public void mostrar_matriz(){
		 for( int i=0; i<tam; i++ ){
			 for( int j=0; j<tam; j++ ){
				 System.out.print( "\t" + m[i][j] );
			 }
			 System.out.print( "\n" );
		 }
	 }
}
	
