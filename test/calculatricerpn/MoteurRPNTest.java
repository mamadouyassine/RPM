/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricerpn;

import java.util.Stack;
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
public class MoteurRPNTest {
    
    public MoteurRPNTest() {
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
     * Test of enregistrer method, of class MoteurRPN.
     */
    @Test
    public void testEnregistrer() {
        System.out.println("enregistrer");
        Double value = null;
        MoteurRPN instance = new MoteurRPN();
        instance.enregistrer(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcul method, of class MoteurRPN.
     */
    @Test
    public void testCalcul() {
        System.out.println("calcul");
        Operation op = null;
        MoteurRPN instance = new MoteurRPN();
        instance.calcul(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class MoteurRPN.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        MoteurRPN instance = new MoteurRPN();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depile method, of class MoteurRPN.
     */
    @Test
    public void testDepile() {
        System.out.println("depile");
        MoteurRPN instance = new MoteurRPN();
        double expResult = 0.0;
        double result = instance.depile();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nbrOperande method, of class MoteurRPN.
     */
    @Test
    public void testNbrOperande() {
        System.out.println("nbrOperande");
        MoteurRPN instance = new MoteurRPN();
        int expResult = 0;
        int result = instance.nbrOperande();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getP method, of class MoteurRPN.
     */
    @Test
    public void testGetP() {
        System.out.println("getP");
        MoteurRPN instance = new MoteurRPN();
        Stack<Double> expResult = null;
        Stack<Double> result = instance.getP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
