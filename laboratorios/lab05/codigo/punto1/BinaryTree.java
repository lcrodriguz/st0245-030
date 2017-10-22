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

    public int alturaAUX(Node node) {
        if (node==null) {
            return 0;
        }
        else {
            return (1 + Math.max(alturaAUX(node.left),alturaAUX(node.right)));
            // return (1 + Math.max(((root.left) altura()), ((root.right) altura())));
        }
    }

    public void altura(){
        System.out.println(alturaAUX(root));
    }

    public boolean buscara( String n){
        return buscara(root, n);
    }

    private boolean buscara(Node nodo , String n){
        boolean temp=false; 
        if(nodo == null)return false;
        else {
            if (nodo.data != n)
            {
                return buscara(nodo.left, n)||buscara(nodo.right, n);
            }else{
                return true;
            }
        }

    }
    
    public void getGrandMothersName(String name){
        Node nodo;
        nodo= buscarAbuAux(name);
        if(nodo!=null){
        if(nodo.left!=null){
        if(nodo.left.left!=null){
        System.out.println("Nombre: " + nodo.left.left.data);
    return;}}}
        
         System.out.println( "En el árbol no está su abuela");
    }
    Node nodo;
    public void buscarAbue(Node node,String n){
    if (node != null)
        {
            buscarAbue(node.left,n);
            buscarAbue(node.right,n);
            if(node.data.equals(n)){
               nodo=node;
                return ;
             
            }
        }
    }
     public Node buscarAbuAux(String n){
        buscarAbue(root, n);
        return nodo;
    }
    
       public static void dibujarArbol(BinaryTree a)
   {
       System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
       System.out.println("digraph arbolito {");
       System.out.println("size=\"6,6\";");
       System.out.println("node [color=aquamarine, style=filled];");
       dibujarArbolAux(a.root);
       System.out.println("}");
   }
   
   public static void dibujarArbolAux(Node node)
   {
      if (node != null)
        
         for(Node n: new Node[] {node.left, node.right} ){
            if (n != null)
               System.out.println("\"" + node.data + "\" -> \"" + n.data + "\";");
            dibujarArbolAux(n);
        }
   }

}