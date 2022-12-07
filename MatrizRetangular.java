package matriz;

public class MatrizRetangular  implements Matriz {
	 private final int linha, coluna;
	 double m[][];

	 //CONSTRUTORA DA CLASSE
	 public MatrizRetangular(int l, int c) {
		 linha = l;
		 coluna = c;
		 m = new double[linha][coluna];
	 }
	 
	 // MÉTODO QUE RETORNA A MATRIZ TRANSPOSTA
	 @Override
	 public MatrizRetangular transposta() {
		 MatrizRetangular res = new MatrizRetangular (coluna, linha);
	 
		 for(int i = 0; i < linha; i++) {
			 for(int j = 0; j < linha; j++) {
				 res.setElemento(j, i, m[i][j]);
			 }
		 }
		 return res;
	 }
	 // MÉTODO QUE VERIFICA SE A MATRIZ É QUADRADA OU NÃO
	 @Override
	 public boolean quadrada() {
		 return (linha == coluna) ? true : false;
	 }
	 
	 //ATRIBUI O VALOR A UM ELEMENTO
	 
	 @Override
	 public void setElemento (int i, int j, double valor) {
		 m[i][j] = valor;
	 }
	 
	 //RETORNA O VALOR DE UM ELEMENTO
	 @Override
	 public double getElemento (int i, int j) {
		 return m[i][j];
	 }
	 // MOSTRA A MATRIZ
	 @Override
	 public void mostrar_matriz(){
		 for( int i=0; i<linha; i++ ){
			 for( int j=0; j<coluna; j++ ){
				 System.out.print( "\t" + m[i][j] );
			 }
			 System.out.print( "\n" );
		 }
	 }
}
