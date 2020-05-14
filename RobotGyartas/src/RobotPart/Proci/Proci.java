package RobotPart.Proci;

/**
 *
 * @author Dani
 */
public class Proci {
    private int magok;
    public int getmagok(){
        return magok;
    }
    
    public void setmagok(int magok){
        this.magok = magok;
    }
    
    public Proci(int magok){
        this.magok = magok;
    }
    
    public Proci Masolat(){
        Proci proci = new Proci(getmagok());
        proci.setmagok(getmagok());
        return proci;
    }
}
