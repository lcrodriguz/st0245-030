public class Laboratorio5 {

   public static void dibujarArbol(BinaryTree a)
   {
       System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
       System.out.println("digraph arbolito {");
       System.out.println("size=\"6,6\";");
       System.out.println("node [color=aquamarine, style=filled];");
       dibujarArbolAux(a.root);
       System.out.println("}");
   }
   
   public static void dibujarArbolAux(Node nodo)
   {
      if (nodo != null)
         for(Node n: new Node[] {nodo.left, nodo.right} ){
            if (n != null)
               System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
            dibujarArbolAux(n);
        }
   }

    
    public static void main(String[] args) {
    
        //Crea el árbol
        BinaryTree tree = new BinaryTree();
        tree.insertar(50);
        tree.insertar(30);
        tree.insertar(24);
        tree.insertar(5);
        tree.insertar(28);
        tree.insertar(45);
        tree.insertar(98);
        tree.insertar(52);
        tree.insertar(60);
        
        //Imprime el árbol en pos-orden
        tree.recursivePrint();

        //Dibuja el árbol 
        dibujarArbol(tree);
    }
}