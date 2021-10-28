
package simplelinearregressionjade;

/**
 *
 * @author Tavin
 */
public class Medias {
     float mediax = 0, mediay;
    
     // Media de xi
    public float MediaXi(float totalx, int n) {
        mediax = totalx / n;

        return mediax;
    }

    // Media de yi
    public float MediaYi(float totaly, int n) {
        mediay = totaly / n;

        return mediay;
    }
    
}
