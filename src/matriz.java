/*
 * matrix.java
 *
 * Created on 
 */

/**
 *
 * @author  Universidad San martin
 * @version P1
 */
public class matriz {

    /** Creamos una nueva matriz */
    public int n;           // Cantidad de columnas
    public double [ ][ ]x; // Matriz X
    
    // Constructora, inicializa los campos en 0
    public matriz(int n) {
        this.n = n;
        x = new double [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = 0.0;
            }
        }
    }
   
    // Constructora inicializa matriz dada otra matriz
    public matriz(double[ ][ ] y) {
        this.x = y;
        n = y.length;
    }
    
    // Metodo que muestra en linea de texto el contenido de una amtriz
    @Override
    public String toString ( ) {
        String text = "\n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                text += "\t" + (double)Math.round(1000 * x[i][j])/1000;
            }
            text += "\n";
        }
        text += "\n";
        return text;
    }
    

}
