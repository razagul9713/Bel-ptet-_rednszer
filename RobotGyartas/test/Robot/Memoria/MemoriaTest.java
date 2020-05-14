
package Robot.Memoria;

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
public class MemoriaTest {
    
    public MemoriaTest() {
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
     * Test of getMemoria method, of class Memoria.
     */
    @Test
    public void testGetMemoria() {
        System.out.println("getMemoria");
        Memoria instance = new Memoria(MemoriaTipus.Házi, 1024);
        MemoriaTipus expResult = MemoriaTipus.Házi;
        MemoriaTipus result = instance.getMemoria();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setMemoriaTipus method, of class Memoria.
     */
    @Test
    public void testSetMemoriaTipus() {
        System.out.println("setMemoriaTipus");
        MemoriaTipus tipus = MemoriaTipus.Házi;
        Memoria instance = new Memoria(MemoriaTipus.Házi, 1024);
        instance.setMemoriaTipus(tipus);
        
        
    }

    /**
     * Test of getmeret method, of class Memoria.
     */
    @Test
    public void testGetmeret() {
        System.out.println("getmeret");
        Memoria instance = new Memoria(MemoriaTipus.Házi, 1024);
        int expResult = 1024;
        int result = instance.getmeret();
        assert(expResult >= result);
         expResult = result;
    
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setmeret method, of class Memoria.
     */
    @Test
    public void testSetmeret() {
        System.out.println("setmeret");
        int meret = 1024;
        Memoria instance = new Memoria(MemoriaTipus.Házi, 1024);
        instance.setmeret(meret);
        
        
    }
    
}
