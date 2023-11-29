/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Ventanas;

import Clases.DatosGraficos;
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
public class MostrarDibujosTest {
    
    public MostrarDibujosTest() {
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
     * Test of R_repaint method, of class MostrarDibujos.
     */
    @Test
    public void testR_repaint() {
        System.out.println("R_repaint");
        int tope = 0;
        DatosGraficos arboles = null;
        MostrarDibujos.R_repaint(tope, arboles);
    }
    
}
