/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocircunferencia;

import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class EjercicioCircunferencia 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner(System.in);
        
        Circunferencia circunf1 = new Circunferencia(2.0f);
        
        System.out.print("Introduce valor del radio: ");
        Circunferencia circunf2 = new Circunferencia(teclado.nextFloat());
        
        // Mostramos los valores
        System.out.printf("Longitud circunferencia 1: %.3f\n" ,circunf1.longitudCircunferencia());
        System.out.printf("Área circunferencia 1: %.3f\n"  ,circunf1.areaCirculo());
        System.out.printf("Volumen circunferencia 1: %.3f\n"  ,circunf1.volumenEsfera());
        System.out.printf("Longitud circunferencia 2: %.3f\n"  ,circunf2.longitudCircunferencia());
        System.out.printf("Área circunferencia 2: %.3f\n"  ,circunf2.areaCirculo());
        System.out.printf("Volumen circunferencia 2: %.3f\n\n"  ,circunf2.volumenEsfera());
    }
    
}
