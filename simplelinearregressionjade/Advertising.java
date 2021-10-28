
package simplelinearregressionjade;

/**
 *
 * @author Tavin
 */
public class Advertising {
    double advertising, advertising2, advertising3;
    
    // Sacar el advertaising cuando se invierten en 62, 72 y 82
    public double Advertising(double b1, double b0) {
        advertising = b1 * (62) + b0;
        System.out.print("\n");

        return advertising;
    }

    public double Advertising2(double b1, double b0) {
        advertising2 = b1 * (72) + b0;
        System.out.print("\n");

        return advertising2;
    }

    public double Advertising3(double b1, double b0) {
        advertising3 = b1 * (82) + b0;
        System.out.print("\n");

        return advertising3;
    }
    
}
