package robot1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Dani
 */
public class TextúraNGTest {
    
    public TextúraNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of kiir method, of class Textúra.
     */
    @Test
    public void testKiir() {
        System.out.println("kiir");
        Textúra instance = null;
        String expResult = "";
        String result = instance.kiir();
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getID method, of class Textúra.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Textúra instance = null;
        String expResult = "";
        String result = instance.getID();
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getMemoria method, of class Textúra.
     */
    @Test
    public void testGetMemoria() {
        System.out.println("getMemoria");
        Textúra instance = null;
        int expResult = 0;
        int result = instance.getMemoria();
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getNem method, of class Textúra.
     */
    @Test
    public void testGetNem() {
        System.out.println("getNem");
        Textúra instance = null;
        String expResult = "";
        String result = instance.getNem();
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getTeljesitmeny method, of class Textúra.
     */
    @Test
    public void testGetTeljesitmeny() {
        System.out.println("getTeljesitmeny");
        Textúra instance = null;
        int expResult = 0;
        int result = instance.getTeljesitmeny();
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getElv method, of class Textúra.
     */
    @Test
    public void testGetElv() {
        System.out.println("getElv");
        Textúra instance = null;
        String expResult = "";
        String result = instance.getElv();
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of gyariRobot method, of class Textúra.
     */
    @Test
    public void testGyariRobot() {
        System.out.println("gyariRobot");
        Textúra instance = null;
        Robot expResult = null;
        Robot result = instance.gyariRobot();
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getSzoftvers method, of class Textúra.
     */
    @Test
    public void testGetSzoftvers() {
        System.out.println("getSzoftvers");
        String Szoftver = "";
        Textúra instance = null;
        String[] expResult = null;
        String[] result = instance.getSzoftvers(Szoftver);
        assertEquals(result, expResult);
        
        fail("Ez csak egy prototípus.");
    }

    public abstract class TextúraImpl extends Textúra {

        public TextúraImpl() {
            super("ID:123", 5098, "Férfi", 120, "Mindegyik Elvet ismeri");
        }

        public String kiir() {
            return "";
        }

        public String getID() {
            return "";
        }

        public int getMemoria() {
            return 0;
        }

        public String getNem() {
            return "";
        }

        public int getTeljesitmeny() {
            return 0;
        }

        public String getElv() {
            return "";
        }

        public Robot gyariRobot() {
            return null;
        }
    }
    
}
