package paquete;

import java.util.Scanner;

public class PrimerIntento {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] tablero = {{1,2,1,2,1,2,1},
						   {3,0,3,0,3,0,3},
						   {1,2,1,2,1,2,1},
						   {3,0,3,0,3,0,3},
						   {1,2,1,2,1,2,1},
						   {3,0,3,0,3,0,3},
						   {1,2,1,2,1,2,1}};
		boolean fin = false;
		int jugadorActual = 0;
		String entrada = "";
		
		while(!fin) {
			
			switch (jugadorActual) {
			case 0 -> System.out.println("Va el jugador X");
			case 1 -> System.out.println("Va el jugador O");
			}
			
			//entrada de datos
			do {
				System.out.println("Donde vas a jugar: ");
				entrada = scanner.nextLine();
			}while(!entrada.equals("11")&&!entrada.equals("12")&&
				   !entrada.equals("13")&&!entrada.equals("21")&&
				   !entrada.equals("22")&&!entrada.equals("23")&&
				   !entrada.equals("31")&&!entrada.equals("32")&&
				   !entrada.equals("33"));
			
			//Pasar a variables fila columna
			int fila = 0;
			int columna = 0;
			switch (entrada) {
			case "11" -> {fila=1;columna=1;}
			case "12" -> {fila=1;columna=3;}
			case "13" -> {fila=1;columna=5;}
			case "21" -> {fila=3;columna=1;}
			case "22" -> {fila=3;columna=3;}
			case "23" -> {fila=3;columna=5;}
			case "31" -> {fila=5;columna=1;}
			case "32" -> {fila=5;columna=3;}
			case "33" -> {fila=5;columna=5;}
			}
			
			//Comprobar si esta cubierta
			if(tablero[fila][columna]!=0) {
				System.out.println("Ya esta cubierta");
				continue;
			}

			
			//Rellenarlo
			//Con fila y columna
			tablero[fila][columna] = (jugadorActual==0?4:5);

			//Ahora faltaria comprobar si alguien gano, q se me va a complicar
			boolean iguales = false;
			int entero = -1;
			
			//Horizontales
			filas: for(int f=1; f<tablero.length;f+=2) {
				entero = tablero[f][1];
				for(int c=1;c<tablero[0].length;c+=2) {
					if(tablero[f][c]==0)break;
					if(tablero[f][c] != entero)break;
					if(c==5) {iguales = true;break filas;}
				}
			}
			//Verticales
			if(!iguales)
				columnas: for(int c=1;c<tablero[0].length;c+=2) {
					entero = tablero[1][c];
					for(int f=1;f<tablero.length;f+=2) {
						if(tablero[f][c]==0)break;
						if(tablero[f][c] != entero)break;
						if(f==5){iguales = true;break columnas;}
					}
				}
			//Diagonales
			if(!iguales) {
				if(tablero[1][1]==tablero[3][3]&&tablero[1][1]==tablero[5][5]) {
					entero = tablero[1][1];
					if(entero!=0)iguales = true;
				}
				if(tablero[1][5]==tablero[3][3]&&tablero[1][1]==tablero[5][1]) {
					entero = tablero[1][5];
					if(entero!=0)iguales = true;
				}
			}
			
			if(iguales)fin=true;
			
			for(int f=0;f<tablero.length;f++) {
				for(int c=0;c<tablero[0].length;c++) {
					if(tablero[f][c] == 1)
						System.out.print("+");
					if(tablero[f][c] == 2)
						System.out.print("---");
					if(tablero[f][c] == 3)
						System.out.print("|");
					if(tablero[f][c] == 0)
						System.out.print("   ");
					if(tablero[f][c] == 4)
						System.out.print(" x ");
					if(tablero[f][c] == 5)
						System.out.print(" o ");
				}
				System.out.println("");
			}
			
			jugadorActual = (jugadorActual==0)?1:0;
			
		}
		@SuppressWarnings("unused")
		String jugador;
		System.out.printf("¡Gano el jugador: \"%s\"!", jugador = (jugadorActual==0)?"Jugador O":"Jugador X" );		
	}
}