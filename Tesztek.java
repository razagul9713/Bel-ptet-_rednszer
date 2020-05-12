package robot1;

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
public class EmberTest {
    
    public EmberTest() {
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
     * Test of getNev method, of class Ember.
     */
    @Test
    public void testGetNev() {
        System.out.println("getNev");
        Ember instance = new EmberImpl();
        String expResult = "";
        String result = instance.getNev();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getNem method, of class Ember.
     */
    @Test
    public void testGetNem() {
        System.out.println("getNem");
        Ember instance = new EmberImpl();
        String expResult = "";
        String result = instance.getNem();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus");
    }

    /**
     * Test of getIQ method, of class Ember.
     */
    @Test
    public void testGetIQ() {
        System.out.println("getIQ");
        Ember instance = new EmberImpl();
        int expResult = 0;
        int result = instance.getIQ();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    public class EmberImpl implements Ember {

        public String getNev() {
            return "";
        }

        public String getNem() {
            return "";
        }

        public int getIQ() {
            return 0;
        }
    }

   
}
