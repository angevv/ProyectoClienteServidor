

/**
 *
 * @author andrescedeno
 */
public class NodoCatalogoEvento {
    private DatosCatalogoEvento elemento;
    private NodoCatalogoEvento siguiente;
    
    public NodoCatalogoEvento(){
        this.siguiente = null;
    }

    public DatosCatalogoEvento getElemento() {
        return elemento;
    }

    public void setElemento(DatosCatalogoEvento elemento) {
        this.elemento = elemento;
    }

    public NodoCatalogoEvento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCatalogoEvento siguiente) {
        this.siguiente = siguiente;
    }
}
