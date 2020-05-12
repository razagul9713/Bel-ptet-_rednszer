package robot1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import robot1.HáziTesztRobotTest;

/**
 *
 * @author Dani
 */
public class HáziTesztRobotTest {
    
    public HáziTesztRobotTest() {
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
     * Test of ötvözetKiir method, of class HáziTesztRobot.
     */
    @Test
    public void testÖtvözetKiir() {
        System.out.println("Kiir");
        HáziTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetKiir();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetID method, of class HáziTesztRobot.
     */
    @Test
    public void testÖtvözetGetID() {
        System.out.println("ID");
        HáziTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetID();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetMemoria method, of class HáziTesztRobot.
     */
    @Test
    public void testÖtvözetGetMemoria() {
        System.out.println("Memória");
        HáziTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetMemoria();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetNem method, of class HáziTesztRobot.
     */
    @Test
    public void testÖtvözetGetNem() {
        System.out.println("Nem");
        HáziTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetNem();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetTeljesitmeny method, of class HáziTesztRobot.
     */
    @Test
    public void testÖtvözetGetTeljesitmeny() {
        System.out.println("Teljesítmény");
        HáziTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetTeljesitmeny();
        assertEquals(expResult, result);
      
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetElv method, of class HáziTesztRobot.
     */
    @Test
    public void testÖtvözetGetElv() {
        System.out.println("Elvek");
        HáziTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetElv();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetSzoftver method, of class HáziTesztRobot.
     */
    @Test
    public void testÖtvözetGetSzoftvers() {
        System.out.println("Szoftver");
        HáziTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetSzoftver();
        assertEquals(expResult, result);
     
        fail("Ez csak egy prototípus.");
    }

    public abstract class HáziTesztRobotImpl extends HáziTesztRobot {

        /**
         *
         */
        public HáziTesztRobotImpl(String ID, int memoria, String nem, int teljesitmeny, String elv) {
            super(ID, memoria, nem, teljesitmeny, elv);
        }
    }

   

    /**
     * Test of HáziTesztRobot method, of class HáziTesztRobot.
     */
    @Test
    public void testHáziTesztRobot() {
        System.out.println("HáziTesztRobot");
        Robot robot = null;
        HáziTesztRobot instance = new HáziTesztRobotImpl("",0,"",0,"") {
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
        Robot result = instance.HáziTesztRobot(robot);
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of work method, of class HáziTesztRobot.
     */
    @Test
    public void testWork() {
        System.out.println("work");
        HáziTesztRobot instance = new HáziTesztRobotImpl("",0,"",0,"") {
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
     * Test of sleep method, of class HáziTesztRobot.
     */
    @Test
    public void testSleep() {
        System.out.println("sleep");
        HáziTesztRobot instance = new HáziTesztRobotImpl("",0,"",0,"") {
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
     * Test of getSzoftvers method, of class HáziTesztRobot.
     */
    @Test
    public void testGetSzoftvers() {
        System.out.println("Szoftvers");
        HáziTesztRobot instance = new HáziTesztRobotImpl("",0,"",0,"") {
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
        String[] expResult = null;
        String[] result = instance.getSzoftvers();
        assertArrayEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    
    
}
