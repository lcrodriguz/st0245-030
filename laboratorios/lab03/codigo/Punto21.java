import java.util.*;
public class Punto21

{
    //basado en:
    //Ejercicio21
    //Autores: Daniel Arango y Kevin Parra
    //Fecha: Septiembre 2017

    public void cambiar(){
        LinkedList miLista = new LinkedList<String>(); //c1
        Scanner sc = new Scanner(System.in);          //c2
        String cadena;                                //c3
        System.out.print("Introduzca texto: ");       //c4
        cadena = sc.nextLine();                       //c5
        int cam=0;                                    //c6
        for(int i=0; i<cadena.length();i++){ //c7*n
            if(cadena.charAt(i)=='['){ //c8
                cam=0;                 //c9
            }else if(cadena.charAt(i)==']'){//c10
                cam=miLista.size();//c11
            } else {
                miLista.add(cam, cadena.charAt(i));//n
                cam++;                             //c12
            }
        }
        String correcto=miLista.toString(); //n
        System.out.println("Texto corregido: "+aString(correcto)); //n
      
        

    } 

    public String aString(String nueva){
        String aux=""; //c1
        for(int i=0;i<nueva.length();i++){ //c2*n
            if(nueva.charAt(i)!=','&&nueva.charAt(i)!=32)//c3
            if((nueva.charAt(i)!='[')&&(nueva.charAt(i)!=']'))//c4
            aux=aux + nueva.charAt(i);//c5
        }
        return aux;//c6
    }
}