
/**
 *
 * @author andrescedeno
 */
public class NodoCatalogoAsientos {
    private DatosCatalogoAsientos elemento;
    private NodoCatalogoAsientos siguiente;
    
    public NodoCatalogoAsientos(){
        this.siguiente = null;
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
}
