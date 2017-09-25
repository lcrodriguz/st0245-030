import java.util.*;

public class Lab {

    /**
     * Returns the product of the numbers in the list. 
     * @param list - List of integers.
     * @return An integer.
     */
    public static int multiply(List<Integer> list) {
        int mult=1;
        for(int i=0; i<list.size() ;i++){
            mult=mult*list.get(i);
        }
        return mult;
    }

    public static void smartInsert(List<Integer> list, int data){
        for(int i=0; i<list.size() ;i++){
            if(list.get(i)==data){
                System.out.println("este dato ya se encuentra almacenado");
                break;
            } 
            else{
                list.add(data); 
                System.out.println("se agrego el elmento");
                break;
            }
        }
    }

    public static int pivote(List<Integer> list){
        int[]sum = suma(list);
        int ultimo = sum[sum.length - 1];
        int pivot = 0;
        int minimo = ultimo + 1;
        for(int i = 1; i < sum.length; i++){
            int val = Math.abs(sum[i-1] - (ultimo - sum[i]));
            if(val < minimo){
                minimo = val;
                pivot = i;
            }
        }
        System.out.println(pivot -1);
        return pivot -1;
    }

    private static int[] suma(List<Integer> list){
        int sum = 0;
        int[] suma = new int [list.size() + 1];
        for(int i= 0; i < list.size() ; i++){
            sum+= list.get(i);
            suma[i + 1]=sum;
        }
        return suma;
    }
    
    /**
     * Tests the methods.
     * @param args
     */
    public static void main(String[] args) {
        //los metodos funcionan para las dos estructuras de dato
        //ArrayList y LinkedList
        
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Integer[] {10, 2, 4, 8}));

        LinkedList<Integer> linkede = new LinkedList<>();
        linkede.addAll(Arrays.asList(new Integer[] {10, 20, 5, 3, 20, 10}));
        

        // Multiply
        System.out.println("multiplicación");
        System.out.println("la multiplicación de los elementos es: " + multiply(array));

        // smartInsert
        System.out.println("insertar");
        System.out.println("ejemplo 1");
        smartInsert(linked, 2);
        for(int i=0; i<linked.size() ;i++){
            System.out.println(linked.get(i));
        }
        System.out.println("ejemplo 2");
        smartInsert(linked, 9);
        for(int i=0; i<linked.size() ;i++){
            System.out.println(linked.get(i));
        }
        
        //Pivote
        System.out.println("pivote");
        pivote(linkede);
    }
}