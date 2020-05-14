
package RobotPart.Software;

/**
 *
 * @author Dani
 */
public class Software {
    private SoftwareType tipus;
    
    public SoftwareType gettipus(){
        return tipus;
    }
    public void settipus(SoftwareType tipus){
        this.tipus = tipus;
    }
    
    public Software(SoftwareType tipus){
        this.tipus = tipus;
    }
}
