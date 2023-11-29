package Ventanas;

import Clases.DatosGraficos;
import Clases.PintarDibujos;
import static Ventanas.Inicio.jPanel1;

public class MostrarDibujos {
    private final int tope=0;// lleva el # de nodos creado 
    
    public static void R_repaint(int tope, DatosGraficos arboles){//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if(arboles.getmAdyacencia(j, k) == 1)
                    PintarDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
              }
        }
        for (int j = 0; j < tope; j++) 
            PintarDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j),arboles.getCordeY(j),String.valueOf(arboles.getNombre(j)));
                
   }
}
