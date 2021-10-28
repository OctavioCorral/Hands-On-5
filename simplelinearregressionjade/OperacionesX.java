
package simplelinearregressionjade;

public class OperacionesX {

    int i, j, n = 0, xiyi = 0;
    float totalx = 0, totaly = 0, totalx2 = 0;
   
   
    // Sumar los numeros guardados en los arreglos de xi
    public float NumerosXi(int numerosx[]) {
        for (i = 0; i < numerosx.length; i++) {
            totalx += numerosx[i];  
        }
     
        return totalx;
    }

    // Sumar los numeros guardados en los arreglos de yi
    public float NumerosYi(int numerosy[]) {
        for (j = 0; j < numerosy.length; j++) {
            totaly += numerosy[j];
        }

        return totaly;
    }

    // La suma de xi la ponemos al cuadrado
    public float NumerosX2(int numerosx[]) {
        for (i = 0; i < numerosx.length; i++) {
            totalx2 += Math.pow(numerosx[i], 2);
        }

        return totalx2;
    }

    // Multiplicacion de xi y yi entre si
    public int NumerosXiYi(int numerosx[], int numerosy[]) {
        for (i = 0; i < numerosx.length; i++) {
            xiyi += (numerosx[i] * numerosy[i]);
        }

        return xiyi;
    }


}
