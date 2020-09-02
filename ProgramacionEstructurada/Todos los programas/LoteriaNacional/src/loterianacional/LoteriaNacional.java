/*
    Programa que saca por pantalla los tres numeros premiados de la loteria nacional
 */
package loterianacional;


public class LoteriaNacional {

    public static void main(String[] args) 
    {
        int num1,num2,num3;
        
        num1 = (int)(Math.random()*100000);
        System.out.println("Primer premio:  "+num1); 
        do{
        num2 = (int)(Math.random()*100000);
        System.out.println("Segundo premio: "+num2);
        }while(num1==num2);
        do{
        num3 = (int)(Math.random()*100000);
        System.out.println("Tercer premio:  "+num3);
        }while(num1==num3 || num2==num3);
        /*
        //Para comprobar algun numero del random
        for(int i=1;i<100000;i++)
        {
        num = (int)(Math.random()*100000);    
        if(num==0)
        {
            System.out.println("ha salio");
        }
        
        }
        */
    }
    
}
