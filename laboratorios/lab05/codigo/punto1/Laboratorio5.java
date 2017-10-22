
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
   
   public static void dibujarArbolAux(Node Node)
   {
      if (Node != null)
        
         for(Node n: new Node[] {Node.left, Node.right} ){
            if (n != null)
               System.out.println("\"" + Node.data + "\" -> \"" + n.data + "\";");
            dibujarArbolAux(n);
        }
   }

    
    public static void main(String[] args) {
    
        //Crea el árbol familiar
        System.out.println("Arbol de Luis");
        BinaryTree arbolGenealogico = new BinaryTree();

        Node raiz = new Node("Luis");
        arbolGenealogico.root = raiz;
        Node hijo1 = new Node("Luz");
        raiz.left = hijo1;
        Node hijo2 = new Node("Carlos");
        raiz.right = hijo2;
        Node nieto1 = new Node("Margarita");
        hijo1.left = nieto1;
        Node nieto2 = new Node("Adelmo");
        hijo1.right = nieto2;
        Node nieto3 = new Node("Maria");
        hijo2.left = nieto3;
        Node nieto4 = new Node("Habraham");
        hijo2.right = nieto4;
                  
        //Altura
        System.out.println(arbolGenealogico.maxheight());
        
       //Dibuja el árbol familiar
        dibujarArbol(arbolGenealogico);
        
        //buscar en el arbol familiar
        System.out.println(arbolGenealogico.buscara("Carlos"));
        System.out.println(arbolGenealogico.buscara("jose"));
        System.out.println(arbolGenealogico.buscara("Adelmo"));
        
        arbolGenealogico.getGrandMothersName("Luis");
        
        System.out.println("Arbol de Laura");
    }
}
