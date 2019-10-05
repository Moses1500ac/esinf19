/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinfTp1;

import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class WorldTest {
    
    public WorldTest() {
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
     * Test of getCountries method, of class World.
     */
    @Test
    public void testGetCountries() {
        System.out.println("getCountries");
        List<String> lCountries = null;
        World instance = new World();
        Set expResult = null;
        Set result = instance.getCountries(lCountries);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCountriesFrontiers method, of class World.
     */
    @Test
    public void testSaveCountriesFrontiers() {
        System.out.println("saveCountriesFrontiers");
        List<String> lFrontiers = null;
        Set<Country> sCountries = null;
        World instance = new World();
        instance.saveCountriesFrontiers(lFrontiers, sCountries);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCtrByName method, of class World.
     */
    @Test
    public void testFindCtrByName() {
        System.out.println("findCtrByName");
        String ctrName = "";
        Set<Country> sCountries = null;
        World instance = new World();
        Country expResult = null;
        Country result = instance.findCtrByName(ctrName, sCountries);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderContinentPopulation method, of class World.
     */
    @Test
    public void testOrderContinentPopulation() {
        System.out.println("orderContinentPopulation");
        String continentName = "";
        double nPopulation = 0.0;
        World instance = new World();
        Set<Country> expResult = null;
        Set<Country> result = instance.orderContinentPopulation(continentName, nPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMap method, of class World.
     */
    @Test
    public void testPrintMap() {
        System.out.println("printMap");
        World instance = new World();
        instance.printMap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of groupByFrontiers method, of class World.
     */
    @Test
    public void testGroupByFrontiers() {
        System.out.println("groupByFrontiers");
        String continentName = "";
        World instance = new World();
        Map expResult = null;
        Map result = instance.groupByFrontiers(continentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPath method, of class World.
     */
    @Test
    public void testFindPath() {
        System.out.println("findPath");
        String origin = "";
        String destination = "";
        World instance = new World();
        int expResult = 0;
        int result = instance.findPath(origin, destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
