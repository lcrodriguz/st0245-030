import java.lang.IndexOutOfBoundsException; 

public class Solicitud {
    private Node first;
    private int indice=0;
    private int size;
    public Solicitud(){
        size = 0;
        first = null; 
    }

    public Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index <= size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println("cantidad N°: "+index +" para la tienda: "+temp.caract);
    }
    public int size(){
        return size;
    }
    public void insert(int dato, String caract){
        if(indice == 0){
            Node nuevo = new Node(dato, caract);
            nuevo.next = first;
            first = nuevo;
            size++;
            indice++;
        } else {
            size++;
            Node temp = getNode(indice);
            Node nuevo = new Node(dato, caract);
            nuevo.next = temp;
            Node temp1 = getNode(indice-1);
            temp1.next = nuevo;
            indice++;
        }
    }
    public void remove(int index){
        if(index > 0){
            Node delete = getNode(index);
            Node del = getNode(index-1);
            del.next = delete.next;
            del = null;
            size--;
        }
        else{
            Node delete = getNode(index);
            Node del = getNode(index+1);
            del.next = delete.next;
            del = null;
            size--;
        }
    }
}