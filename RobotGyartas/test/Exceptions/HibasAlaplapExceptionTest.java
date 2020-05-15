/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;
import RobotPart.Alaplap.FoAlapTipus;
import RobotPart.Alaplap.FoAlap;
import RobotPart.Alaplap.FoAlapMeretek;
import RobotPart.Alaplap.HáziAlaplap;
import RobotPart.Alaplap.IrodaiAlaplap;
import RobotPart.Alaplap.RendorAlaplap;
import RobotPart.Alaplap.SzereloAlaplap;
import static org.hamcrest.CoreMatchers.is;
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
public class HibasAlaplapExceptionTest  {
    
    public void HibasAlaplapExceptionTest() {
        HáziAlaplap alaplap = new HáziAlaplap();
        alaplap.setFoAlapMeretek(FoAlapMeretek.Házi);
            alaplap.getFoAlapMeretek();
            
            fail("Hibás alaplapot várunk");
        assertThat(alaplap.getFoAlapMeretek(), is(true));
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

    @Test
    public void testSomeMethod()  {
        
        
    }
    
}
