/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinfTp1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tiago
 */
public class CountryTest {
    
    public CountryTest() {
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
     * Test of getCtrName method, of class Country.
     */
    @Test
    public void testGetCtrName() {
        System.out.println("getCtrName");
        Country instance = null;
        String expResult = "";
        String result = instance.getCtrName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCtrName method, of class Country.
     */
    @Test
    public void testSetCtrName() {
        System.out.println("setCtrName");
        String ctrName = "";
        Country instance = null;
        instance.setCtrName(ctrName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtrContinent method, of class Country.
     */
    @Test
    public void testGetCtrContinent() {
        System.out.println("getCtrContinent");
        Country instance = null;
        String expResult = "";
        String result = instance.getCtrContinent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCtrContinent method, of class Country.
     */
    @Test
    public void testSetCtrContinent() {
        System.out.println("setCtrContinent");
        String ctrContinent = "";
        Country instance = null;
        instance.setCtrContinent(ctrContinent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtrPopulation method, of class Country.
     */
    @Test
    public void testGetCtrPopulation() {
        System.out.println("getCtrPopulation");
        Country instance = null;
        double expResult = 0.0;
        double result = instance.getCtrPopulation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCtrPopulation method, of class Country.
     */
    @Test
    public void testSetCtrPopulation() {
        System.out.println("setCtrPopulation");
        int ctrPopulation = 0;
        Country instance = null;
        instance.setCtrPopulation(ctrPopulation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtrCapital method, of class Country.
     */
    @Test
    public void testGetCtrCapital() {
        System.out.println("getCtrCapital");
        Country instance = null;
        String expResult = "";
        String result = instance.getCtrCapital();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCtrCapital method, of class Country.
     */
    @Test
    public void testSetCtrCapital() {
        System.out.println("setCtrCapital");
        String ctrCapital = "";
        Country instance = null;
        instance.setCtrCapital(ctrCapital);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtrLatitude method, of class Country.
     */
    @Test
    public void testGetCtrLatitude() {
        System.out.println("getCtrLatitude");
        Country instance = null;
        double expResult = 0.0;
        double result = instance.getCtrLatitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCtrLatitude method, of class Country.
     */
    @Test
    public void testSetCtrLatitude() {
        System.out.println("setCtrLatitude");
        double ctrLatitude = 0.0;
        Country instance = null;
        instance.setCtrLatitude(ctrLatitude);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtrLongitude method, of class Country.
     */
    @Test
    public void testGetCtrLongitude() {
        System.out.println("getCtrLongitude");
        Country instance = null;
        double expResult = 0.0;
        double result = instance.getCtrLongitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCtrLongitude method, of class Country.
     */
    @Test
    public void testSetCtrLongitude() {
        System.out.println("setCtrLongitude");
        double ctrLongitude = 0.0;
        Country instance = null;
        instance.setCtrLongitude(ctrLongitude);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Country.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Country instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Country.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Country instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Country.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Country t = null;
        Country instance = null;
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Country.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Country instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisited method, of class Country.
     */
    @Test
    public void testGetVisited() {
        System.out.println("getVisited");
        Country instance = null;
        instance.getVisited();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deVisited method, of class Country.
     */
    @Test
    public void testDeVisited() {
        System.out.println("deVisited");
        Country instance = null;
        instance.deVisited();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNotVisited method, of class Country.
     */
    @Test
    public void testIsNotVisited() {
        System.out.println("isNotVisited");
        Country instance = null;
        boolean expResult = false;
        boolean result = instance.isNotVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
