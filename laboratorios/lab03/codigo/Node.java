public class Node {
    public int dato;
    public String caract;
    public Node next;
    public Node prev;
    public Node(int dato, String caract)
    {
        next = null;
        prev = null;
        this.dato = dato;
        this.caract = caract;
    }

}