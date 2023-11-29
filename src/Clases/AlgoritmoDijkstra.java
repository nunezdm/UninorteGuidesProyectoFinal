package Clases;

import static Ventanas.Inicio.PintarFiguras;
import static Ventanas.Inicio.jPanel1;
import java.awt.Color;


public class AlgoritmoDijkstra {

    private final DatosGraficos arboles;
    private int subTope;
    private Nodo Nodoauxiliar = null;
    private double auxiliarAumulado; //Es un acumulado auxiliar
    private double subtotalAcomulado;
    private final Nodo nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;
    
        // Definir un color personalizado con valores RGB
        static Color colorOrigen = new Color(85, 182, 255);
        static Color colorDestino = new Color(255, 41, 26);
        static Color colorCamino = new Color(6, 31, 64);
        
    public AlgoritmoDijkstra(DatosGraficos arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Nodo[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;

    }

    public double getAcumulado() {
        return nodo[nodoFinal].getAcumulado();
    }

    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }

    public void dijkstra() {
        for (int i = 0; i < tope; i++) // Vector del tamaño del numero de Nodos 
        {
            nodo[i] = new Nodo();
        }
            jPanel1.paint(jPanel1.getGraphics());
            PintarFiguras(tope, arboles);

            int staticOrigen = Origen;
            
            nodo[Origen].setVisitado(true);
            nodo[Origen].setNombre(Origen);

            do {
                subtotalAcomulado = 0;
                auxiliarAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, a la que nunca sera mayor 
                nodo[Origen].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, Origen) == 1) {
                        subtotalAcomulado = nodo[Origen].getAcumulado() + arboles.getmCoeficiente(j, Origen);
                        
                        if (subtotalAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        } else if (nodo[j].isVisitado() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        }
                    }
                }
                
                //Encontrando Camino mas corto
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxiliarAumulado) {
                            Origen = nodo[i].getNombre();
                            auxiliarAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);

            Nodoauxiliar = nodo[nodoFinal];
            
            //Pintando caminos recorridos
            while (Nodoauxiliar.getPredecesor() != null) {
                PintarDibujos.pinta_Camino(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()),
                        arboles.getCordeY(Nodoauxiliar.getNombre()),
                        arboles.getCordeX(Nodoauxiliar.getPredecesor().getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);
                
                PintarDibujos.seleccionNodo(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getNombre()), null, colorCamino);
                Nodoauxiliar = Nodoauxiliar.getPredecesor();
            }//fin de while Recorriendo caminos
            
            PintarDibujos.seleccionNodo(jPanel1.getGraphics(), 
                arboles.getCordeX(staticOrigen), 
                arboles.getCordeY(staticOrigen), null, colorOrigen); //Pintando Nodo de Origen
            
            PintarDibujos.seleccionNodo(jPanel1.getGraphics(), 
                arboles.getCordeX(nodoFinal), 
                arboles.getCordeY(nodoFinal), null, colorDestino);//Pintando Nodo de Destino
        
    }

}
