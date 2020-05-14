
package robotgyartas;
import Decorator.Robot;
import Decorator.HaziRobot;
import Decorator.IrodaiRobot;
import Decorator.RendorRobot;
import Decorator.SzereloRobot;
import Decorator.RobotKulso;
import Robot.Memoria.Memoria;
import Robot.Memoria.MemoriaTipus;
import RobotPart.Alaplap.FoAlapTipus;
import RobotPart.Alaplap.HáziAlaplap;
import RobotPart.Alaplap.IrodaiAlaplap;
import RobotPart.Alaplap.RendorAlaplap;
import RobotPart.Alaplap.SzereloAlaplap;
import RobotPart.Camera.Camera;
import RobotPart.Camera.Felbontas;
import RobotPart.Proci.Proci;
import RobotPart.Software.Software;
import RobotPart.Software.SoftwareType;
import RobotPart.Teljesitmeny.Teljesitmeny;
import RobotPart.Teljesitmeny.MeretTipus;
import Exceptions.HibasAlaplapException;
import Exceptions.HibasSzoftverException;
import Exceptions.HibasTeljesitmenyException;
import RobotPart.Proci.ProciMagok;

/**
 *
 * @author Dani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HibasAlaplapException, HibasSzoftverException, HibasTeljesitmenyException {
        
        
        try{
        
        RobotokGyartasa gyartas = RobotokGyartasa.getpeldany();
        
        Memoria memoria = new Memoria(MemoriaTipus.Házi, 1024);
        Camera camera = new Camera(Felbontas._1024_768);
        Proci proci = new Proci(8);
        Software szoftver = new Software(SoftwareType.KUKA);
        Teljesitmeny teljesitmeny = new Teljesitmeny(MeretTipus._120KWatt, 120);
        RendorAlaplap alaplap = new RendorAlaplap();
        Robot kulso = new Robot();
        RendorRobot robot = new RendorRobot(memoria, FoAlapTipus.Rendor, camera, SoftwareType.KUKA, teljesitmeny, proci, RobotKulso.Vibránium);
        System.out.println(robot.Build());
        gyartas.Add(robot);
        
        Memoria memoria2 = new Memoria(MemoriaTipus.Irodai, 5096);
        Camera camera2 = new Camera(Felbontas._1920_1080);
        Proci proci2 = new Proci(8);
        Software szoftver2 = new Software(SoftwareType.Windows);
        Teljesitmeny teljesitmeny2 = new Teljesitmeny(MeretTipus._60KWatt, 60);
        IrodaiAlaplap alaplap2 = new IrodaiAlaplap();
        Robot kulso2 = new Robot();
        IrodaiRobot robot2 = new IrodaiRobot(memoria2, FoAlapTipus.Irodai, camera2, SoftwareType.Windows, teljesitmeny2, proci2, RobotKulso.Fém);
        System.out.println(robot2.Build());
        gyartas.Add(robot2);
        
        Memoria memoria3 = new Memoria(MemoriaTipus.Házi, 2048);
        Camera camera3 = new Camera(Felbontas._1280_720);
        Proci proci3 = new Proci(8);
        Software szoftver3 = new Software(SoftwareType.Windows);
        Teljesitmeny teljesitmeny3 = new Teljesitmeny(MeretTipus._50KWatt, 50);
        HáziAlaplap alaplap3 = new HáziAlaplap();
        Robot kulso3 = new Robot();
        HaziRobot robot3 = new HaziRobot(memoria3, FoAlapTipus.Házi, camera3, ProciMagok._16, Felbontas._1024_768, teljesitmeny3, SoftwareType.Linux,   RobotKulso.Aluminium);
        System.out.println(robot3.Build());
        gyartas.Add(robot3);
        
        Memoria memoria4 = new Memoria(MemoriaTipus.Szerelo, 5096);
        Camera camera4 = new Camera(Felbontas._4096_3072);
        Proci proci4 = new Proci(8);
        Software szoftver4 = new Software(SoftwareType.KUKA);
        Teljesitmeny teljesitmeny4 = new Teljesitmeny(MeretTipus._80KWatt, 80);
        SzereloAlaplap alaplap4 = new SzereloAlaplap();
        Robot kulso4 = new Robot();
        SzereloRobot robot4 = new SzereloRobot(memoria4, FoAlapTipus.Szerelo, camera4, SoftwareType.KUKA, teljesitmeny4, proci4, RobotKulso.Acél);
        System.out.println(robot4.Build());
        gyartas.Add(robot4);
        
        
        }catch ( HibasAlaplapException e){
            e.printStackTrace();
        }
        catch ( HibasSzoftverException e){
            e.printStackTrace();
        }
        catch ( HibasTeljesitmenyException e){
            e.printStackTrace();
        }
        
        
    }
    
}
