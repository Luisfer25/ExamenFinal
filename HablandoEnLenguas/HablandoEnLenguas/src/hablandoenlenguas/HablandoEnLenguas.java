
package hablandoenlenguas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class HablandoEnLenguas {
    
    
    static String ruta;
    public static void main(String[] args) {
       new HablandoEnLenguas().Traductor("C:/Users/toshiba/Documents/GitHub/ExamenFinal/HablandoEnLenguas/dataset1.txt");
       
    }
    int n =0;
    String rutafinal = "";
    public void Traductor(String ruta){
        int contadorLineas = 0;
        try{
            FileReader archivo = new FileReader(ruta);
            BufferedReader leer = new BufferedReader(archivo);
            int Cantidad = Integer.parseInt(leer.readLine());
            String linea = "";
                while( contadorLineas < Cantidad){
                     linea = leer.readLine();
                     
                     for(int x = 0; x<=linea.length();x++){
                         if(x == linea.length()){
                             Lenguaje('1',ruta);
                             Lenguaje('2',ruta);
                         }else{
                             Lenguaje(linea.charAt(x),null);
                         }
                     }

                     
            contadorLineas++;
            
                }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    String palabra="";
    int contador = 1;
    public void Lenguaje(char linea,String ruta){
        switch(linea){
            case 'a':
                palabra += 'y';
                break;
                
            case 'b':
                palabra += 'h';
                break;
                
            case 'c':
                palabra += 'e';
                break;
                
            case 'd':
                palabra += 's';
                break;
                
            case 'e':
                palabra += 'o';
                break;
                
            case 'f':
                palabra += 'c';
                break;
                
            case 'g':
                palabra += 'v';
                break;
                
            case 'h':
                palabra += 'x';
                break;
                
            case 'i':
                palabra += 'd';
                break;
                
            case 'j':
                palabra += 'u';
                break;
                
            case 'k':
                palabra += 'i';
                break;
                
            case 'l':
                palabra += 'g';
                break;
                
            case 'm':
                palabra += 'l';
                break;
                
            case 'n':
                palabra += 'b';
                break;
                
            case 'o':
                palabra += 'k';
                break;
                
            case 'p':
                palabra += 'r';
                break;
            
            case 'q':
                palabra += 'z';
                break;
                
            case 'r':
                palabra += 't';
                break;
            
            case 's':
                palabra += 'n';
                break;
                
            case 't':
                palabra += 'w';
                break;
                
            case 'u':
                palabra += 'j';
                break;
                
            case 'v':
                palabra += 'p';
                break;
                
            case 'w':
                palabra += 'f';
                break;
                
            case 'x':
                palabra += 'm';
                break;
                
            case 'y':
                palabra += 'a';
                break;
                
            case ' ':
                palabra += ' ';
                break;
                
            case '1':
                String []link = ruta.split("/");
                while(n<link.length-1){
                    rutafinal += link[n]+"/";
                    n++;
                }
           
                
                EscribirArchivo(rutafinal+"/HablandoEnLenguas_201213001.txt");
                
                System.out.println("Caso #"+contador+": "+palabra);
                contador++;
                break;
                
            case '2':
                System.out.println();
                palabra = "";
                break;
        }
        
    }
    
    public void EscribirArchivo(String rutaGuardado){

            File archiNue = new File(rutaGuardado);
        try{
            FileWriter escribir = new FileWriter(archiNue,true);
            BufferedWriter leer = new BufferedWriter(escribir);
            PrintWriter esc = new PrintWriter(leer);
            
            esc.write(palabra);
            esc.println();
            
            esc.close();
            leer.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
