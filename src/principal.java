/*
 * principal.java
 *
 * Created on 
 */

/**
 *
 * @author  Universidad San martin
 * @version P1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class principal {

    /** Creamos un nuevo programa */
    public static void main(String args []) {
        BufferedReader cin = new BufferedReader (new InputStreamReader (System.in));
        String option = " ";
        int opt = 0;
        double escalar = Math.PI;
        double [][]a_1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matriz a = new matriz(a_1);
        double [][]b_1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matriz b = new matriz(b_1);
        opt=-1;
        
        while(opt!=0){
            // menu
        System.out.println("*******************************************\n"+
                           "*     Que operacion deseas hacer ?       *\n"+
                           "*                                         *\n"+
                           "*   1. Suma de matrices                   *\n"+
                           "*   2. Resta de matrices                  *\n"+
                           "*   3. Multiplicacion de matrices         *\n"+
                           "*   4. Traza de una matriz                *\n"+
                           "*   5. Transpuesta de una matriz          *\n"+
                           "*   6. Multiplicacion por un escalar      *\n"+
                           "*   0. Salir                              *\n"+
                           "*                                         *\n"+
                           "*******************************************");
        // FIN menu
        try {
            option = cin.readLine();
        }
        catch (IOException e) {};
        opt = Integer.parseInt(option);

        
            if (opt == 1) {
                System.out.println( " El resulatdo es: "+ operaciones_matriz.plus(a,b) );
            }
            else if (opt == 2) {
                System.out.println( " El resulatdo es: "+ operaciones_matriz.minus(a,b) );
            }
            else if (opt == 3) {
                System.out.println( " El resulatdo es: "+ operaciones_matriz.multiplication(a,b) );
            }
            else if (opt == 4) {
                System.out.println( " El resulatdo es: "+ operaciones_matriz.trace(a) );
            }
            else if (opt == 5) {
                System.out.println( " El resulatdo es: "+ operaciones_matriz.transpouse(a));
            }
            else if (opt == 6) {
                System.out.println( " El resulatdo es: "+ operaciones_matriz.escalar_multiplication(a,escalar) );
            }
        }
    }

}
