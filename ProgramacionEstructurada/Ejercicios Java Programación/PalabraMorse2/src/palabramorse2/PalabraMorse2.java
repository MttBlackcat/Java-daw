/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palabramorse2;

import java.util.Scanner;

public class PalabraMorse2 
{

    
    public static void main(String[] args) 
    {
        String palabra;
        int longitud;
        
        palabra = MetePalabra();
        longitud = palabra.length();
        System.out.println(longitud);
        
    }

static String MetePalabra()
{
    String palabra;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce palabra: ");
    palabra = teclado.nextLine();
    //palabra = palabra.toUpperCase();
    return palabra;
}

static String Codigo(char letra)
       {
                String codigo;
                switch (letra)
                {
                    case 'A': 
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
