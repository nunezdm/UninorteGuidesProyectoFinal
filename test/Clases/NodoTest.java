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
public class NodoTest {
    
    public NodoTest() {
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
     * Test of getNombre method, of class Nodo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Nodo instance = new Nodo();
        int expResult = 0;
        int result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of isVisitado method, of class Nodo.
     */
    @Test
    public void testIsVisitado() {
        System.out.println("isVisitado");
        Nodo instance = new Nodo();
        boolean expResult = false;
        boolean result = instance.isVisitado();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEtiqueta method, of class Nodo.
     */
    @Test
    public void testIsEtiqueta() {
        System.out.println("isEtiqueta");
        Nodo instance = new Nodo();
        boolean expResult = false;
        boolean result = instance.isEtiqueta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAcumulado method, of class Nodo.
     */
    @Test
    public void testGetAcumulado() {
        System.out.println("getAcumulado");
        Nodo instance = new Nodo();
        double expResult = 0.0;
        double result = instance.getAcumulado();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getPredecesor method, of class Nodo.
     */
    @Test
    public void testGetPredecesor() {
        System.out.println("getPredecesor");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getPredecesor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Nodo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        int nombre = 0;
        Nodo instance = new Nodo();
        instance.setNombre(nombre);
    }

    /**
     * Test of setVisitado method, of class Nodo.
     */
    @Test
    public void testSetVisitado() {
        System.out.println("setVisitado");
        boolean visitado = false;
        Nodo instance = new Nodo();
        instance.setVisitado(visitado);
    }

    /**
     * Test of setEtiqueta method, of class Nodo.
     */
    @Test
    public void testSetEtiqueta() {
        System.out.println("setEtiqueta");
        boolean etiqueta = false;
        Nodo instance = new Nodo();
        instance.setEtiqueta(etiqueta);
    }

    /**
     * Test of setAcumulado method, of class Nodo.
     */
    @Test
    public void testSetAcumulado() {
        System.out.println("setAcumulado");
        double acomulado = 0.0;
        Nodo instance = new Nodo();
        instance.setAcumulado(acomulado);
    }

    /**
     * Test of setPredecesor method, of class Nodo.
     */
    @Test
    public void testSetPredecesor() {
        System.out.println("setPredecesor");
        Nodo Predecesor = null;
        Nodo instance = new Nodo();
        instance.setPredecesor(Predecesor);
    }
    
}
