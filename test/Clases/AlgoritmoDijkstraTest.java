/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jalil
 */
public class AlgoritmoDijkstraTest {
    
    public AlgoritmoDijkstraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAcumulado method, of class AlgoritmoDijkstra.
     */
    @Test
    public void testGetAcumulado() {
        System.out.println("getAcumulado");
        AlgoritmoDijkstra instance = null;
        double expResult = 0.0;
        double result = instance.getAcumulado();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getNombre method, of class AlgoritmoDijkstra.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        AlgoritmoDijkstra instance = null;
        int expResult = 0;
        int result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of dijkstra method, of class AlgoritmoDijkstra.
     */
    @Test
    public void testDijkstra() {
        System.out.println("dijkstra");
        AlgoritmoDijkstra instance = null;
        instance.dijkstra();
    }
    
}
