import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Directorio{

    static TreeMap<String,String> Nombres = new TreeMap<String,String>();
    static TreeMap<String,String>  Tamaños= new TreeMap<String,String>();
    static TreeMap<String,String> Dueños = new TreeMap<String,String>();

    static File archivo=null;
    static FileReader fr=null;
    static BufferedReader br=null;

    public static void leer(String entrada){
        String info;
        String raiz;
        String linea;
        String siglinea;
        String tmp="";

        String llave = Pattern.quote("[");
        String vacio = Pattern.quote("");

        String [] spline = null;
        String [] spsline = null;

        try{ 

            archivo = new File (entrada);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            linea=br.readLine();
            raiz=linea;
            raiz=raiz.substring(1, raiz.length()-1);
            linea=br.readLine();
            siglinea=br.readLine();

            int espline;
            int espsline;

            while((linea != vacio) || (siglinea != vacio)){

                spsline = null;
                spline = null;

                //Dividir el String para obtener lo que consideraremos como la profundidad o nivel del documento

                if(linea.contains("[")){
                    spline = linea.split(llave);
                }

                if(siglinea.contains("[")){
                    spsline = siglinea.split(llave);
                }

                espline = spline[0].length();
                if(siglinea.equals("")){
                    espsline =0;   
                }else{
                    espsline = spsline[0].length();
                }
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

                if(espline == 4){
                    Nombres.put(spline[spline.length-1] , raiz);
                }

                if(espsline == 4){
                    Nombres.put(spsline[spsline.length-1] , raiz);
                }

                if(espline == espsline){                    
                    linea=siglinea;
                    siglinea=br.readLine();
                    continue;
                }

                if(siglinea.equals("") ){
                    siglinea=br.readLine();
                    info=siglinea;
                    break;
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
        }catch(Exception e){
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

    public static void buscar(String entrada){
        
        if(Nombres.containsKey(entrada)){
                System.out.println(Nombres.floorEntry(entrada));
        }else{
            System.out.println("No se encontró ningún archivo relacionado a este nombre");
        }
        
        //System.out.println(Nombres.tailMap(direccion));
    }

    public static void main(String []ar) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese el nombre del archivo a buscar");
        String entrada = br.readLine();
        leer("archivo.txt");
        buscar(entrada);
    }
}