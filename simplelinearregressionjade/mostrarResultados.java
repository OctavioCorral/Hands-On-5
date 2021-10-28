/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelinearregressionjade;

/**
 *
 * @author Tavin
 */
public class mostrarResultados {
    
    public void mostrarResultados(float totalx, float totaly, float totalx2, float xiyi, float mediax, float mediay, double b1, double b0, double advertising, double advertising2, double advertising3) {
        System.out.print("\nLa sumatoria de Xi es: " + totalx);
        System.out.print("\nLa sumatoria de Yi es: " + totaly);
        System.out.print("\nEl cuadrado de la sumatoria de Xi es: " + totalx2);
        System.out.print("\n");
        System.out.print("\nEl valor de XiYi es: " + xiyi);
        System.out.print("\n");
        System.out.print("\nLa media de x es: " + mediax);
        System.out.print("\nLa media de y es: " + mediay);
        System.out.print("\n");
        System.out.print("\nEl valor de b1 es: " + b1);
        System.out.print("\nEl valor de b0 es: " + b0);
        System.out.print("\n");
        System.out.print("\nEl valor de Y cuando se invierte ms en advertising es: \n" + "Advertising con 62M es: "
                + advertising + "\nAdvertising con 72M es: " + advertising2 + "\nAdvertising con 82M es: " + advertising3 + "\n");

    }
    
}
