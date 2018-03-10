package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String grafo[][]=llenar(grafo(ingresarNdeNodos()) , ingresarNdeNodos());
        recorridoSimple(grafo);
        System.out.print("Se necesitan "+ colores(grafo) +" en el semaforo");
    }

    public static String[][] grafo(int n){
        String grafo[][]=new String[n+1][n+1];
        grafo[0][0]="n";
        return grafo;
    }

    public  static int ingresarNdeNodos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de nodos");
        int n= sc.nextInt();
        return n;
    }

    public static String[][] llenar(String [][] grafo, int n){
        Scanner cs = new Scanner(System.in);
        for(int j=1;j<=n;j++){
            System.out.println("Ingrese el nombre de cada nodo");
            String nodo=cs.nextLine();
            grafo[0][j]=nodo;
            grafo[j][0]=nodo;
        }

        for(int i=1; i <=n;i++){
            String aux= grafo[0][i];
            System.out.println("ingrese los nodos adyacentes a: "+ aux + " separado de comas sin espacio");
            String adyacentes = cs.nextLine();

            Queue<String> cola = new LinkedList();

            String[] tokens = adyacentes.split(",");
            for(int j=0;j<tokens.length;j++) {
                cola.add(tokens[j]);
                System.out.println(tokens[j]);
            }
            for(int col=1; col< grafo.length; col++){
                String aux2 = cola.peek();
                String aux3 = grafo[col][0];
                if(aux3.equals(aux2)){
                   grafo[col][i]="1";
                   cola.poll();
               }
            }
        }
        for(int k=1;k<grafo.length;k++){
            for(int l=1;l<grafo.length;l++){
                if(grafo[k][l]==null){
                    grafo[k][l]="0";
                }
            }
        }
        return grafo;
    }

    public static void recorridoSimple(String [][] grafo){
        for(int fila=0; fila<=grafo.length-1; fila++){
            for(int col=0; col<=grafo.length-1; col++){
                System.out.print(" " + grafo[fila][col]);
            }
            System.out.println();
        }
    }

    public static int colores(String [][]grafo){
        int colores=1;
        String vecaux[]= grafo[1];
        vecaux[0]="0";
        String vecaux2[]=null;
        for(int m=1;m<grafo.length;m++){
            vecaux2 = grafo[m];
            vecaux2[0]="0";
            if(){
                continue;
            }
        }
        return colores;
    }





}
