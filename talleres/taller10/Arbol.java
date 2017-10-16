public class Arbol{
    Nodo raiz;

    public Arbol(){
        raiz=null; 
    }

    public Arbol(String s){
        raiz=new Nodo(s);
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public void impInorden(){
        if(raiz !=null){
            inordenAux(raiz);
        }
    }
    
    private void inordenAux(Nodo nodo){
        if(nodo!=null ){ 
            inordenAux(nodo.left);
            System.out.println(nodo.getDato());
            inordenAux(nodo.right);
        }     

    }

    /*Toro, M (2017) Laboratorio5 (Version 1.0) [Source code]. 
     *https://github.com/mauriciotoro/ST0245-Eafit/blob/master/talleres/taller10/java/Laboratorio5/src/Laboratorio5.java*/ 
    public static void dibujarArbol(Arbol a)
    {
        System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
        System.out.println("digraph arbolito {");
        System.out.println("size=\"6,6\";");
        System.out.println("node [color=aquamarine, style=filled];");
        dibujarArbolAux(a.raiz);
        System.out.println("}");
    }

    /*Toro, M (2017) Laboratorio5 (Version 1.0) [Source code]. 
     *https://github.com/mauriciotoro/ST0245-Eafit/blob/master/talleres/taller10/java/Laboratorio5/src/Laboratorio5.java*/
    public static void dibujarArbolAux(Nodo nodo)
    {
        if (nodo != null)
        //"x_\n__" -> "xo\n__";
            for(Nodo n: new Nodo[] {nodo.left, nodo.right} ){
                if (n != null)
                    System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
                dibujarArbolAux(n);
            }
    }

}