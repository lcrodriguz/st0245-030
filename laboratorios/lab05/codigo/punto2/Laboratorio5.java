
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args) throws IOException{
        //Crea el árbol
        BinaryTree tree = new BinaryTree();
        String entrada="";
        //ingreso datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese los datos para crear el arbol");
        System.out.println("Si ya finalizaste, por favor escriba listo");
        
        while(entrada!="listo"){     
         entrada = br.readLine();
         if(entrada.equals("listo")) break;
         int aux= 0;
         aux= Integer.parseInt(entrada);
         tree.insertar(aux);
        }
        //Imprime el árbol en pos-orden
        tree.recursivePrint();

        //Dibuja el árbol 
        dibujarArbol(tree);
    }
}
