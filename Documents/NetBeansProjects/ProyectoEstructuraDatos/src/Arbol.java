
public class Arbol {
    private NodoA raiz;
    
    public Arbol(){
        this.raiz=null;
    }
    
    public boolean esVacioArbol(){
        if(raiz==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void inserta(String numVenta, String nomEvento, String fecha, String hora, String nomUsuario, String cantAsientos, String monto){
        DatosVentas d = new DatosVentas();
        int numV=Integer.parseInt(numVenta);
        d.setNumVenta(numV);
        d.setEvento(nomEvento);
        d.setFecha(fecha);
        d.setHora(hora);
        d.setNomUsuario(nomUsuario);
        int cantA=Integer.parseInt(cantAsientos);
        d.setCantAsientos(cantA);
        double montoPagar=Double.parseDouble(monto);
        d.setMontoPagar(montoPagar);
        NodoA nuevo = new NodoA();
        nuevo.setElemento(d);
        if(esVacioArbol()){
            raiz=nuevo;
        }else{
            insertarNuevo(raiz, nuevo);
        }
    }
    
    public void insertarNuevo(NodoA raiz, NodoA nuevo){
        if(nuevo.getElemento().getNumVenta()<=raiz.getElemento().getNumVenta()){
            if(raiz.getEnlaceIzq()==null){
                raiz.setEnlaceIzq(nuevo);
            }else{
                insertarNuevo(raiz.getEnlaceIzq(),nuevo);
            }
        }else{
            if(raiz.getEnlaceDer()==null){
                raiz.setEnlaceDer(nuevo);
            }else{
                insertarNuevo(raiz.getEnlaceDer(),nuevo);
            }
        }
    }
   
}
