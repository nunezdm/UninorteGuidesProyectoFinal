/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package main;

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
public class ManejadorMatrizTest {
    
    public ManejadorMatrizTest() {
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
     * Test of obtenerMatrizAdyacencia method, of class ManejadorMatriz.
     */
    @Test
    public void testObtenerMatrizAdyacencia() {
        System.out.println("obtenerMatrizAdyacencia");
        ManejadorMatriz instance = new ManejadorMatriz();
        int[][] expResult = null;
        int[][] result = instance.obtenerMatrizAdyacencia();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of obtenerMatrizCoeficiente method, of class ManejadorMatriz.
     */
    @Test
    public void testObtenerMatrizCoeficiente() {
        System.out.println("obtenerMatrizCoeficiente");
        ManejadorMatriz instance = new ManejadorMatriz();
        double[][] expResult = null;
        double[][] result = instance.obtenerMatrizCoeficiente();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of obtenerCoordX method, of class ManejadorMatriz.
     */
    @Test
    public void testObtenerCoordX() {
        System.out.println("obtenerCoordX");
        ManejadorMatriz instance = new ManejadorMatriz();
        int[] expResult = null;
        int[] result = instance.obtenerCoordX();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of obtenerCoordY method, of class ManejadorMatriz.
     */
    @Test
    public void testObtenerCoordY() {
        System.out.println("obtenerCoordY");
        ManejadorMatriz instance = new ManejadorMatriz();
        int[] expResult = null;
        int[] result = instance.obtenerCoordY();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of obtenerEtiquetaNodos method, of class ManejadorMatriz.
     */
    @Test
    public void testObtenerEtiquetaNodos() {
        System.out.println("obtenerEtiquetaNodos");
        ManejadorMatriz instance = new ManejadorMatriz();
        String[] expResult = null;
        String[] result = instance.obtenerEtiquetaNodos();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of obtenerLugarNodo method, of class ManejadorMatriz.
     */
    @Test
    public void testObtenerLugarNodo() {
        System.out.println("obtenerLugarNodo");
        ManejadorMatriz instance = new ManejadorMatriz();
        String[] expResult = null;
        String[] result = instance.obtenerLugarNodo();
        assertArrayEquals(expResult, result);
    }
    
}
