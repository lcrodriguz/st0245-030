public class Laboratorio5 {

    public static void main(String[] args) {
        //Crea el árbol familiar
        BinaryTree arbolGenealogico = new BinaryTree();

        Node raiz = new Node("Laura");
        arbolGenealogico.root = raiz;
        Node mama = new Node("Adriana");
        raiz.left = mama;
        Node papa = new Node("Hernán");
        raiz.right = papa;
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
        System.out.println(arbolGenealogico.maxheight());
        //Código para el árbol familiar
        BinaryTree.dibujarArbol(arbolGenealogico);
        //buscar
        System.out.println(arbolGenealogico.buscara("Yolanda"));
        System.out.println(arbolGenealogico.buscara("Eleazar"));
        System.out.println(arbolGenealogico.buscara("Juan"));
        //Abuela materna
        arbolGenealogico.getGrandMothersName("Hernán");
        arbolGenealogico.getGrandMothersName("Laura");
        arbolGenealogico.getGrandMothersName("Bautista");
        arbolGenealogico.getGrandMothersName("Adriana");
    }
}