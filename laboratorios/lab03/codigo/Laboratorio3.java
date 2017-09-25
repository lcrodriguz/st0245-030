
public class Laboratorio3 {
    public static void main(String[] args)
    {
        Neveras list = new Neveras();
        
        list.insert(0, "lg");
        list.insert(1, "samsung");
        list.insert(2, "mabe");
        list.insert(3, "haceb");
        list.insert(4, "continentales");
        list.insert(5, "lg");
        list.insert(6, "samsung");
        list.insert(7, "mabe");
        list.insert(8, "haceb");
        list.insert(9, "continentales");
        
        Solicitud pet = new Solicitud();
                
        pet.insert(1, "eafit");
        pet.insert(2, "la14");
        pet.insert(2, "exito");
        pet.insert(2, "jumbo");
        pet.insert(2, "homecenter");
       
        Despacho desp = new Despacho(list, pet);
        desp.responder();
    }
}