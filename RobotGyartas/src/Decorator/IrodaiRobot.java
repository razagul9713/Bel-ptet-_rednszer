
package Decorator;
import Robot.Memoria.Memoria;
import RobotPart.Alaplap.IrodaiAlaplap;
import RobotPart.Camera.Camera;
import RobotPart.Software.SoftwareType;
import RobotPart.Teljesitmeny.Teljesitmeny;
import RobotPart.Proci.Proci;
import Exceptions.HibasAlaplapException;
import Exceptions.HibasSzoftverException;
import Exceptions.HibasTeljesitmenyException;
import RobotPart.Alaplap.FoAlapTipus;

/**
 *
 * @author Dani
 */
public class IrodaiRobot extends Robot{
    
    private Memoria memoria;
    private IrodaiAlaplap alaplap;
    private Camera camera;
    private SoftwareType software;
    private Teljesitmeny teljesitmeny;
    private Proci proci;
    private RobotKulso kulso;
    
    public Robot irodai = new Robot();
    
     public IrodaiRobot(Memoria memoria, FoAlapTipus alaplaptipus, Camera camera, SoftwareType software, Teljesitmeny teljesitmeny, Proci proci, RobotKulso kulso) 
            throws HibasAlaplapException, HibasSzoftverException, HibasTeljesitmenyException{
        super(kulso);
        this.alaplap = alaplap;
        this.camera = camera;
        this.kulso = kulso;
        this.proci = proci;
        this.software = software;
        this.teljesitmeny = teljesitmeny;
        this.memoria = memoria;
        
         if(this.alaplap.getFoAlapTipus().Irodai != alaplap.getFoAlapTipus()){
            throw new HibasAlaplapException("Ez nem az Irodai robot alaplaptípusa!");
        }
        if(this.software.Windows != software.Windows){
            throw new HibasSzoftverException("Ez a szoftver nem megfelelő ennek a robotnak!");
        }
        if(this.teljesitmeny.getTeljesitmeny() != teljesitmeny.getTeljesitmeny()){
            throw new HibasTeljesitmenyException("Ennek a Robotnak a teljesítménye nem megfelelő!");
        }
    
    }
     @Override
    public String Build(){
        return "Robot részei: Memória - " + this.memoria.getMemoria() + "alaplap: " + this.alaplap.getFoAlapMeretek() + "Szoftver: " + this.software.Windows + 
                "Teljesitmény: " + this.teljesitmeny.getTeljesitmeny() + "Proci" + this.proci.getmagok() + "Kamera" + this.camera.getFelbontas()
                + "Kinézet " + this.kulso.Fém;
    }
    
}
