
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
        System.out.println();
       
       BinaryTree arGen = new BinaryTree();

        Node raiz2 = new Node("Laura");
        arGen.root = raiz2;
        Node mama = new Node("Adriana");
        raiz2.left = mama;
        Node papa = new Node("Hernán");
        raiz2.right = papa;
        Node abam = new Node("Yolanda");
        mama.left = abam;
        Node abom = new Node("Fabio");
        mama.right = abom;
        Node babam = new Node("Carlina");
        abam.left = babam;
        Node babom = new Node("Bernabé");
        abam.right = babom;
        Node babamp =new Node("María");
        abom.left=babamp;
        Node babomp =new Node("Pedro");
        abom.right=babomp;
        Node abap=new Node("Benigna");
        papa.left=abap;
        Node abop=new Node("Bautista");
        papa.right=abop;
        Node babap = new Node("Mercedes");
        abap.left = babap;
        Node babop = new Node("Francisco");
        abap.right = babop;
        Node babapp =new Node("Florentina");
        abop.left=babapp;
        Node babopp =new Node("Eleazar");
        abop.right=babopp;

        //Altura
        System.out.println(arGen.maxheight());
        //Código para el árbol familiar
        dibujarArbol(arGen);
        //buscar
        System.out.println(arGen.buscara("Yolanda"));
        System.out.println(arGen.buscara("Eleazar"));
        System.out.println(arGen.buscara("Juan"));
        //Abuela materna
        arGen.getGrandMothersName("Hernán");
        arGen.getGrandMothersName("Laura");
        arGen.getGrandMothersName("Bautista");
        arGen.getGrandMothersName("Adriana");
    }
}
