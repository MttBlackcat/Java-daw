/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Alumno
 */
public class FigurasGeometricas 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Cilindro cilindro = new Cilindro(2.5f, 10.0f);
        Cono cono = new Cono (2.5f, 10.0f);
        
        System.out.println("\nÁrea de la base del cilindro:  " + cilindro.areaBaseCilindro());
        System.out.println("Área lateral del cilindro:      " + cilindro.areaLateralCilindro());
        System.out.println("Área total del cilindro:        " + cilindro.areaTotalCilindro());
        System.out.println("Volumen del cilindro:           " + cilindro.volumenCilindro());
        
        System.out.println("\nLa longitud de la generatriz del cono:  " + cono.generatrizCono());
        System.out.println("Área de la base del cono:                " + cono.areaBaseCono());
        System.out.println("Área lateral del cono:                   " + cono.areaLateralCono());
        System.out.println("Área total del cono:                     " + cono.areaTotalCono());
        System.out.println("Volumen del cono:                        " + cono.volumenCono()+"\n\n");
    }
    
}
