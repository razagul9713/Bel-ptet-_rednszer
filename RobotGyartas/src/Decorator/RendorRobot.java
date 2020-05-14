
package Decorator;
import Robot.Memoria.Memoria;
import RobotPart.Alaplap.RendorAlaplap;
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
public class RendorRobot extends Robot {
    
    private Memoria memoria;
    private RendorAlaplap alaplap;
    private Camera camera;
    private SoftwareType software;
    private Teljesitmeny teljesitmeny;
    private Proci proci;
    private RobotKulso kulso;
    
    public Robot rendor = new Robot();
    
    public RendorRobot(Memoria memoria, FoAlapTipus alaplaptipus, Camera camera, SoftwareType software, Teljesitmeny teljesitmeny, Proci proci, RobotKulso kulso) 
            throws HibasAlaplapException, HibasSzoftverException, HibasTeljesitmenyException{
        super(kulso);
        this.alaplap = alaplap;
        this.camera = camera;
        this.kulso = kulso;
        this.proci = proci;
        this.software = software;
        this.teljesitmeny = teljesitmeny;
        this.memoria = memoria;
        
        if(this.alaplap.getFoAlapTipus().Rendor == alaplap.getFoAlapTipus()){
            throw new HibasAlaplapException("Ez nem a Rendőr alaplaptípusa!");
        }
        if(this.software.KUKA != software.KUKA){
            throw new HibasSzoftverException("Ez a szoftver nem megfelelő ennek a robotnak!");
        }
        if(this.teljesitmeny.getTeljesitmeny() != teljesitmeny.getTeljesitmeny()){
            throw new HibasTeljesitmenyException("Ennek a Robotnak a teljesítménye nem megfelelő!");
        }
    }

    
    @Override
    public String Build(){
        return "Robot részei: Memória - " + this.memoria.getMemoria() + "alaplap: " + this.alaplap.getFoAlapMeretek() + "Szoftver: " + this.software.KUKA + 
                "Teljesitmény: " + this.teljesitmeny.getTeljesitmeny() + "Proci" + this.proci.getmagok() + "Kamera" + this.camera.getFelbontas()
                + "Kinézet " + this.kulso.Vibránium;
    }
    
    
    
    
}
