
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
        BinaryTree arbolGenealogico = new BinaryTree();

        Node raiz = new Node("Manuela");
        arbolGenealogico.root = raiz;
        Node hijo1 = new Node("Yesica");
        raiz.left = hijo1;
        Node hijo2 = new Node("Wilfer");
        raiz.right = hijo2;
        Node nieto1 = new Node("Blanca");
        hijo1.left = nieto1;
        Node nieto2 = new Node("Arturo");
        hijo1.right = nieto2;
        Node bisnieto1 = new Node(" ");
        nieto1.left = bisnieto1;
        Node bisnieto2 = new Node(" ");
        nieto1.right = bisnieto2;
        Node bisnieto12 = new Node(" ");
        nieto2.left = bisnieto12;
        Node bisnieto22 = new Node(" ");
        nieto2.right = bisnieto22;
        Node nieto12 = new Node("Rosmira");
        hijo2.left = nieto12;
        Node nieto22 = new Node("Javier");
        hijo2.right = nieto22;
        Node bisnietoright = new Node("Alicia");
        nieto12.left = bisnietoright;
        Node bisnietoright2 = new Node(" ");
        nieto12.right = bisnietoright2;
        Node bisnietorightp = new Node(" ");
        nieto22.left = bisnietorightp;
        Node bisnietorightp2 = new Node("");
        nieto22.right = bisnietorightp2;
                  
        //Altura
        System.out.println(arbolGenealogico.maxheight());
        
       //Dibuja el árbol familiar
        dibujarArbol(arbolGenealogico);
        
        //buscar en el arbol familiar
        System.out.println(arbolGenealogico.buscara("Alicia"));
        System.out.println(arbolGenealogico.buscara("jesus"));
        System.out.println(arbolGenealogico.buscara("Manuela"));
        
        //arbolGenealogico.getGrandMothersName("Wilfer");
        
    }
}