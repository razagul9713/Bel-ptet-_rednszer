package robot1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import robot1.RendörTesztRobotTest.RendörTesztRobotImpl;
import robot1.SzereloTesztRobotTest;

/**
 *
 * @author Dani
 */
public class SzereloTesztRobotTest {
    
    public SzereloTesztRobotTest() {
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
     * Test of ötvözetKiir method, of class SzereloTesztRobot.
     */
    @Test
    public void testÖtvözetKiir() {
        System.out.println("Kiir");
        SzereloTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetKiir();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetID method, of class SzereloTesztRobot.
     */
    @Test
    public void testÖtvözetGetID() {
        System.out.println("ID");
        SzereloTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetID();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetMemoria method, of class SzereloTesztRobot.
     */
    @Test
    public void testÖtvözetGetMemoria() {
        System.out.println("Memória");
        SzereloTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetMemoria();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }
    /**
     * Test of ötvözetGetMemoria method, of class SzereloTesztRobot.
     */
    @Test
    public void testWork(){
         System.out.println("work");
         SzereloTesztRobot instance = new SzereloTesztRobotImpl("",0,"",0,"") {
             @Override
             public String kiir() {
                 return null;
             }

             @Override
             public String getID() {
                 return robot.getID();
             }

             @Override
             public int getMemoria() {
                 return robot.getMemoria();
             }

             @Override
             public String getNem() {
                 return robot.getNem();
             }

             @Override
             public int getTeljesitmeny() {
                 return robot.getTeljesitmeny();
             }

             @Override
             public String getElv() {
                 return robot.getElv();
             }

             @Override
             public Robot gyariRobot() {
                 return null;
             }

             @Override
             public void getwork() {
                 return;
             }

             @Override
             public void getsleep() {
                 return;
             }
         };
          instance.getwork();
        
        fail("Ez csak egy prototípus.");
    }
    /**
     * Test of ötvözetGetMemoria method, of class SzereloTesztRobot.
     */
    @Test
    public void testSleep(){
         System.out.println("Sleep");
         SzereloTesztRobot instance = new SzereloTesztRobotImpl("",0,"",0,"") {
             @Override
             public String kiir() {
                 return null;
             }

             @Override
             public String getID() {
                 return robot.getID();
             }

             @Override
             public int getMemoria() {
                 return robot.getMemoria();
             }

             @Override
             public String getNem() {
                 return robot.getNem();
             }

             @Override
             public int getTeljesitmeny() {
                 return robot.getTeljesitmeny();
             }

             @Override
             public String getElv() {
                return robot.getElv();
             }

             @Override
             public Robot gyariRobot() {
                 return null;
             }

             @Override
             public void getwork() {
                 return;
             }

             @Override
             public void getsleep() {
                 return;
             }
         };
          instance.getsleep();
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetNem method, of class SzereloTesztRobot.
     */
    @Test
    public void testÖtvözetGetNem() {
        System.out.println("Nem");
        SzereloTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetNem();
        assertEquals(expResult, result);
      
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetTeljesitmeny method, of class SzereloTesztRobot.
     */
    @Test
    public void testÖtvözetGetTeljesitmeny() {
        System.out.println("Teljesítmény");
        SzereloTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetTeljesitmeny();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetElv method, of class SzereloTesztRobot.
     */
    @Test
    public void testÖtvözetGetElv() {
        System.out.println("Elvek");
        SzereloTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetElv();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetSzoftver method, of class SzereloTesztRobot.
     */
    @Test
    public void testÖtvözetGetSzoftvers() {
        System.out.println("Szoftver");
        SzereloTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetSzoftver();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    public abstract class SzereloTesztRobotImpl extends SzereloTesztRobot {

        public SzereloTesztRobotImpl(String ID, int memoria, String nem, int teljesitmeny, String elv) {
            super(ID, memoria, nem, teljesitmeny, elv);
        }
    }

    

    /**
     * Test of SzereloTesztRobot method, of class SzereloTesztRobot.
     */
    @Test
    public void testSzereloTesztRobot() {
        System.out.println("SzereloTesztRobot");
        Robot robot = null;
        SzereloTesztRobot instance = new SzereloTesztRobotImpl("",0,"",0,"") {
            @Override
            public String kiir() {
                return null;
            }

            @Override
            public String getID() {
                return robot.getID();
            }

            @Override
            public int getMemoria() {
                return robot.getMemoria();
            }

            @Override
            public String getNem() {
                return robot.getNem();
            }

            @Override
            public int getTeljesitmeny() {
                return robot.getTeljesitmeny();
            }

            @Override
            public String getElv() {
                return robot.getElv();
            }

            @Override
            public Robot gyariRobot() {
                return null;
            }

            @Override
            public void getwork() {
                return;
            }

            @Override
            public void getsleep() {
                return;
            }
        };
        Robot expResult = null;
        Robot result = instance.SzereloTesztRobot(robot);
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }   
    
}
