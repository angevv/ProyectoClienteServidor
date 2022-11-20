
public class NodoA {
    private DatosVentas elemento;
    private NodoA enlaceIzq;
    private NodoA enlaceDer;
    
    public NodoA(){
        this.enlaceIzq=null;
        this.enlaceDer=null;
    }

    public DatosVentas getElemento() {
        return elemento;
    }

    public void setElemento(DatosVentas elemento) {
        this.elemento = elemento;
    }

    public NodoA getEnlaceIzq() {
        return enlaceIzq;
    }

    public void setEnlaceIzq(NodoA enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }

    public NodoA getEnlaceDer() {
        return enlaceDer;
    }

    public void setEnlaceDer(NodoA enlaceDer) {
        this.enlaceDer = enlaceDer;
    }
    
}
