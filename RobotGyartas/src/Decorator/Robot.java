
package Decorator;

/**
 *
 * @author Dani
 */
public class Robot extends RobotDecorator {
    
    private RobotKulso kulso;
    
    public Robot(RobotKulso kulso){
        this.kulso = kulso;
    }
    public Robot(){
    }
    

    @Override
    public String Build() {
        return "Robot kinézete: " + this.kulso;
    }
    
}
