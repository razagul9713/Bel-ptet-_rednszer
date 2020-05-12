package robot1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import robot1.IrodaiTesztRobotTest;

/**
 *
 * @author Dani
 */
public class IrodaiTesztRobotTest {
    
    public IrodaiTesztRobotTest() {
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
     * Test of ötvözetKiir method, of class IrodaiTesztRobot.
     */
    @Test
    public void testÖtvözetKiir() {
        System.out.println("Kiir");
        IrodaiTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetKiir();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetID method, of class IrodaiTesztRobot.
     */
    @Test
    public void testÖtvözetGetID() {
        System.out.println("getID");
        IrodaiTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetID();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetMemoria method, of class IrodaiTesztRobot.
     */
    @Test
    public void testÖtvözetGetMemoria() {
        System.out.println("GetMemoria");
        IrodaiTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetMemoria();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetNem method, of class IrodaiTesztRobot.
     */
    @Test
    public void testÖtvözetGetNem() {
        System.out.println("GetNem");
        IrodaiTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetNem();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetTeljesitmeny method, of class IrodaiTesztRobot.
     */
    @Test
    public void testÖtvözetGetTeljesitmeny() {
        System.out.println("GetTeljesitmeny");
        IrodaiTesztRobot instance = null;
        int expResult = 0;
        int result = instance.ötvözetGetTeljesitmeny();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetElv method, of class IrodaiTesztRobot.
     */
    @Test
    public void testÖtvözetGetElv() {
        System.out.println("GetElv");
        IrodaiTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetElv();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of ötvözetGetSzoftver method, of class IrodaiTesztRobot.
     */
    @Test
    public void testÖtvözetGetSzoftver() {
        System.out.println("GetSzoftver");
        IrodaiTesztRobot instance = null;
        String expResult = "";
        String result = instance.ötvözetGetSzoftver();
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

   

   

    /**
     * Test of IrodaiTesztRobot method, of class IrodaiTesztRobot.
     */
    @Test
    public void testIrodaiTesztRobot() {
        System.out.println("IrodaiTesztRobot");
        Robot robot = null;
        IrodaiTesztRobot instance = null;
        Robot expResult = null;
        Robot result = instance.IrodaiTesztRobot(robot);
        assertEquals(expResult, result);
        
        fail("Ez csak egy prototípus.");
    }

    /**
     * Test of getSzoftvers method, of class IrodaiTesztRobot.
     */
    @Test
    public void testGetSzoftvers() {
        System.out.println("getSzoftvers");
        IrodaiTesztRobot instance = new IrodaiTesztRobot("",0,"",0,"") {
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
    /**
     * Test of ötvözetGetMemoria method, of class SzereloTesztRobot.
     */
    @Test
    public void testWork(){
         System.out.println("work");
         IrodaiTesztRobot instance = new IrodaiTesztRobotImpl("",0,"",0,"") {
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
         System.out.println("work");
         IrodaiTesztRobot instance = new IrodaiTesztRobotImpl("",0,"",0,"") {
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

    
    public abstract class IrodaiTesztRobotImpl extends IrodaiTesztRobot {
   
        public IrodaiTesztRobotImpl(String ID, int memoria, String nem, int teljesitmeny, String elv) {
            super(ID, memoria, nem, teljesitmeny, elv);
        }
    }
    
}
