/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jalil
 */
public class DatosGraficosTest {
    
    public DatosGraficosTest() {
    }

    @Test
    public void testGetmCoeficiente() {
        System.out.println("getmCoeficiente");
        int i = 0;
        int j = 0;
        DatosGraficos instance = new DatosGraficos();
        double expResult = 0.0;
        double result = instance.getmCoeficiente(i, j);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetmAdyacencia() {
        System.out.println("getmAdyacencia");
        int i = 0;
        int j = 0;
        DatosGraficos instance = new DatosGraficos();
        int expResult = 0;
        int result = instance.getmAdyacencia(i, j);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCordeX() {
        System.out.println("getCordeX");
        int i = 0;
        DatosGraficos instance = new DatosGraficos();
        int expResult = 0;
        int result = instance.getCordeX(i);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCordeY() {
        System.out.println("getCordeY");
        int i = 0;
        DatosGraficos instance = new DatosGraficos();
        int expResult = 0;
        int result = instance.getCordeY(i);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        int i = 0;
        DatosGraficos instance = new DatosGraficos();
        String expResult = "";
        String result = instance.getNombre(i);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEnArbol() {
        System.out.println("getEnArbol");
        int i = 0;
        DatosGraficos instance = new DatosGraficos();
        int expResult = 0;
        int result = instance.getEnArbol(i);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetmCoeficiente() {
        System.out.println("setmCoeficiente");
        int i = 0;
        int j = 0;
        double mCoeficiente = 0.0;
        DatosGraficos instance = new DatosGraficos();
        instance.setmCoeficiente(i, j, mCoeficiente);
    }

    @Test
    public void testSetmAdyacencia() {
        System.out.println("setmAdyacencia");
        int i = 0;
        int j = 0;
        int mAdyacencia = 0;
        DatosGraficos instance = new DatosGraficos();
        instance.setmAdyacencia(i, j, mAdyacencia);
    }

    @Test
    public void testSetCordeX() {
        System.out.println("setCordeX");
        int i = 0;
        int cordeX = 0;
        DatosGraficos instance = new DatosGraficos();
        instance.setCordeX(i, cordeX);
    }

    @Test
    public void testSetCordeY() {
        System.out.println("setCordeY");
        int i = 0;
        int cordeY = 0;
        DatosGraficos instance = new DatosGraficos();
        instance.setCordeY(i, cordeY);
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        int i = 0;
        String nombre = "";
        DatosGraficos instance = new DatosGraficos();
        instance.setNombre(i, nombre);
    }

    @Test
    public void testSetEnArbol() {
        System.out.println("setEnArbol");
        int i = 0;
        int enArbol = 0;
        DatosGraficos instance = new DatosGraficos();
        instance.setEnArbol(i, enArbol);
    }

    @Test
    public void testCrearEnArbol() {
        System.out.println("crearEnArbol");
        int i = 0;
        DatosGraficos instance = new DatosGraficos();
        instance.crearEnArbol(i);
    }
    
}
