
/**
 * class MiArrayList 
 * 
 * @author Luis Carlos Rodríguez Zúniga y Laura Sánchez Córdoba
 * @version Septiembre 2017
 */
import java.util.Arrays;

public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[];

    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MiArrayList() {
        size=0;
        elements=new int[DEFAULT_CAPACITY];
    }     
    // Retorna el tamaño de la lista 
    public int size() {
        return size; 
    }
    // Agrega un elemento e a la última posición de la lista
    public void add(int e) {
        if(size>=elements.length){
            aumentar();
        }
        elements[size]=e;
        size++;
    }    
    // Retorna el elemento que se encuentra en la posición i de la lista 
    public int get(int i) {
        if(i>=size){ throw new ArrayIndexOutOfBoundsException();}
        return elements[i];   
    }
    // Agrega un elemento e en la posición index de la lista
    public void add(int index, int e) {
        if(index>=size){ throw new ArrayIndexOutOfBoundsException();}
        if(size>=elements.length){
            aumentar();
        }

        for(int i=size-1;i>=index;i--){
            elements[i+1]=elements[i];
        } 
        elements[index]=e;
        size++;
    } 

    //aumentar espacio en el array
    public void aumentar(){
        int[] tmp = new int[elements.length*2];
        for (int i=0; i<elements.length;i++){
            tmp[i]=elements[i];
        }
        elements = tmp;
    }
}
