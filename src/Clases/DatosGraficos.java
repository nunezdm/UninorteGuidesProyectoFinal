package Clases;

public class DatosGraficos {

    private final double MatrizCoeficiente[][] = new double[100][100];
    private final int MatrizAdyacencia[][] = new int[100][100];
    private final int cordenadaX[] = new int[100];
    private final int cordenadaY[] = new int[100];
    private final String nombre[] = new String[100];
    private int enArbol[];

    
    public DatosGraficos() {

    }

    public double getmCoeficiente(int i, int j) {
        return MatrizCoeficiente[i][j];
    }

    public int getmAdyacencia(int i, int j) {
        return MatrizAdyacencia[i][j];
    }

    public int getCordeX(int i) {
        return cordenadaX[i];
    }

    public int getCordeY(int i) {
        return cordenadaY[i];
    }

    public String getNombre(int i) {
        return nombre[i];
    }

    public int getEnArbol(int i) {
        return enArbol[i];
    }

    public void setmCoeficiente(int i, int j, double mCoeficiente) {
        this.MatrizCoeficiente[i][j] = mCoeficiente;
    }

    public void setmAdyacencia(int i, int j, int mAdyacencia) {
        this.MatrizAdyacencia[i][j] = mAdyacencia;
    }

    public void setCordeX(int i, int cordeX) {
        this.cordenadaX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.cordenadaY[i] = cordeY;
    }

    public void setNombre(int i, String nombre) {
        this.nombre[i] = nombre;
    }

    public void setEnArbol(int i, int enArbol) {
        this.enArbol[i] = enArbol;
    }

    public void crearEnArbol(int i) {
        enArbol = new int[i];
    }

}
