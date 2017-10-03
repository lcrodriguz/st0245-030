import java.util.*;

public class Taller9{
    //pedrito 1
    public static void agregar(Hashtable empresas,String key, String value){
        empresas.put(key, value);
    }
    //pedrito 2
    public static void buscar(Hashtable empresas,String key){
        System.out.println("el pais de la empresa dada es: "+empresas.get(key));
    }
    //pedrito 3
    public static boolean contienekey(Hashtable empresas,String value){
        boolean temp=false;
            if(empresas.containsValue(value)==true){
                temp=true;
        } 
        System.out.println(temp);
        return temp;
    }

    public static void main(String [] args ){
        Hashtable<String,String> contenedor=new Hashtable<String,String>();
        agregar(contenedor, "google", "EEUU");
        agregar(contenedor,"la locura", "colombia");
        agregar(contenedor,"nokia", "finlandia");
        agregar(contenedor,"sony", "japon");

        buscar(contenedor, "sony");
        
        contienekey(contenedor, "EEUU");

    }
}