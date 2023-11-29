/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Ventanas;

import Clases.DatosGraficos;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jalil
 */
public class InicioTest {
    
    public InicioTest() {
    }

    @Test
    public void testPintarFiguras() {
        System.out.println("PintarFiguras");
        int tope = 0;
        DatosGraficos arboles = null;
        Inicio.PintarFiguras(tope, arboles);
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Inicio.main(args);
        
    }
    
}
