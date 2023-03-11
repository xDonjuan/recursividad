/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadmatriz;

/**
 *
 * @author Juanes
 */
public class Recursividadmatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        recorrerMatriz(matriz, 0, 0);
    }
    
    public static void recorrerMatriz(int[][] matriz, int fila, int columna) {
        if (fila >= matriz.length) {
            return;
        } else if (columna >= matriz[fila].length) {
            recorrerMatriz(matriz, fila + 1, 0);
        } else {
            System.out.print(matriz[fila][columna] + " ");
            recorrerMatriz(matriz, fila, columna + 1);
        }
    }
    
}
