
/**
 *
 * @author andrescedeno
 */
public class NodoCatalogoAsientos {
    private DatosCatalogoAsientos elemento;
    private NodoCatalogoAsientos siguiente;
    private NodoCatalogoAsientos anterior;
    
    public NodoCatalogoAsientos(){
        this.siguiente = null;
        this.anterior = null;
    }

    public DatosCatalogoAsientos getElemento() {
        return elemento;
    }

    public void setElemento(DatosCatalogoAsientos elemento) {
        this.elemento = elemento;
    }

    public NodoCatalogoAsientos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCatalogoAsientos siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCatalogoAsientos getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCatalogoAsientos anterior) {
        this.anterior = anterior;
    }   
}
