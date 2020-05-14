
package robotgyartas;
import Decorator.Robot;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class RobotokGyartasa {
    
    ArrayList<Robot> robotok = new ArrayList<Robot>();
    
    private static RobotokGyartasa peldany = null;
    
    private RobotokGyartasa(){}
    
    public void Add(Robot robot){
        robotok.add(robot);
    }
    
    
    // Singleton kapcsolat
    public static RobotokGyartasa getpeldany(){
        if(peldany == null){
            peldany = new RobotokGyartasa();
        }
        return peldany;
    }
    
}
