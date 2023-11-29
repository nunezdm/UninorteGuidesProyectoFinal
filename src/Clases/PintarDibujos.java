package Clases;

import main.ManejadorMatriz;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class PintarDibujos {

    static ManejadorMatriz manejadorMatriz = new ManejadorMatriz();
    
    public PintarDibujos() {

    }
    
    // Definir un color personalizado con valores RGB
        static Color colorLinea = new Color(10, 60, 125);
        static Color colorNodo = new Color(0, 93, 165);
        static Color colorNodoSeleccionado = new Color(6, 31, 64);

    public static void pinta_Circulo(Graphics g, int x, int y, String n) {
        ((Graphics2D) g).setColor(colorNodo); //Color al cirulo
        ((Graphics2D) g).setStroke(new BasicStroke(1)); //Cambia grosor del circulo        
        ((Graphics2D) g).fillOval(x, y, 15, 15); 
        ((Graphics2D) g).setColor(colorNodo);

        ((Graphics2D) g).setColor(Color.BLACK);
        Font fuente = new Font("Monospaced", Font.BOLD, 16);
        g.setFont(fuente);
        
        String lugares[] = manejadorMatriz.obtenerLugarNodo();
   
        for (int i = 0; i < 60; i++) {
           String aux = String.valueOf(i+1);
           if (aux.equals(n)) {
                ((Graphics2D) g).drawString(lugares[i], x, y);
            }  
        }
    }

    
    public static void pinta_Linea(Graphics g, int x1, int y1, int x2, int y2, double tam) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1);
        ((Graphics2D) g).setColor(colorLinea);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
    }
    
    public static void pinta_LineaDistancias(Graphics g, int x1, int y1, int x2, int y2, double tam) {
        int xAux = 0;
        int yAux = 0;
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        // Esta parte del codigo añade las distancias entre los nodos
        if (x1 <= x2) {
            xAux = ((x2 - x1) / 2) + x1;
        }
        if (x1 > x2) {
            xAux = ((x1 - x2) / 2) + x2;
        }
        if (y1 < y2) {
            yAux = ((y2 - y1) / 2) + y1;
        }
        if (y1 >= y2) {
            yAux = ((y1 - y2) / 2) + y2;
        }
        ((Graphics2D)g).setColor(Color.BLUE);
        Font fuente = new Font("Monospaced", Font.PLAIN, 12);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(String.valueOf(tam), xAux, yAux);
    }

    public static void pinta_Camino(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(3);
        ((Graphics2D) g).setStroke(stroke);
        g.setColor(colorNodoSeleccionado);
        g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        
    }
    public static void seleccionNodo(Graphics g, int x, int y, String n, Color co) {
        
        ((Graphics2D) g).setColor(co);
        ((Graphics2D) g).setStroke(new BasicStroke(2));//Grosor contorno al circulo        
        ((Graphics2D) g).fillOval(x, y, 15, 15);//Tamaño del circulo
        ((Graphics2D) g).setColor(colorNodoSeleccionado);
        ((Graphics2D) g).drawOval(x, y, 15, 15);

    }
}
