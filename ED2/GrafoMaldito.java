



/** Basado en el algoritmo de greedy
 * coloramieno de grafos basado en listas de adyacencia
 * @author Alejandro Roman
 * @author Luis Carlos Rodriguez
 */
import java.io.*;
import java.util.*;
 
class GrafoMaldito
{
    
    private int v;   
    private LinkedList<Integer> vector[];
    String nodos[];
    
    //Constructor 
    GrafoMaldito(int v)
    {
        this.v= v;
        vector = new LinkedList[v];
        nodos = new String[v];
       
        for (int i=0; i<v; ++i){
            vector[i] = new LinkedList();
        }
    }
 
    //Funcion para agregar un arco de un nodo a otro
    void addArco(int v,int w){
        vector[v].add(w);
        vector[w].add(v); 
    }
 
    //Asignamos colores a todos los vertices y se imprime el resultado
    void coloramiento(){
        int aux=0;
        
        int result[] = new int[v];
        Arrays.fill(result, -1);
        result[0]  = 1;
        
        String colores[] = new String[10];
        colores[0]=("Azul");
        colores[1]=("Amarillo");
        colores[2]=("Rojo");
        colores[3]=("Blanco");
        colores[4]=("Cafe");
        colores[5]=("Negro");
        colores[6]=("Morado");
        colores[7]=("Verde");
        colores[8]=("Naranja");
        colores[9]=("Rosado");
        
        boolean coloresDisponibles[] = new boolean[v];
        Arrays.fill(coloresDisponibles, true);
 
        // Asignar los colores a los nodos restantes
        for (int i = 1; i < v; i++)
        {
            //Procesar todos los vertices adyacentes y definir los colores para cada vector
            Iterator<Integer> numeros = vector[i].iterator() ;
            while (numeros.hasNext())
            {
                int j = numeros.next();
                if (result[j] != -1)
                    coloresDisponibles[result[j]] = false;
            }
            //Encuentra el primer color disponible
            int k;
            for (k = 0; k < v; k++){
                if (coloresDisponibles[k])
                    break;
            }
            //Asigna el primer color disponible
            result[i] = k; 
            aux=k+1;
            // Resetear los valores para la siguiente iteración
            Arrays.fill(coloresDisponibles, true);
        }
        //Imprime el resultado
        for (int u = 0; u < v; u++)
            System.out.println("vertice " + nodos[u] + " <--->  Color " + colores[result[u]]);
                       
        System.out.println("Numero de colores necesarios para pintar el grafo= " + aux );                        
    }
 
    public static void main(String args[]){
        System.out.println();
        
        GrafoMaldito g3 = new GrafoMaldito(13);
        g3.addArco(1, 10);
        g3.addArco(1, 7);
        g3.addArco(1, 5);
        g3.addArco(1, 6);
        g3.addArco(2, 10);
        g3.addArco(2, 7);
        g3.addArco(2, 8);
        g3.addArco(2, 11);
        g3.addArco(2, 6);
        g3.addArco(3, 10);
        g3.addArco(3, 11);
        g3.addArco(3, 12);
        g3.addArco(5, 8);
        g3.addArco(5, 11);
        g3.addArco(6, 11);
        g3.addArco(6, 12);
        g3.addArco(7, 11);
        g3.addArco(7, 6);
        g3.addArco(7, 12);
        g3.addArco(8, 12);
        
        g3.nodos[0]=("AB");
        g3.nodos[1]=("AC");
        g3.nodos[2]=("AD");
        g3.nodos[3]=("BA");
        g3.nodos[4]=("BC");
        g3.nodos[5]=("BD");
        g3.nodos[6]=("DA");
        g3.nodos[7]=("DB");
        g3.nodos[8]=("DC");
        g3.nodos[9]=("EA");
        g3.nodos[10]=("EB");
        g3.nodos[11]=("EC");
        g3.nodos[12]=("ED");
        
        System.out.println("coloramiento del GrafoMaldito");
        g3.coloramiento();
        
    }
}