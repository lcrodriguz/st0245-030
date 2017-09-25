public class Despacho {
    private Neveras neveras;
    private Solicitud solicitud;
    
    public Despacho(Neveras neveras, Solicitud solicitud){
        this.neveras = neveras;
        this.solicitud = solicitud;
    }
    public void responder(){
        for(int j = 0 ; j < solicitud.size() ; j++ ){
        Node pedido = solicitud.getNode(j);
        System.out.println("para la tienda "+pedido.caract+" le corresponden la(s) nevera(s): ");
        for(int i= pedido.dato; i > 0; i--){
            Node nevera = neveras.getNode(neveras.size()-1);
            System.out.println("ref: "+ nevera.dato +" de la marca: " + nevera.caract);
            neveras.remove(neveras.size()-1);
        }
    }
}
}