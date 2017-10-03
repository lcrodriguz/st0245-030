import java.util.*;
//Una tabla de hash donde la llave es un String y el valor un int.
public class UnaTablaDeHash
{
    // Ojo, esta tabla definida así no permite manejar las colisiones
    private LinkedList<String>[] tabla;

    public UnaTablaDeHash(){
    tabla = new LinkedList<String>[10];

        for(int i=0; i<10; i++){
            tabla[i] = new LinkedList<String>();
        } 
    }

    // Ojo, esta función hash es muy ingenua
    private int funcionHash(String k){
        int temp=((int) k.charAt(0)) % 10;
        return temp;
    }

    // Ojo con las colisiones
    public int get(String k){
         System.out.println(tabla[funcionHash(k)]);
        return funcionHash(k);
    }

    // Ojo con las colisiones
    public void put(String k, int v){
        String a= Integer.toString(v);
        tabla[funcionHash(k)].add(a);
    }
}