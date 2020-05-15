/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;
import RobotPart.Teljesitmeny.MeretTipus;
import Exceptions.HibasTeljesitmenyException;
import RobotPart.Teljesitmeny.Teljesitmeny;
import RobotPart.Teljesitmeny.TeljesitmenyTest;
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
public class HibasTeljesitmenyExceptionTest {
    
    public void HibasTeljesitmenyExceptionTest() {
     
        Teljesitmeny teljesitmeny = new Teljesitmeny(MeretTipus._120KWatt, 120);
            teljesitmeny.getMeret();
            fail("Hibát várunk");
            assertThat(teljesitmeny.getTeljesitmeny(), is("Hibás a teljesítmény"));
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
    public void testSomeMethod() {
       
            
       
    }
    
}
