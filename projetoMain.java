package matriz;

public class projetoMain {
	public static void main(String[] args) {
		 MatrizQuadrada m1 = new MatrizQuadrada(3);
		 MatrizRetangular m2 = new MatrizRetangular(3,4);
		 MatrizQuadrada m3;
		 MatrizRetangular m4;
		 int i,j;
		
		 // PREENCHE A MATRIZ M1 COM ELEMENTOS
		 for( i=0; i<3; i++ ){
			 for( j=0; j<3; j++ ){
				 m1.setElemento(i, j, (double)(3*i + j));
			 }
		 }
		 m3 = m1.transposta();
		
		 // PREENCHE A MATRIZ M2 COM ELEMENTOS
		 for( i=0; i<3; i++ ){
			 for( j=0; j<4; j++ ){
				 m2.setElemento(i, j, (double)(i*j + 2));
			 }
		 }
		 m4 = m2.transposta();
		
		 System.out.println("Traço da matriz M1: " + m1.traco() );
		 	if( m1.quadrada() )
		 		System.out.println("A matriz M1 é quadrada.");
		 		else
		 			System.out.println("A matriz M1 não é quadrada.");
		 	if( m2.quadrada() )
		 		System.out.println("A matriz M2 é quadrada.");
		 		else
		 			System.out.println("A matriz M2 não é quadrada.");
		 System.out.println( "Matriz M1" );
		 	m1.mostrar_matriz();
		 System.out.println( "Matriz M2" );
		 	m2.mostrar_matriz();
		 System.out.println( "Matriz M3" );
		 	m3.mostrar_matriz();
		 System.out.println( "Matriz M4" );
		 	m4.mostrar_matriz();
	}
}
