import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class directorio2{

    static TreeMap<String,String> Nombres = new TreeMap<String,String>();
    static TreeMap<String,String>  Tamano= new TreeMap<String,String>();
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
        String mientras=null;
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
            raiz=raiz.substring(1, raiz.length());
            linea=br.readLine();
            siglinea=br.readLine();

            int espline;
            int espsline;

            while(linea!=null && siglinea!=null){

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
                String linenosp[]=spline[1].split(" ");
                String slinenosp[]=spsline[1].split(" ");

                if(espline < espsline){
                    if(espline + 4 == espsline){
                        if(Nombres.containsKey(spsline[spsline.length-1])&& !Nombres.get(spsline[spsline.length-1]).equals(spline[spline.length-1])){
                            Nombres.put(spsline[spsline.length-1] , spline[spline.length-1]+" ó " + Nombres.get(spsline[spsline.length-1]));
                        }else{
                            Nombres.put(spsline[spsline.length-1].substring(20) , spline[spline.length-1].substring(20));
                            Tamano.put(spline[spline.length-1].substring(20) , spline[spline.length-1].substring(13,17));
                            Tamano.put(spsline[spsline.length-1].substring(20) , spsline[spsline.length-1].substring(13,17));
                            //agrega dueño como valor
                            Dueños.put(spline[spline.length-1].substring(20), linenosp[0]);
                            Dueños.put(spsline[spsline.length-1].substring(20), slinenosp[0]);
                        }
                    }else{
                        linea=tmp;
                        //linea=siglinea;
                        continue;
                    }
                }

                if(espline == 4){
                    if(Nombres.containsKey(spline[spline.length-1])&& !Nombres.get(spline[spline.length-1]).equals(raiz)){
                        Nombres.put(spline[spline.length-1],raiz + Nombres.get(spline[spline.length-1]));
                    }else{
                        Nombres.put(spsline[spsline.length-1].substring(20) , spline[spline.length-1].substring(20));
                        Tamano.put(spline[spline.length-1].substring(20) , spline[spline.length-1].substring(13,17));
                        Tamano.put(spsline[spsline.length-1].substring(20) , spsline[spsline.length-1].substring(13,17));
                        //agrega dueño como valor
                        Dueños.put(spline[spline.length-1].substring(20), linenosp[0]);
                        Dueños.put(spsline[spsline.length-1].substring(20), slinenosp[0]);
                    }
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

    public static void busqueda(String entrada){

        String resultado=Nombres.get(entrada);
        String valor=resultado;
        while(valor!=null && !(valor.contains("Emulators-Roms"))){
            String tmp=valor;
            resultado=resultado + "/" + Nombres.get(valor);
            valor=Nombres.get(tmp);
        }

        System.out.println(resultado);
    }

    public static void buscar(String entrada){
        if(Nombres.containsKey(entrada)){
            System.out.println(Nombres.floorEntry(entrada));
        }else{
            System.out.println("No se encontró ningún archivo relacionado a este nombre");
        }

        //System.out.println(Nombres.tailMap(direccion));
    }

    public static void buscarTamano(String entrada){

        if(Tamano.containsKey(entrada)){
            System.out.println("Tamaño del archivo: "+Tamano.get(entrada));
        }else{
            System.out.println("No se encontró ningún archivo con este nombre");
        }
    }

    public static void buscarDueno(String entrada){

        if(Tamano.containsKey(entrada)){
            System.out.println("Dueño del archivo: "+Dueños.get(entrada));
        }else{
            System.out.println("No se encontró ningún archivo con este nombre");
        }
    }

    public static void main(String []ar) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese qué desea buscar (Archivo o tamaño): ");
        String entrada = br.readLine();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        if (entrada.equalsIgnoreCase("tamaño")){
            System.out.println("Por favor ingrese en nombre del archivo: ");
            String entrada2 = br2.readLine();
            leer("archivo.txt");
            buscarTamano(entrada2);
        }

        if (entrada.equalsIgnoreCase("archivo")){
            System.out.println("Por favor ingrese en nombre del archivo: ");
            String entrada2 = br2.readLine();
            leer("archivo.txt");
            busqueda(entrada2);
        }

        if (entrada.equalsIgnoreCase("Dueño")){
            System.out.println("Por favor ingrese en nombre del archivo: ");
            String entrada2 = br2.readLine();
            leer("archivo.txt");
            buscarDueno(entrada2);
        }
    }
}