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
public class SaisieRPNTest {
    
    public SaisieRPNTest() {
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
     * Test of getMoteur method, of class SaisieRPN.
     */
    @Test
    public void testGetMoteur() {
        System.out.println("getMoteur");
        SaisieRPN instance = new SaisieRPN();
        MoteurRPN expResult = null;
        MoteurRPN result = instance.getMoteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsOperande method, of class SaisieRPN.
     */
    @Test
    public void testIsOperande() {
        System.out.println("IsOperande");
        String sign = "";
        SaisieRPN instance = new SaisieRPN();
        boolean expResult = false;
        boolean result = instance.IsOperande(sign);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsClean method, of class SaisieRPN.
     */
    @Test
    public void testIsClean() {
        System.out.println("IsClean");
        String sign = "";
        SaisieRPN instance = new SaisieRPN();
        boolean expResult = false;
        boolean result = instance.IsClean(sign);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsUndo method, of class SaisieRPN.
     */
    @Test
    public void testIsUndo() {
        System.out.println("IsUndo");
        String sign = "";
        SaisieRPN instance = new SaisieRPN();
        boolean expResult = false;
        boolean result = instance.IsUndo(sign);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saisie method, of class SaisieRPN.
     */
    @Test
    public void testSaisie() throws Exception {
        System.out.println("saisie");
        SaisieRPN instance = new SaisieRPN();
        instance.saisie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signe method, of class SaisieRPN.
     */
    @Test
    public void testSigne() {
        System.out.println("signe");
        String sign = "";
        SaisieRPN instance = new SaisieRPN();
        Operation expResult = null;
        Operation result = instance.signe(sign);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
