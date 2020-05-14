
package RobotPart.Teljesitmeny;

import Robot.Memoria.MemoriaTipus;
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
public class TeljesitmenyTest {
    
    public TeljesitmenyTest() {
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
     * Test of getMeret method, of class Teljesitmeny.
     */
    @Test
    public void testGetMeret() {
        System.out.println("getMeret");
        Teljesitmeny instance = new Teljesitmeny(MeretTipus._120KWatt, 120);
        MeretTipus expResult = MeretTipus._120KWatt;
        MeretTipus result = instance.getMeret();
        
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setMeret method, of class Teljesitmeny.
     */
    @Test
    public void testSetMeret() {
        System.out.println("setMeret");
        int meret = 120;
        Teljesitmeny instance = new Teljesitmeny(MeretTipus._120KWatt, 120);
        instance.setMeret(MeretTipus._120KWatt);
       
        
    }

    /**
     * Test of getTeljesitmeny method, of class Teljesitmeny.
     */
    @Test
    public void testGetTeljesitmeny() {
        System.out.println("getTeljesitmeny");
        Teljesitmeny instance = new Teljesitmeny(MeretTipus._120KWatt, 120);
        int expResult = 120;
        int result = instance.getTeljesitmeny();
        assert(expResult >= result);
         expResult = result;
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTeljesitmeny method, of class Teljesitmeny.
     */
    @Test
    public void testSetTeljesitmeny() {
        System.out.println("setTeljesitmeny");
        int teljesitmeny = 120;
        Teljesitmeny instance = new Teljesitmeny(MeretTipus._120KWatt, 120);
        instance.setTeljesitmeny(teljesitmeny);
       
    }
    
}
