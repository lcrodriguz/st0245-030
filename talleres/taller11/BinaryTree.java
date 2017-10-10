
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

        public void delete(int n)
    {
        delete(root,n);
    }
    
    private void delete(Node nodo,int n)
    {
        
        if(nodo == null)
            return;
        if(nodo.data == n){
            System.out.println("Si1");
            if(nodo.left == null && nodo.right == null){
                System.out.println("Si2");
                nodo = null;
                return;
            }
            if(nodo.left != null && nodo.right == null){
                System.out.println("Si3");
                nodo = nodo.left;
                nodo.left = null;
                return;
            }
            if(nodo.right != null && nodo.left == null){
                System.out.println("Si4");
                nodo = nodo.right;
                nodo.right = null;
                return;
            }
            if(nodo.right != null && nodo.left != null){
                
            }
        }
        if(nodo.data < n){
            System.out.println("Si5");
            delete(nodo.right, n);
        }
        if(nodo.data > n){
            System.out.println("Si6");
            delete(nodo.left, n);
        }
    }
}