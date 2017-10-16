public class Ejemplos
{
    public static void main (String [] args){
        Arbol arGen=new Arbol("Wilkenson");
        //padres
        Nodo madre =new Nodo("Joaquina");
        arGen.getRaiz().left=madre;
        Nodo padre=new Nodo("Sufranio");
        arGen.getRaiz().right=padre;
        //abuelos maternos 
        Nodo abam=new Nodo("Eustaquia");
        madre.left=abam;
        Nodo abom=new Nodo("Eustaquio");
        madre.right=abom;
        //abuelos paternos
        Nodo abap=new Nodo("Piolina");
        padre.left=abap;
        Nodo abop=new Nodo("Piolín");
        padre.right=abop;
        //bisabuelos maternos
        Nodo babam= new Nodo("Florinda");
        abam.left=babam;
        Nodo babom= new Nodo("Jovín");
        abom.right=babom;
        //bisabuelos paternos
        Nodo babap= new Nodo("Wilberta");
        abap.left=babap;
        Nodo babop= new Nodo("Usnavy");
        abop.right=babop;
        
        arGen.impInorden();
        System.out.println("\nDatos para el gráfico\n");
        Arbol.dibujarArbol(arGen);
    }
}
