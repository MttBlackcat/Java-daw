package prueba;

import java.util.Scanner;

public class Prueba 
{

    
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        String palabra;
        String codigo;
        int longitud;
        int i;
       
        palabra = MetePalabra();
        
        //System.out.print("Escribe :");
        //palabra = teclado.nextLine();
        
        
        longitud = palabra.length();
        
        for(i=0; i<longitud; i++)
        {
            codigo = Codigo(palabra.charAt(i));
            System.out.print(codigo+" ");
        }
        System.out.println("\n ");
    }

    static String MetePalabra()
    {
        String palabra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce palabra: ");
        palabra = teclado.nextLine();
        palabra = palabra.toUpperCase();
        return palabra;
    }

    static String Codigo(char letra)
       {
                String codigo;
                switch (letra)
                {
                    case 'A': case 'a':
                        codigo = ".-";
                        break;
                     case 'B':
                         codigo = "-...";
                        break;   
                     case 'C':
                        codigo = "-.-.";
                        break;
                     case 'D':
                        codigo = "-..";
                        break;   
                     case 'E':
                        codigo = ".";
                        break;
                     case 'F':
                        codigo = "..-.";
                        break;   
                     case 'G':
                        codigo = "--.";
                        break;
                     case 'H':
                        codigo = "....";
                        break;   
                     case 'I':
                        codigo = "..";
                        break;
                     case 'J':
                        codigo = ".---";
                        break;   
                     case 'K':
                        codigo = "-.-";
                        break;
                     case 'L':
                        codigo = ".-..";
                        break;   
                     case 'M':
                        codigo = "--";
                        break;
                     case 'N':
                        codigo = "-.";
                        break;   
                     case 'O':
                        codigo = "---";
                        break;
                     case 'P':
                        codigo = ".--.";
                        break;   
                     case 'Q':
                        codigo = "--.-";
                        break;
                     case 'R':
                        codigo = ".-.";
                        break;   
                     case 'S':
                        codigo = "...";
                        break;
                     case 'T':
                        codigo = "-";
                        break;   
                     case 'U':
                        codigo = "..-";
                        break;
                     case 'V':
                        codigo = "...-";
                        break;   
                     case 'W':
                        codigo = ".--";
                        break;
                     case 'X':
                        codigo = "-..-";
                        break;   
                     case 'Y':
                        codigo = "-.--";
                        break;
                     case 'Z':
                        codigo = "--..";
                        break;   
                     case '0':
                        codigo = "-----";
                        break;
                     case '1':
                        codigo = ".----";
                        break;   
                     case '2':
                        codigo = "..---";
                        break;
                     case '3':
                        codigo = "...--";
                        break;   
                     case '4':
                        codigo = "....-";
                        break;
                     case '5':
                        codigo = ".....";
                        break; 
                     case '6':
                        codigo = "-....";
                        break;   
                     case '7':
                        codigo = "--...";
                        break;
                     case '8':
                        codigo = "----..";
                        break;   
                     case '9':
                        codigo = "----.";
                        break;
                     case '.':
                        codigo = ".-.-.-";
                        break;   
                     case ',':
                        codigo = "--..--";
                        break;
                     case 'Ñ':
                        codigo = "--.--";
                        break;
                     default:
                         codigo = "*";
                }
        return codigo;
     }
}
