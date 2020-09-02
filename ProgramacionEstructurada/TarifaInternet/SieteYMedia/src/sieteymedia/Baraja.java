/*
*Clase que implementa la baraja de cartas de las partidas con un array de
*clase boolean que indica con un false si la carta a salido
*
*/
package sieteymedia;

/**
 *
 * @author dav
 */
public class Baraja 
{
    //Marcadores de la baraja
    boolean[][] cartas = new boolean[4][11];
    float[] puntos = new float[5];
    int[] partida = new int[5];
    int contadorPos = -1;
    int contadorPart = 0;
    float puntosB;
    float puntosJ;
    
    Baraja()
    {
        //Inicializamos las posiciones de la baraja
        for(int i = 0;i<4;i++)
        {
            //inicia a cero el array de partidas y puntos
            puntos[i]=0;
            partida[i]=0;
            for(int j=1;j<11;j++)
            {
                //inicia las cartas
                cartas[i][j]=true;
            }
        }
        puntosB=0f;
        
        
    }
    
    //Metodo que comprueba si se ha sacado la carta
    public boolean comprobarCarta(int palo, int numero)
    {
        return cartas[palo][numero];
    }
    
    //Valor de una carta
    public float valorCarta(int numero)
    {
        float valor;
        
        if(numero == 10 || numero == 9 || numero == 8)
        {
            valor = 0.5f;
        }
        else
        {
            valor = numero;
        }
        return valor;
    }
    
    //Reincia la baraja
    public void reiniciarBaraja()
    {
         for(int i = 0;i<4;i++)
        {
            for(int j=1;j<11;j++)
            {
                //reincia las cartas de la baraja
                cartas[i][j]=true;
            }
        }
       puntosB = 0f;
       
    }
    //Reestructurar el historico de puntos
    public void reestructurarPuntos(float puntuacion)
    {
        contadorPos++;
        contadorPart++;
        
        if(contadorPos==5)
        {
            contadorPos = 4;
            for(int i = 0; i < 4;i++)
            {
                puntos[i]=puntos[i+1];
                partida[i]=partida[i+1];
            }
            puntos[4]=puntuacion;
            partida[4]=contadorPart;
        }
        else
        {
            puntos[contadorPos]=puntuacion;
            partida[contadorPos]=contadorPart;
        }    
    }
    
    //Pone a false una carta para indicar que eya ha salido
    public void sacarCarta(int palo, int numero)
    {
        cartas[palo][numero]=false;
    }
    
    public float posibilidadSiete(float puntuacion)
    {
        int contador = 0;
        float salida = 0;
        float posibilidad;
        posibilidad = (7.5f - puntuacion)*10;
        
        switch((int)posibilidad)
        {
            case 5:
                for(int i = 0;i<4;i++)
                    for(int j = 8;j<11;j++)
                        if(cartas[j][i])
                        {
                            contador++;
                        }
                 break;
            case 10:
                 for (int i = 0; i<4; i++)
                {
                   if(cartas[i][1])  
                   contador++; 
                }
                break;
            case 15:
                break;
            case 20:
                 for (int i = 0; i<4; i++)
                {
                   if(cartas[i][2])  
                   contador++; 
                }
                break;
            case 25:
                break;
            case 30:
                 for (int i = 0; i<4; i++)
                {
                   if(cartas[i][3])  
                   contador++; 
                }
                break;
            case 35:
                break;
            case 40:
                 for (int i = 0; i<4; i++)
                {
                   if(cartas[i][4])  
                   contador++; 
                }
                break;
            case 45:
                break;
            case 50:
                 for (int i = 0; i<4; i++)
                {
                   if(cartas[i][5])  
                   contador++; 
                }
                break;
            case 55:
                break;
            case 60:
                 for (int i = 0; i<4; i++)
                {
                   if(cartas[i][6])  
                   contador++; 
                }
                break;
            case 65:
                break;
            case 70:
                 for (int i = 0; i<4; i++)
                {
                   if(cartas[i][7])  
                   contador++; 
                }
                break;
        }
        salida = contador*2.5f;
            
        return salida;
    }  
    public float  posibilidadPasarse(float puntuacion)
    {
        float salida = 0;
        int puntosPasar=(int)((7.5f-puntuacion)*10);
        
        
        
        for(int i = puntosPasar;i<=70; i=i+5 )
            {
                salida = salida + this.posibilidadSiete(salida);
            }
        return salida;
    }
    
    public void setpuntosJ(float ptos)
    {
        puntosJ = ptos;
    }
    
    public void setpuntosB(float ptos)
    {
        puntosB = ptos;
    }
    
    public float getPuntosB()
    {
        return puntosB;
    }
    
    public float getPuntosJ()
    {
        return puntosJ;
    }
}
