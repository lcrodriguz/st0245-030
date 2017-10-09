import java.util.*;

/*en este programa se ha identificado cada factor de la siguente manera:
 * los cajeros con numeros (int)
 * las filas de los clientes como colas (queue)
 * y las filas en general como otra cola, la cual se ira desgastando una por una (queue)
 */
public class Banco{
    
    Queue [] filas = new Queue[3];
    
    public static boolean vacio(Queue<String> cola){
        return cola.isEmpty();
    }

    public static void simular(Queue<String> fila1, Queue<String> fila2, Queue<String> fila3, Queue<String> fila4){
        boolean  control = false;
        Queue[] clientes = {fila1, fila2, fila3, fila4};        
        while(control != true){          
            for(int i = 0; i < clientes.length; i++){                       
                int j = 1;
                if(vacio(fila1) && vacio(fila2) && vacio(fila3) && vacio(fila4)){
                    control = true;
                    break;
                }
                else if(vacio(clientes[i])){
                    while(vacio(clientes[i])){ 
                        if(i>=3){
                            i=0;
                        }
                        else{
                            i++;
                        }
                    }
                    System.out.println(j + ". " + clientes[i].poll());
                } 
                else{ 
                    System.out.println(j + ". " + clientes[i].poll());
                }
                j = 2;
                i++;
                if(i>3){
                    i=0;
                }
                if(vacio(clientes[i])){ 
                    while(vacio(clientes[i])){
                        if(i>=3){
                            i=0;
                        }
                        else{
                            i++;
                        }
                    }
                    System.out.println(j + ". " + clientes[i].poll());
                } 
                else{
                    System.out.println(j + ". " + clientes[i].poll());
                }
            }  
        }
    }
}