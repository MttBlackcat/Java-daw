
package desglosemoneda;

import java.util.Scanner;

    public class DesgloseMoneda 
    {



        public static void main(String[] args) 
        {

            Scanner teclado = new Scanner(System.in);

            float desglose;
            int cantCent;
            int cociente;

            System.out.println("Introduce la cantidad a desglosar ");
            desglose = teclado.nextFloat();

            cantCent = (int) (desglose*100);

            cociente = cantCent/50000;
            cantCent = cantCent%50000;

            if(cociente >0)
            {
               System.out.println(cociente +  cantBillete(cociente)+ " de 500 €"); 
            }


            cociente = cantCent/20000;
            cantCent = cantCent%20000;

            if(cociente >0)
            {
               System.out.println(cociente + cantBillete(cociente) +" de 200 €"); 
            }    

              cociente = cantCent/10000;
            cantCent = cantCent%10000;

            if(cociente >0)
            {
               System.out.println(cociente + cantBillete(cociente) +" de 100 €"); 
            }  

              cociente = cantCent/5000;
            cantCent = cantCent%5000;

            if(cociente >0)
            {
               System.out.println(cociente + " " + cantBillete(cociente) +" de 50 €"); 
            }  

            cociente = cantCent/2000;
            cantCent = cantCent%2000;

            if(cociente >0)
            {
               System.out.println(cociente + " " +cantBillete(cociente) +" de 20 €"); 
            }  

            cociente = cantCent/1000;
            cantCent = cantCent%1000;

            if(cociente >0)
            {
               System.out.println(cociente + " "+  cantBillete(cociente) +" de 10 €"); 
            }  

            cociente = cantCent/500;
            cantCent = cantCent%500;

            if(cociente >0)
            {
               System.out.println(cociente +" " +cantBillete(cociente)+ " de 5 €"); 
            }  

            cociente = cantCent/200;
            cantCent = cantCent%200;

            if(cociente >0)
            {
               System.out.println(cociente +" "+ cantMoneda(cociente)+ " de 2 €"); 
            }  

            cociente = cantCent/100;
            cantCent = cantCent%100;

            if(cociente >0)
            {
               System.out.println(cociente +" "+ cantMoneda(cociente)+ " de 1 €"); 
            }  

            cociente = cantCent/50;
            cantCent = cantCent%50;

            if(cociente >0)
            {
               System.out.println(cociente +" "+ cantMoneda(cociente)+ " de 50 centimos de €"); 
            }  

            cociente = cantCent/20;
            cantCent = cantCent%20;

            if(cociente >0)
            {
               System.out.println(cociente + " "+ cantMoneda(cociente)+ " de 20 centimos de €"); 
            }  

            cociente = cantCent/10;
            cantCent = cantCent%10;

            if(cociente >0)
            {
               System.out.println(cociente + " "+ cantMoneda(cociente)+ " de 10 centimos de €"); 
            }  

            cociente = cantCent/5;
            cantCent = cantCent%5;

            if(cociente >0)
            {
               System.out.println(cociente +" "+ cantMoneda(cociente)+ " de 5 centimos de €"); 
            }  


            cociente = cantCent/2;
            cantCent = cantCent%2;

            if(cociente >0)
            {
               System.out.println(cociente + " "+ cantMoneda(cociente)+ " de 2 centimos de €"); 
            }  

            cociente = cantCent/1;

            if(cociente >0)
            {
               System.out.println(cociente + " "+ cantMoneda(cociente)+ " de 1 centimo de €"); 
            }  

            
            
           
        }
    static String cantBillete(int cociente)
            {
                String cantidad;
                if(cociente==1)
                {
                    cantidad = "billete";
                }
                else
                {
                    cantidad = "billetes";
                            
                }
            return cantidad;
            }
    
      static String cantMoneda(int cociente)
            {
                String cantidad;
                if(cociente==1)
                {
                    cantidad = "moneda";
                }
                else
                {
                    cantidad = "monedas";
                            
                }
            return cantidad;
            }
        
}
