/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido;

/**
 *
 * @author CC
 */
public class Matriz {
    int [][] matriz = new int [3][3];
    
    
    public Matriz(int [][] matriz){
        this.matriz=matriz;
    }
    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
}
