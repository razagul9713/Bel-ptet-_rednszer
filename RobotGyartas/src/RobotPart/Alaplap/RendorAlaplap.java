
package RobotPart.Alaplap;

/**
 *
 * @author Dani
 */
public class RendorAlaplap extends FoAlap {
    private FoAlapMeretek meret;
    
    public FoAlapMeretek getFoAlapMeretek(){
        return meret;
    }
    public void setFoAlapMeretek(FoAlapMeretek meret){
        this.meret = meret;
    }
    
    private FoAlapTipus tipus;
    public FoAlapTipus getFoAlapTipus(){
        return tipus;
    }

    @Override
    public String BuildFoAlap() {
        return "Alaplapméret: " + this.meret;
    }

    @Override
    public void setFoAlapTipus() {
        this.tipus = FoAlapTipus.Rendor;
    }
    
}
