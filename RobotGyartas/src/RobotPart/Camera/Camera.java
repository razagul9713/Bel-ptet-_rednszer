
package RobotPart.Camera;

/**
 *
 * @author Dani
 */
public class Camera {
    private Felbontas felbontas;
    public Felbontas getFelbontas(){
        return felbontas;
    }
    public void setFelbontas(Felbontas felbontas){
        this.felbontas = felbontas;
    }
    
    public Camera(Felbontas felbontas){
        this.felbontas = felbontas;
    }
}
