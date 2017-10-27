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

        String rara2 = Pattern.quote("└");
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

                if(linea.contains("├")){
                    spline = linea.split(rara);
                }
                if(linea.contains("└")){
                    spline = linea.split(rara2);
                }
                if(siglinea.contains("├")){
                    spsline = siglinea.split(rara);
                }
                if(siglinea.contains("└")){
                    spsline = siglinea.split(rara2);
                }

                int espline = spline[0].length();
                int espsline = spsline[0].length();

                int ecuacion = 2 * espline;
                
                if(ecuacion == espsline){
                    
                    Nombres.put(spsline[spsline.length-1] , spline[spline.length-1]);
                    
                    linea=siglinea;
                    siglinea=br.readLine();
                    continue;
                }
                
                if(espline > espsline){
                    Nombres.put(spsline[spsline.length-1] , spline[spline.length-1]);
                }
                
                if(espline < espsline){
                    Nombres.put(spsline[spsline.length-1] , spline[spline.length-1]);
                }
                //Nombres.put(linea,siglinea);  
                tmp=linea;
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