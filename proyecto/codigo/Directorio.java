import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Directorio{

    String direccion;
    TreeMap<String,String> Nombres = new TreeMap<String,String>();
    TreeMap<String,String>  Tamaños= new TreeMap<String,String>();
    TreeMap<String,String> Dueños = new TreeMap<String,String>();

    File archivo=null;
    FileReader fr=null;
    BufferedReader br=null;

    public Directorio(){

    }

    public void leer(){

        String linea;
        String siglinea;
        String tmp="";

        String llave = Pattern.quote("[");
        String rara = Pattern.quote("├");

        String [] spline = null;
        String [] spsline = null;

        try{ 

            archivo = new File ("archivo.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            linea=br.readLine();
            linea=br.readLine();
            siglinea=br.readLine();

            while(linea!=null || siglinea!=null){
                
                //Dividir el String para obtener lo que consideraremos como la profundidad o nivel del documento

                if(linea.contains("[")){
                    spline = linea.split(llave);
                }

                if(siglinea.contains("[")){
                    spsline = siglinea.split(llave);
                }

                int espline = spline[0].length();
                int espsline = spsline[0].length();
                
                //Inicio de las condiciones para realizar la inserción en el arbol

                if(espline < espsline){
                    if(espline + 4 == espsline){
                        Nombres.put(spsline[spsline.length-1] , spline[spline.length-1]);
                    }else{
                        linea=tmp;
                        //linea=siglinea;
                        continue;
                    }
                }
                
                if(espline == espsline){                    
                    linea=siglinea;
                    siglinea=br.readLine();
                    continue;
                }
                
                if(espline > espsline){                    
                    linea=siglinea;
                    siglinea=br.readLine();
                    continue;
                }

                //Nombres.put(linea,siglinea);  
                tmp=siglinea;
                siglinea=br.readLine();
            }
        }   
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
        direccion="proyecto";

        System.out.println(Nombres.tailMap(direccion));
    }

}