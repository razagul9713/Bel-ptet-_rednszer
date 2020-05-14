
package RobotPart.Teljesitmeny;
import RobotPart.Teljesitmeny.MeretTipus;

/**
 *
 * @author Dani
 */
public class Teljesitmeny {
    private MeretTipus meret;
    
    public MeretTipus getMeret(){
        return meret;
    }
    public void setMeret(MeretTipus meret){
        this.meret = meret;
    }
    
    private int teljesitmeny;
    public int getTeljesitmeny(){
        return teljesitmeny;
    }
    public void setTeljesitmeny(int teljesitmeny){
        this.teljesitmeny = teljesitmeny;
    }
    
    public Teljesitmeny(MeretTipus meret, int teljesitmeny){
        this.meret = meret;
        this.teljesitmeny = teljesitmeny;
    }
    
}
