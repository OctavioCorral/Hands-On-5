
package simplelinearregressionjade;

/**
 *
 * @author Tavin
 */
public class Betas {
     double b1, b0;
    
    // Operacion para sacar B1
    public double B1(int n, float xiyi, float totalx, float totaly, float totalx2) {
        b1 = ((n * xiyi) - (totalx * totaly)) / ((n * totalx2) - (totalx * totalx));

        return b1;
    }

    // Operacion para sacar B0
    public double B0(float mediay, float mediax, double b1) {
        b0 = mediay - (b1) * (mediax);

        return b0;
    }
    
    
    
}
