/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclases1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EjemploClases1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int num1, num2;

        // Creación del objeto teclado
        Scanner teclado = new Scanner(System.in);

        // Referenciar e instanciar un objeto
        Operaciones numeros = new Operaciones(1,1);
        
        // Introducir números por teclado
        System.out.print("Introduce primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce segundo número: ");
        num2 = teclado.nextInt();
        Operaciones otros = new Operaciones(num1, num2);
        
        // Mostrar números
        System.out.println("La suma es " + numeros.suma());
        System.out.println("La suma es " + otros.suma());
        
        // Cambiar números
        numeros.setN1(11);
        numeros.setN2(22);
        System.out.println("La suma es " + numeros.suma());
        
    }
    
}

class Operaciones
{
    // Declaración de los atributos de la clase
    private int n1;
    private int n2;
    
    // Definir constructores
    Operaciones()
    {
    }
    
    Operaciones(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    // Métodos de la clase
    public int suma()
    {
        return getN1() + getN2();
    }
    
    public int resta()
    {
        return getN1() - getN2();
    }
    
    public void setN1(int n1)
    {
        this.n1 = n1;
    }
    
    public void setN2(int n2)
    {
        this.n2 = n2;
    }

    public int getN1() 
    {
        return n1;
    }

    public int getN2() 
    {
        return n2;
    }
    
    public int producto()
    {
        return n1*n2;
    }
    
     public int cociente()
    {
        return n1/n2;
    }
}