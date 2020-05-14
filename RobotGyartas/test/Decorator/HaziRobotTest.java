/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Exceptions.HibasAlaplapException;
import Exceptions.HibasSzoftverException;
import Exceptions.HibasTeljesitmenyException;
import Robot.Memoria.Memoria;
import Robot.Memoria.MemoriaTipus;
import RobotPart.Alaplap.FoAlapTipus;
import RobotPart.Alaplap.HáziAlaplap;
import RobotPart.Camera.Felbontas;
import RobotPart.Proci.Proci;
import RobotPart.Proci.ProciMagok;
import RobotPart.Software.Software;
import RobotPart.Software.SoftwareType;
import RobotPart.Teljesitmeny.MeretTipus;
import RobotPart.Teljesitmeny.Teljesitmeny;
import javafx.scene.Camera;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class HaziRobotTest {
    
    public HaziRobotTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Build method, of class HaziRobot.
     */
    @Test
    public void testBuild()throws HibasAlaplapException, HibasSzoftverException, HibasTeljesitmenyException{
        
        
        Memoria memoria = new Memoria(MemoriaTipus.Házi, 2048);
        RobotPart.Camera.Camera camera = new RobotPart.Camera.Camera(Felbontas._1280_720);
        Proci proci = new Proci(8);
        Software szoftver = new Software(SoftwareType.Windows);
        Teljesitmeny teljesitmeny = new Teljesitmeny(MeretTipus._50KWatt, 50);
        HáziAlaplap alaplap = new HáziAlaplap();
        Robot kulso = new Robot();
        
        
        System.out.println("Build");
        HaziRobot instance = new HaziRobot(memoria, FoAlapTipus.Házi, camera, ProciMagok._16, Felbontas._1024_768, teljesitmeny, SoftwareType.Linux,   RobotKulso.Aluminium);
        String expResult = "Ez egy Házi Robot";
        String result = instance.Build();
        
        assertEquals(expResult, result);
        
        
    }
    
}
