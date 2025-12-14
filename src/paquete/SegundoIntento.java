package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class SegundoIntento {
	static Scanner scanner = new Scanner(System.in);
	static final String[] VALID_INPUTS = {"11", "12", "13", "21", "22", "23", "31", "32", "33"};

	public static void main(String[] args) {
		int[][] tablero = new int[3][3];
		boolean fin = false;
		boolean jugadorActual = false;
		String entrada = "";
		//Imprimo el tablero
		imprimirTablero(tablero);
		while(!fin) {
			System.out.printf("Va el jugador %s\n", (jugadorActual)?"O":"X");
			//entrada de datos
			do {
				System.out.println("Donde vas a jugar: ");
				entrada = scanner.nextLine();
			}while(!Arrays.asList(VALID_INPUTS).contains(entrada));
			//Pasar a variables fila columna
			int fila = entrada.charAt(0)-'0' -1;
			int columna = entrada.charAt(1)-'0' -1;
			//Comprobar si esta cubierta
			if(tablero[fila][columna]!=0) {
				System.out.println("Ya esta cubierta");
				continue;
			}
			//Rellenarlo
			tablero[fila][columna] = (jugadorActual?2:1);
			//Ahora faltaria comprobar si alguien gano
			fin = gano(tablero)||completado(tablero);
			//Imprimo el tablero
			imprimirTablero(tablero);
			//Cambiar el jugador
			if(!gano(tablero))
				jugadorActual = (jugadorActual)?false:true;
		}
		if(gano(tablero)) {
			System.out.printf("¡Gano el jugador: \"%s\"!", (jugadorActual)?"Jugador O":"Jugador X" );
		}
		else
			System.out.println("Empate!!");
	}
	
	 static boolean gano(int[][] tablero) {

		 
		//Comprobar lineas
		for(int i=0; i<3;i++) {
			if(tablero[i][0]==tablero[i][1]&&tablero[i][0]==tablero[i][2]&&tablero[i][0]!=0)
				return true;
			if(tablero[0][i]==tablero[1][i]&&tablero[0][i]==tablero[2][i]&&tablero[0][i]!=0)
				return true;
		}
		 
		
		//Diagonales
	    if (tablero[0][0] != 0 &&tablero[0][0] == tablero[1][1] &&tablero[0][0] == tablero[2][2])
	        return true;
	    if (tablero[0][2] != 0 &&tablero[0][2] == tablero[1][1] &&tablero[0][2] == tablero[2][0])
	        return true;
	    
	    return false; 
	}
	 
	 static void imprimirTablero(int[][] tablero) {
		 System.out.println("+---+---+---+");
		 for(int f=0;f<tablero.length;f++) {
			 System.out.print("| ");
			 for(int c=0;c<tablero[0].length;c++) {
				 System.out.printf("%s | ", (tablero[f][c]==0)?" ":(tablero[f][c]==1)?"X":"O");
			 }
			 System.out.println("\n+---+---+---+");
		}
	 }
	 
	 static boolean completado(int[][] tablero) {
		    for (int i = 0; i < tablero.length; i++) 
		        for (int j = 0; j < tablero[i].length; j++) 
		            if (tablero[i][j] == 0) 
		                return false;   
		    return true; 
		}
}
