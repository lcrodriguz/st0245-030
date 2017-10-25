
/**
 * Arbol rojonegro
 * 
 * @author Manu 
 * @version number 1
 */
import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
public class Directorio
{
    String direccion;
    TreeMap<String,String> Nombres = new TreeMap<String,String>();
    TreeMap<String,String>  Tamaños= new TreeMap<String,String>();
    TreeMap<String,String> Dueños = new TreeMap<String,String>();
    File archivo=null;
        FileReader fr=null;
        BufferedReader br=null;
    public Directorio(){
        String a="hola";
         int b= a.hashCode();}
       public void leerArchivo(){ 
           String a="Manuela";
           String [] j= a.split("a");
        try {
            archivo = new File ("archivo.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String siglinea;
            String linea;
            String tmp="";
            String separador = Pattern.quote("│");
            String espacio = Pattern.quote(" ");
            linea=br.readLine();
            linea=br.readLine();
            siglinea=br.readLine();
          while(linea!=null|| siglinea!=null)

            { 
               
               String[] pline = linea.split(separador);
                int num=pline.length;
               String[] psigline = siglinea.split(separador);
                int numsig=psigline.length;
                String [] espaciossig= siglinea.split(espacio);
                String [] espacios= linea.split(espacio);
            if(num+1==numsig){
            Nombres.put(espaciossig[espaciossig.length-1],espacios[espacios.length-1]);
            } else{
            linea=tmp;
            continue;
            }
                //Nombres.put(linea,siglinea);  
                tmp=siglinea;
                 siglinea=br.readLine();
            }}   

        catch(Exception e){
            e.printStackTrace();
        }finally{

            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
    public void recorrer(){
    
    }

    public void buscar(){
         System.out.println(Nombres.get("asus-keyboard-backlight-down"));
        direccion="proyecto/plantilas/mauriciotoro";

        System.out.println(Nombres.tailMap(direccion));
    }

}