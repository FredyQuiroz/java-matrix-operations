/*
 * operaciones_matriz.java
 *
 * Created on
 */

/**
 *
 * @author  Universidad San martin
 * @version P1
 */
public class operaciones_matriz {

    /** Operaciones sobre matrices */
    
    // Suma de 2 matrices
    public static matriz plus(matriz a, matriz b) {
        matriz result = new matriz (a.n);
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                result.x[i][j] = a.x[i][j] + b.x[i][j];
            }
        }
        return result;
    }

    
    // Resta de 2 matrices
    public static matriz minus(matriz a, matriz b) {
       matriz result = new matriz (a.n);
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                result.x[i][j] = a.x[i][j] - b.x[i][j];
            }
        }
        return result;
    }

    
    // Multiplicacion de 2 matrices
    public static matriz multiplication(matriz a, matriz b) {
        if(a.n!=b.n)
            return null;
        int suma=0;
        matriz result = new matriz (a.n);
        for(int i = 0; i < a.n; i++){
                for(int j = 0; j < b.n; j++){
                        suma = 0;
                        for(int k = 0; k < b.n; k++){
                                suma += a.x[i][k] * b.x[k][j];
                        }
                        result.x[i][j] = suma;
                }
        }
        return result;
    }

    
    // Transpuesta de una matriz
    public static matriz transpouse (matriz a) {

        matriz result = new matriz (a.n);
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                result.x[j][i] = a.x[i][j];
            }
        }
        return result;
    }
    // End of transpouse method
    
    // Multiplicacion por un escalar
    public static matriz escalar_multiplication(matriz a, double alfa) {
        //COMPLETAR NO SE IMPRIME NADA, DEVUELVE UN RESULTADO
        matriz result = new matriz (a.n);
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                result.x[i][j] = alfa*a.x[i][j];
            }
        }
        return result;
    }
    //End of escalar_multiplication method
    
    // Evalua una matriz sumando cada una de sus posiciones
    public static double trace (matriz a) {
        double result = 0;
        for (int i = 0; i < a.n; i++) {
            result = result + a.x[i][i];
        }
        return result;
    }
    // End trace method

}
