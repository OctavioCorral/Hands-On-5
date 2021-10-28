//Octavio Corral Tovar 5to "A" Sistemas
//No. Control 19011234

package simplelinearregressionjade;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author Tavin
 */
public class SimpleLinearRegressionJADE extends Agent{
    
    @Override
    protected void setup(){
        
        System.out.println("Agente "+getLocalName()+" iniciado");
        addBehaviour(new MyOneShotBehaviour());
    
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
       int n=9, xiyi;
        float totalx, totaly, totalx2;
        float mediax, mediay;
        double b1, b0;
        double advertising, advertising2, advertising3;

        OperacionesX operacionx = new OperacionesX();
        Medias medias = new Medias();
        Betas betas = new Betas();
        Advertising advertisings = new Advertising();
        mostrarResultados resultados = new mostrarResultados();
        
        
        int numerosx[] = {23,26,30,34,43,48,52,57,58};
        int numerosy[] = {651,762,856,1063,1190,1298,1421,1440,1518};
        
     
        totalx = operacionx.NumerosXi(numerosx);
        totaly = operacionx.NumerosYi(numerosy);
        xiyi = operacionx.NumerosXiYi(numerosx, numerosy);
        totalx2 = operacionx.NumerosX2(numerosx);
        mediax = medias.MediaXi(totalx, n);
        mediay = medias.MediaYi(totaly, n);
        b1 = betas.B1(n, xiyi, totalx, totaly, totalx2);
        b0 = betas.B0(mediay, mediax, b1);
        advertising = advertisings.Advertising(b1, b0);
        advertising2 = advertisings.Advertising2(b1, b0);
        advertising3 = advertisings.Advertising3(b1, b0);

        resultados.mostrarResultados(totalx, totaly, totalx2, xiyi, mediax, mediay, b1, b0, advertising, advertising2, advertising3);
    } 
    
    @Override
    public int onEnd() {
        System.out.println("\nAgente Muerto");
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }
   
}
