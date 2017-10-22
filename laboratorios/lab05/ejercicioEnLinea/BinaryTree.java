
public class BinaryTree {
    public Node root;

    public BinaryTree(){
        root = null;
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

    private boolean searchAux(Node nodo, int n){

        if(nodo == null)return false;
        if(nodo.data== n)return true;
        if(nodo.data < n){
            return searchAux(nodo.right, n);
        }
        else{
            return searchAux(nodo.left, n);
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
}