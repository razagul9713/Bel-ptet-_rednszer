
package Decorator;
import Robot.Memoria.Memoria;
import RobotPart.Alaplap.HáziAlaplap;
import RobotPart.Camera.Camera;
import RobotPart.Software.SoftwareType;
import RobotPart.Teljesitmeny.Teljesitmeny;
import RobotPart.Proci.ProciMagok;
import Exceptions.HibasAlaplapException;
import Exceptions.HibasSzoftverException;
import Exceptions.HibasTeljesitmenyException;
import Robot.Memoria.MemoriaTipus;
import RobotPart.Alaplap.FoAlapTipus;
import RobotPart.Camera.Felbontas;
import RobotPart.Teljesitmeny.MeretTipus;

/**
 *
 * @author Dani
 */
public class HaziRobot extends Robot{
    
    private Memoria memoria;
    private HáziAlaplap alaplap;
    private Camera camera;
    private Felbontas felbontas;
    private SoftwareType software;
    private Teljesitmeny teljesitmeny;
    private ProciMagok proci;
    private RobotKulso kulso;
    
    public Robot hazi = new Robot();
    
    public HaziRobot(Memoria memoria, FoAlapTipus alaplaptipus, Camera camera, ProciMagok proci, Felbontas felbontas, Teljesitmeny teljesitmeny,  SoftwareType software,   RobotKulso kulso) 
            throws HibasAlaplapException, HibasSzoftverException, HibasTeljesitmenyException{
        super(kulso);
        this.alaplap = alaplap;
        this.felbontas = felbontas;
        this.kulso = kulso;
        this.software = software;
        this.teljesitmeny = teljesitmeny;
        this.memoria = memoria;
        this.proci = proci;
        
         if(this.alaplap.getFoAlapTipus().Házi != alaplap.getFoAlapTipus()){
            throw new HibasAlaplapException("Ez nem a Rendőr alaplaptípusa!");
        }
        if(this.software.Linux != software.Linux){
            throw new HibasSzoftverException("Ez a szoftver nem megfelelő ennek a robotnak!");
        }
        if(this.teljesitmeny.getTeljesitmeny() != teljesitmeny.getTeljesitmeny()){
            throw new HibasTeljesitmenyException("Ennek a Robotnak a teljesítménye nem megfelelő!");
        }
    
    }

    
    @Override
    public String Build(){
        return "Robot részei: Memória - " + this.memoria.getMemoria() + "alaplap: " + this.alaplap.getFoAlapMeretek() + "Szoftver: " + this.software.Linux + 
                "Teljesitmény: " + this.teljesitmeny.getTeljesitmeny() + "Proci" + this.proci._16 + "Kamera" + this.camera.getFelbontas()
                + "Kinézet " + this.kulso.Aluminium;
    }
    
}
