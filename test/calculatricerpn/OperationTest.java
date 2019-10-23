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
public class OperationTest {
    
    public OperationTest() {
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
     * Test of values method, of class Operation.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Operation[] expResult = null;
        Operation[] result = Operation.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Operation.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Operation expResult = null;
        Operation result = Operation.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsymbole method, of class Operation.
     */
    @Test
    public void testGetsymbole() {
        System.out.println("getsymbole");
        Operation instance = null;
        String expResult = "";
        String result = instance.getsymbole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class Operation.
     */
    @Test
    public void testEval() {
        System.out.println("eval");
        double a = 0.0;
        double b = 0.0;
        Operation instance = null;
        double expResult = 0.0;
        double result = instance.eval(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class OperationImpl extends Operation {

        public double eval(double a, double b) {
            return 0.0;
        }
    }
    
}
