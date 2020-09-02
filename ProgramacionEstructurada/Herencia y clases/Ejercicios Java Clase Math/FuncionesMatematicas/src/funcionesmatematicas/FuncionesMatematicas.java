
package funcionesmatematicas;


public class FuncionesMatematicas {


    public static void main(String[] args) 
    {
        int d;
        int i;
        double x, y, z, valor;
        double maxi, mini;
        
        
        valor = Math.random();
        i = Math.abs(-123);
        x = Math.round(123.567);
        y = Math.floor(123.567);
        z = Math.pow(2, 10);
        maxi = Math.max(x, y);
        mini = Math.min(x, y);
        
        System.out.println("Valor aleatorio = " + valor);
        System.out.println("Valor absoluto = " + i);
        System.out.println("Redondedo = " + x);
        System.out.println("Redondeo a la baja = " + y);
        System.out.println("Potencia = " + z);
        System.out.println("Máximo = " + maxi);
        System.out.println("Mínimo = " + mini);
    }
    
}
