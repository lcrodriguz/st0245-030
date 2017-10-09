
import java.io.*;
import java.util.*;
public class Punto2
{
    //basado en:
    //Ejercicio21
    //Autores: Daniel Arango y Kevin Parra
    //Fecha: Octubre 2017
    //Disponible en: https://github.com/damesaa201710054010/ST0245-033.git

    private ArrayList<Stack> laPila = new ArrayList<>();
    private int tam;

    public Punto2(int n) {
        tam = n;
        for (int i = 0; i < tam; i++) {
            Stack pila = new Stack();
            pila.push(i);
            laPila.add(pila);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Punto2 ej = new Punto2(n);
        String inst1 = in.next();
        while (!inst1.equals("quit")) {
            int a = in.nextInt();
            String inst2 = in.next();
            int b = in.nextInt();

            if (inst1.equals("move")) {
                if (inst2.equals("onto")) {
                    ej.moveOnto(a, b);
                } else {
                    ej.moveOver(a, b);
                }
            } else if (inst1.equals("pile")) {
                if (inst2.equals("onto")) {
                    ej.moveOnto(a, b);
                } else {
                    ej.pileOver(a, b);
                }
            }
            inst1 = in.next();
        }
        System.out.println();
        ej.imprimir();
    }

    private void moveOnto(int a, int b) {
        if (a != b) { 
            for (int i = 0; i < tam; i++) { 
                boolean loctA = laPila.get(i).contains(a); 
                boolean loctB = laPila.get(i).contains(b); 
                if (loctA != loctB) { 
                    if (loctB) {
                        int pX = (int) laPila.get(i).pop();
                        while (pX != b) {
                            laPila.get(pX).push(pX);
                            pX = (int) laPila.get(i).pop();
                        }
                        laPila.get(i).push(b);
                        laPila.get(i).push(a);

                    }
                    if (loctA) {
                        int pX = (int) laPila.get(i).pop();
                        while (pX != a) {
                            laPila.get(pX).push(pX);
                            pX = (int) laPila.get(i).pop();
                        }
                    }
                }
            }
        }
    }

    private void moveOver(int a, int b){
        if (a!=b){
            for (int i = 0; i < tam; i++) {
                boolean loctA = laPila.get(i).contains(a);
                boolean loctB = laPila.get(i).contains(b);
                if (loctB!=loctA){
                    if (loctA){
                        int pA=(int)laPila.get(i).pop();
                        while(pA!=a){
                            laPila.get(pA).push(pA);
                            pA=(int)laPila.get(i).pop();
                        }
                    }
                    if(loctB){
                        laPila.get(i).push(a);
                    }
                }
            }
        }
    }

    private void pileOnto(int a, int b){
        int pA=0;
        int pB=0;
        if (a!=b){
            for (int i = 0; i < tam; i++) {
                boolean loctA = laPila.get(i).contains(a);
                boolean loctB = laPila.get(i).contains(b);

                if(loctA){
                    pA=i;
                }

                if(loctB){
                    pB=i;
                }
            }
            if(pA!=pB){
                int pX=(int)laPila.get(pB).pop();
                while(pX!=b){
                    laPila.get(pX).push(pX);
                    pX=(int)laPila.get(pB).pop();
                }

                //para los elementos que estaban apilados en a
                Stack elemtA= new Stack();
                pX=(int)laPila.get(pA).pop();
                while(pX!=a){
                    elemtA.push(pX);
                    pX=(int)laPila.get(pA).pop();
                }
                elemtA.push(a);

                //paso a b los elementos de la pila elemtA en el orden original
                while(!elemtA.empty()){
                    laPila.get(pB).push(elemtA.pop());
                }
            }
        }
    }

    private void pileOver (int a, int b){
        int pA=0;
        int pB=0;
        if (a!=b){
            for (int i = 0; i < tam; i++) {
                boolean loctA = laPila.get(i).contains(a);
                boolean loctB = laPila.get(i).contains(b);

                if(loctA){
                    pA=i;
                }

                if(loctB){
                    pB=i;
                }
            }
            if(pA!=pB){
                //para los elementos que estaban apilados en a
                Stack elemtA= new Stack();
                int pX=(int)laPila.get(pA).pop();
                while(pX!=a){
                    elemtA.push(pX);
                    pX=(int)laPila.get(pA).pop();
                }
                elemtA.push(a);
                while(!elemtA.empty()){
                    laPila.get(pB).push(elemtA.pop());
                } 
            }
        }
    }

    private void imprimir(){
        Stack pilaNueva = new Stack();
        for (int i = 0; i < tam; i++) {
            System.out.print(i+":");
            while (!laPila.get(i).empty()) {
                pilaNueva.push(laPila.get(i).pop());
            }
            while(!pilaNueva.empty())
            {
                System.out.print(" "+pilaNueva.pop());
            }
            System.out.println();
        }
    }
}
