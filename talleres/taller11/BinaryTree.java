
public class BinaryTree {
    public Node root;

    public BinaryTree(){
        root = null;
    }

    private int max2(int i, int j)
    {
        if (i > j)
            return i;
        return j;
    }

    private int maxheightAUX(Node node)
    {
        if (node == null)
            return 0;
        else 
            return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
    }

    public int maxheight()
    {
        return maxheightAUX(root);
    }

    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }

    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }

    private boolean searchAux(Node Node, int n){

        if(Node == null)return false;
        if(Node.data== n)return true;
        if(Node.data < n){
            return searchAux(Node.right, n);
        }
        else{
            return searchAux(Node.left, n);
        }
    }

    public boolean search(int n){
        return searchAux(root, n);
    }

    public void insertar(int n){
        if(!esta(n)){
            Node nuevo = new Node(n);
            if(root==null){
                root = nuevo;
                return;
            }

            Node temp = root;
            Node padre = null;

            while(true){
                padre = temp;
                if(n < temp.data){
                    temp = temp.left;
                    if(temp==null){
                        padre.left= nuevo;
                        return;
                    }
                }else{
                    temp= temp.right;
                    if(temp==null){
                        padre.right=nuevo;
                        return;
                    }
                }
            }

        }else{
            System.out.println(" el data ya se encuentra");
        }
    }

    private boolean esta(int n){
        Node temp = root;
        while(temp!=null){
            if(temp.data == n){
                return true;
            }else if(temp.data > n){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return false;
    }

    public void borrar(int n){ 
        root = borrar(root, n); 
    }

    private Node borrar(Node nodo,int n){
        if(esta(n)){ 
            System.out.println("si");
            if(nodo.data == n){
                if(nodo.right == null && nodo.left == null){  
                    System.out.println("si1");
                    nodo = null;                    
                    return nodo;             
                }

                if(nodo.right == null && nodo.left != null){  
                    nodo = nodo.left;
                    return nodo;    
                }

                if(nodo.left == null && nodo.right != null){ 
                    nodo = nodo.right;
                    return nodo;
                }

                nodo.data = encontrarMaximo(nodo.left);
                nodo = ajuste(nodo, nodo.left, nodo);
                return nodo;
            }
        }

        if(n > nodo.data){ 
            nodo.right = borrar(nodo.right, n); 
            return nodo; 
        }

        nodo.left = borrar(nodo.left, n);
        return nodo;
    }

    private int encontrarMaximo(Node nodo){
        if(nodo.right == null){ 
            return nodo.data; 
        }
        return encontrarMaximo(nodo.right);    
    }
    
    private Node ajuste(Node padre, Node hijo1 , Node hijo2){
        if(hijo1.right == null){
            if(padre == hijo2){
                padre.left = hijo1.left; 
                return padre;
            } 
            padre.right = hijo1.left; 
            return padre;
        }        
 
        hijo1 = ajuste(hijo1, hijo1.right, hijo2);
        
        if(padre == hijo2){
            padre.left = hijo1;
        }
        padre.right = hijo1;
        return padre;
    }
}