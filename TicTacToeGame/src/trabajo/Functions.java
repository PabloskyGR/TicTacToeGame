package trabajo;

public class Functions {
	
	/**
	 * variable that 
	 */
	public static final int TAMTABLERO=3;
	
	/**
	 * 
	 */
	private static char[][] tablero=new char [TAMTABLERO][TAMTABLERO];
	
	/**
	 * 
	 */
	public void rellenaTablero() {
		//
		for(int i=0;i<TAMTABLERO;i++) {

			//
			for(int j=0;j<TAMTABLERO;j++) {
				
				tablero[i][j]='-';
				
			}
		}	
	}
	
	
	public void pintaTablero() {
		//
		for(int i=0;i<TAMTABLERO;i++) {

			//
			for(int j=0;j<TAMTABLERO;j++) {
				
				System.out.println(tablero[i][j]);
				
			}
		}	
	}
	
	
	

	
	
	
	
	/**
	 * 
	 * @return
	 */
	public boolean cambiaPosicion(int x,int y,int turno) {
		boolean esCambiada=false; 
		
		if(x<TAMTABLERO&&x>=0 && y<TAMTABLERO&&y>=0 && tablero[x][y]=='-') {
			
			if (turno%2==0) {

				tablero[x][y]='X';
			}
			else {
				tablero[x][y]='O';
			}
			
			esCambiada=true;
			
		}
		
		return esCambiada;
	}
	
	
	
}

