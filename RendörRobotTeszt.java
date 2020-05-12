package robot1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import robot1.RendörTesztRobotTest;

/**
 *
 * @author Dani
 */
public class RendörTesztRobotTest {
    
    public RendörTesztRobotTest() {
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
     * Test of ötvözetKiir method, of class RendörTesztRobot.
     */
    @Test
    public void testÖtvözetKiir() {
        System.out.println("Kiir");
        RendörTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetKiir();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetID method, of class RendörTesztRobot.
     */
    @Test
    public void testÖtvözetGetID() {
        System.out.println("ID");
        RendörTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetID();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetMemoria method, of class RendörTesztRobot.
     */
    @Test
    public void testÖtvözetGetMemoria() {
        System.out.println("Memória");
        RendörTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetMemoria();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetNem method, of class RendörTesztRobot.
     */
    @Test
    public void testÖtvözetGetNem() {
        System.out.println("Nem");
        RendörTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetNem();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetTeljesitmeny method, of class RendörTesztRobot.
     */
    @Test
    public void testÖtvözetGetTeljesitmeny() {
        System.out.println("Teljesítmény");
        RendörTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetTeljesitmeny();
        assertEquals(expResult, result);
     
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetElv method, of class RendörTesztRobot.
     */
    @Test
    public void testÖtvözetGetElv() {
        System.out.println("Elvek");
        RendörTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetElv();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetSzoftver method, of class RendörTesztRobot.
     */
    @Test
    public void testÖtvözetGetSzoftvers() {
        System.out.println("Szoftver");
        RendörTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetSzoftver();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    public abstract class RendörTesztRobotImpl extends RendörTesztRobot {

        public RendörTesztRobotImpl(String ID, int memoria, String nem, int teljesitmeny, String elv) {
            super(ID, memoria, nem, teljesitmeny, elv);
        }
    }

    

    /**
     * Test of RendörTesztRobot method, of class RendörTesztRobot.
     */
    @Test
    public void testRendörTesztRobot() {
        System.out.println("RendőrTesztRobot");
        Robot robot = null;
        RendörTesztRobot instance = new RendörTesztRobotImpl("",0,"",0,"") {
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
        Robot result = instance.RendörTesztRobot(robot);
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of work method, of class RendörTesztRobot.
     */
    @Test
    public void testWork() {
        System.out.println("work");
        RendörTesztRobot instance = new RendörTesztRobotImpl("",0,"",0,"") {
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
     * Test of sleep method, of class RendörTesztRobot.
     */
    @Test
    public void testSleep() {
        System.out.println("sleep");
        RendörTesztRobot instance = new RendörTesztRobotImpl("",0,"",0,"") {
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
}
