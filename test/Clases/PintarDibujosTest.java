/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.awt.Graphics;
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
public class PintarDibujosTest {
    
    public PintarDibujosTest() {
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
     * Test of pinta_Circulo method, of class PintarDibujos.
     */
    @Test
    public void testPinta_Circulo() {
        System.out.println("pinta_Circulo");
        Graphics g = null;
        int x = 0;
        int y = 0;
        String n = "";
        PintarDibujos.pinta_Circulo(g, x, y, n);
    }

    /**
     * Test of pinta_Linea method, of class PintarDibujos.
     */
    @Test
    public void testPinta_Linea() {
        System.out.println("pinta_Linea");
        Graphics g = null;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double tam = 0.0;
        PintarDibujos.pinta_Linea(g, x1, y1, x2, y2, tam);
    }

    /**
     * Test of pinta_LineaDistancias method, of class PintarDibujos.
     */
    @Test
    public void testPinta_LineaDistancias() {
        System.out.println("pinta_LineaDistancias");
        Graphics g = null;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double tam = 0.0;
        PintarDibujos.pinta_LineaDistancias(g, x1, y1, x2, y2, tam);
    }

    /**
     * Test of pinta_Camino method, of class PintarDibujos.
     */
    @Test
    public void testPinta_Camino() {
        System.out.println("pinta_Camino");
        Graphics g = null;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        Color color = null;
        PintarDibujos.pinta_Camino(g, x1, y1, x2, y2, color);
    }

    /**
     * Test of seleccionNodo method, of class PintarDibujos.
     */
    @Test
    public void testSeleccionNodo() {
        System.out.println("seleccionNodo");
        Graphics g = null;
        int x = 0;
        int y = 0;
        String n = "";
        Color co = null;
        PintarDibujos.seleccionNodo(g, x, y, n, co);
    }
    
}
