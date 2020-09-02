/*
 Vamos a capturar la fecha del sistema
 */
package fechayhora;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaYHora 
{

    
    public static void main(String[] args) 
    {
     
        //Declaracion de variables
        int hora, minuto, segundo;
        int dia, mes, ano;
        int diaSemana;
        String diaSemanaEnLetra;
        
        //Creacion e inicializacion de objetos
        Calendar hms = new GregorianCalendar();
        Calendar dma = new GregorianCalendar();
        Calendar ds = new GregorianCalendar();
        
        //Captura de a hora del reloj interno
        hora= hms.get(Calendar.HOUR_OF_DAY);
        minuto = hms.get(Calendar.MINUTE);
        segundo = hms.get(Calendar.SECOND);
        
        System.out.println("Hora "+hora+":"+minuto+":"+segundo);
        System.out.printf("Hora %02d:%02d:%02d \n\n",hora,minuto,segundo);
        
        dia= dma.get(Calendar.DAY_OF_MONTH);
        //Enero es el mes 0 y diciembre el 11
        mes = dma.get(Calendar.MONTH)+1;
        ano = dma.get(Calendar.YEAR);
        
        System.out.println("Hora "+dia+"/"+mes+"/"+ano);
        System.out.printf("Hora %02d/%02d/%4d \n\n",dia,mes,ano);
        
        
        //La semana empieza en sabado
        diaSemana = ds.get(Calendar.DAY_OF_WEEK);
        
        switch(diaSemana)
        {
            case 0:  diaSemanaEnLetra = "sabado"; break;
            case 1:  diaSemanaEnLetra = "domingo"; break;
            case 2:  diaSemanaEnLetra = "lunes"; break;
            case 3:  diaSemanaEnLetra = "martes"; break;
            case 4:  diaSemanaEnLetra = "miercoles"; break;
            case 5:  diaSemanaEnLetra = "jueves"; break;
            case 6:  diaSemanaEnLetra = "Por fin es VIERNES"; break;       
            default: diaSemanaEnLetra = "";
        }
        
        System.out.println("Hoy es "+diaSemanaEnLetra+"\n");
        
    }  
    
    //Metodo que escribe en tres columnas un numero
    static String NumDig(int num)
    {
        String letra;
        letra="";
        switch(num)
        {
            case 0: letra = " _\n | |\n |_|";break;
            case 1: letra = "  \n   |\n   |"; break;
            case 2: letra = " _\n  _|\n |_ "; break;
            case 3: letra = " _\n  _|\n  _|"; break;
            case 4: letra = "  \n |_|\n   |"; break;
            case 5: letra = " _\n |_ \n  _|"; break;
            case 6: letra = " _\n |_ \n |_|"; break;
            case 7: letra = " _\n   |\n   |"; break;
            case 8: letra = " _\n |_|\n |_|"; break;
            case 9: letra = " _\n |_|\n  _|"; break;
        }
        return letra;
    }
    
}

