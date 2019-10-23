/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricerpn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class CalculatriceRPNTest {
    
    public CalculatriceRPNTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    System.out.println("avant tout");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("après tout");
    }
    
    @Before
    public void setUp() {
        System.out.println("avant un test");
    }
    
    @After
    public void tearDown() {
        System.out.println("après un test");
    }

    /**
     * Test of values method, of class CalculatriceRPN.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        CalculatriceRPN[] expResult = null;
        CalculatriceRPN[] result = CalculatriceRPN.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class CalculatriceRPN.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        CalculatriceRPN expResult = null;
        CalculatriceRPN result = CalculatriceRPN.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CalculatriceRPN.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatriceRPN.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
